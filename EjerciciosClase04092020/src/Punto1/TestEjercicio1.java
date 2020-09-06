/*
* 1. Leer un número entero n y calcular e imprimir su inverso 1/n.
* Considerar el caso especial del valor 0 , en cuyo caso el programa
* debera escribir el mensaje "ERROR - división por cero"
 
 */
package Punto1;

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
        JOptionPane.showMessageDialog(null,"El valor inverso es: "+ test.calculo());
    }
}
