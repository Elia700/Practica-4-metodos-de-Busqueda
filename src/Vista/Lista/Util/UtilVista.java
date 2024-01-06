/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Lista.Util;

import Modelo.Censo;
import Modelo.Censados;
import javax.swing.JComboBox;


/**
 *
 * @author Elias
 */
public class UtilVista {
    public static void CargarComboRolesL(JComboBox cbx)throws Exception{
        Controlador.CensoControl rc= new Controlador.CensoControl();
        cbx.removeAllItems();
         for (int i = 0; i < rc.getCenso().getLength(); i++) {
            cbx.addItem(rc.getCenso().getInfo(i));
        }
    }
    
    public static Censo ObtenerCensoControladorL(JComboBox cbx){
        return (Censo)cbx.getSelectedItem();
    }
    
}
