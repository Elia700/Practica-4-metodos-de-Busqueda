/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Controlador.Dao.DaoImplement;
import Controlador.Listas.DynamicList;
import Controlador.Utiles.utiles;
import Modelo.Censo;
import Modelo.Censados;
import java.lang.reflect.Field;
import java.util.EmptyStackException;

/**
 *
 * @author Elias
 */
public class DatoCensoControl extends DaoImplement<Censados>{
    
    private Censados censo;
    private DynamicList<Censados> censos;
    public DatoCensoControl() {
        super(Censados.class);

    }
   

    public Censados getTipo() {
       if(censo==null){
            censo=new Censados();
        }
        return censo;
    }

    public void setTipo(Censados censo) {
        this.censo = censo;
    }

    public DynamicList<Censados>Tipos() {
        return censos;
    }

    public void setTipos(DynamicList<Censados> censos) {
        this.censos = censos;
    }

    public Boolean guardar(){
        censo.setId(generarId());
        censos.add(censo);
        return true;
    }
    private Integer generarId(){
        return censos.getLength()+1;
  }
    
   
    
     public void imprimir(){
        System.out.println(censos.toString());
    }
     

    @Override
    public String toString() {
        return "DatoCensoControl{" + "censo=" + censo + ", censos=" + censos + '}';
    }
}
