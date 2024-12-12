/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestorprocesos;

import controladores.Controlador;
import javax.swing.ListSelectionModel;
import modelos.Modelo;
import vistas.Vista;

/**
 *
 * @author alumno
 */
public class GestorProcesos {
    public static void main(String[] args) {
        Vista vista = new Vista();
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(vista, modelo);
        
        vista.setVisible(true);
        vista.tblProcesos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        vista.btnActualizar.doClick();
    }
}
