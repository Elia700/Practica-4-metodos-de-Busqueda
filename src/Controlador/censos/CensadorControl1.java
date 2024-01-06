/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.censos;

import Controlador.Dao.DaoImplement;
import Controlador.Listas.DynamicList;
import Controlador.Utiles.utiles;
import Modelo.Censador;
import Modelo.Censados;
import java.lang.reflect.Field;
import java.util.EmptyStackException;

/**
 *
 * @author Elias
 */
public class CensadorControl1 extends DaoImplement<Censador> {

    private DynamicList<Censador> listR = new DynamicList<>();
    private Censador censador;

    public CensadorControl1() {
        super(Censador.class);
    }

    public DynamicList<Censador> getCensadores() {
        return listR = all();
    }

    public void setListR(DynamicList<Censador> listR) {
        this.listR = listR;
    }

    public Censador getCensador() {
        if (censador == null) {
            censador = new Censador();
        }
        return censador;

    }

    public void setCensador(Censador censador) {
        this.censador = censador;
    }

    public Boolean persit() {
        censador.setId(all().getLength() + 1);

        return persist(censador);
    }

    public DynamicList<Censador> ordenar(DynamicList<Censador> lista, Integer tipo, String field) throws Exception, Exception {
        Field attribute = utiles.getField(Censador.class, field);
        Integer n = lista.getLength();
        Censador[] censadores = lista.toArray();
        if (attribute != null) {
            for (int i = 0; i < n; i++) {
                int k = i;
                Censador t = censadores[i];
                for (int j = i + 1; j < n; j++) {
                    if (censadores[j].compare(t, field, tipo)) {
                        t = censadores[j];
                        k = j;
                    }
                }
                censadores[k] = censadores[i];
                censadores[i] = t;
            }
        } else {
            throw new Exception("No existe el criterio de busqueda");
        }
        return lista.toList(censadores);
    }

    public DynamicList<Censador> buscarPorCriterio(String texto, DynamicList<Censador> censador, String criterio, boolean usarBusquedaBinaria) {
        if (usarBusquedaBinaria) {
            return buscarPorCriterioBinario(texto, censador, criterio);
        } else {
            return buscarPorCriterioLineal(texto, censador, criterio);
        }
    }

    private String obtenerValorPorCriterio(Censador censador, String criterio) {
        switch (criterio.toLowerCase()) {
            case "apellido":
                return censador.getApellido().toLowerCase();
            case "nombre":
                return censador.getNombre().toLowerCase();
            case "edad":
                return String.valueOf(censador.getEdad());
            case "numero":
                return String.valueOf(censador.getNumero());
            default:
                throw new IllegalArgumentException("Criterio no válido");
        }
    }

    public DynamicList<Censador> buscarPorCriterioLineal(String texto, DynamicList<Censador> censador, String criterio) {
        DynamicList<Censador> lista = new DynamicList<>();

        try {
            Censador[] aux = ordenar(censador, 0, criterio).toArray();

            for (Censador p : aux) {
                String valor = obtenerValorPorCriterio(p, criterio).toLowerCase();
                if (valor.contains(texto.toLowerCase())) {
                    lista.add(p);
                }
            }
        } catch (Exception e) {
            System.err.println("Error en buscar" + e.getMessage());
        }

        return lista;
    }

    public DynamicList<Censador> buscarPorCriterioBinario(String texto, DynamicList<Censador> censador, String criterio) {
        DynamicList<Censador> lista = new DynamicList<>();
        try {
            Censador[] aux = ordenar(censador, 0, criterio).toArray();
            int inicio = 0;
            int fin = aux.length - 1;
            while (inicio <= fin) {
                int medio = (inicio + fin) / 2;
                Censador p = aux[medio];
                String valorCriterio = obtenerValorPorCriterio(p, criterio).toLowerCase();
                if (valorCriterio.contains(texto.toLowerCase())) {
                    lista.add(p);
                }
                if (valorCriterio.compareTo(texto.toLowerCase()) < 0) {
                    inicio = medio + 1;
                } else {
                    fin = medio - 1;
                }
            }
        } catch (Exception e) {
            System.out.println("No existe el valor a comparar");
        }

        return lista;
    }
}
