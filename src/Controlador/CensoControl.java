/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Controlador.Listas.DynamicList;
import Controlador.Utiles.utiles;
import Modelo.Censados;
import Modelo.Censo;
import java.lang.reflect.Field;
import java.util.EmptyStackException;


/**
 *
 * @author Elias
 */
public class CensoControl {
     private DynamicList<Censo>censos;
  
    public CensoControl(){
        censos=new DynamicList<>();
        censos.add(new Censo(1, "Miedo","Inquietante, Atemorizante"));
        censos.add(new Censo(2, "Ansiedad","Nerviosa, Inquietante"));
        censos.add(new Censo(3, "Ira","Furiosa, Abrumadora"));
        censos.add(new Censo(4, "Tristeza"," Melancólica, Desgarradora"));
        censos.add(new Censo(5, "Verguenza","Doloroso, Excluyente"));
        censos.add(new Censo(6, "Ninguna","Tranquila"));
        
    }

    public DynamicList<Censo> getCenso() {
        return censos;
    }

    public void setCensos(DynamicList<Censo> censos) {
        this.censos = censos;
    }

   
    
}
