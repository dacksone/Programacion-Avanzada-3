/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package1.Laboratorio;

import javax.swing.JOptionPane;

/**
 *
 * @author DacksonE
 */
public class TestEjercicio1 {
    
    public static void main (String [] args){
        int x;
        x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
        
        Ejercicio1 test = new Ejercicio1(x);
        //JOptionPane.showInputDialog(test.Ejercicio1());
        test.calculo();
    }
}
