/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.censoControl;

import Controlador.Listas.DynamicList;
import Controlador.Dao.DaoImplement;
import Modelo.Censados;
import java.lang.reflect.Field;
import java.util.EmptyStackException;
import Controlador.Utiles.utiles;
/**
 *
 * @author Elias
 */
public class DatoCensoControl1 extends DaoImplement<Censados> {
      private DynamicList<Censados> censo;
    private Censados censo1;
     public DatoCensoControl1() {
        super(Censados.class);
    }

    public DynamicList<Censados> getCensos() {
        censo=all();
        return censo;
    }

    public void setCensos(DynamicList<Censados> censo) {
        this.censo = censo;
    }

    public Censados getCensos1() {
        if (censo1 == null) {
            censo1 = new Censados();
        }
        return censo1;
    }

    public void setCensos1(Censados censo1) {
        this.censo1 = censo1;
    }
    public Boolean persist(){
        censo1.setId(all().getLength()+ 1);
        return persist(censo1);
    }
   

   

}

