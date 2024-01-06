/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Lista.Tabla;

import Controlador.Listas.DynamicList;
import Modelo.Censados;
import Modelo.Censados;
import Vista.Censador;
import javax.swing.event.EventListenerList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Elias
 */
public class ModeloTablaCenso extends AbstractTableModel  {
     private DynamicList<Censados> censos;

    public DynamicList<Censados> getCensos() {
        return censos;
    }

    public void setCensos(DynamicList<Censados> censos) {
        this.censos = censos;
    }
     public ModeloTablaCenso() {
        this.censos=new DynamicList<>();
    }
    @Override
    public int getRowCount(){
        return censos.getLength();
        
    }
    @Override
    public int getColumnCount() {
       // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       return 6;
    }
    @Override
    public String getValueAt(int i,int i1){
      
        try {
            Censados p = censos.getInfo(i);
            
        switch(i1){
            case 0: return (p !=null) ? p.getNombreCp():" ";   //modelos ternarios
            case 1: return (p !=null) ? p.getFecha():" ";
            case 2: return (p !=null) ? p.getEstado_censo():" ";
            case 3: return (p !=null) ? p.getId_censo().getNombre_censo():" ";
            case 4: return (p !=null) ? p.getMotivo_divorcio():" ";
            case 5: return (p !=null) ? p.getCensador():" ";
            default:
                return null;
        }
         } catch (Exception e) {
        }
        return null;
    }
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nombre Completo";
                 case 1:
                return "Fecha";
                case 2:
                return "Estado Censo";
                case 3:
                    return "Estado";
                case 4:
                    return "Motivo";
                      case 5:
                    return "Censador";
           
            default:
                return null;

        }
    }
    
    
}
