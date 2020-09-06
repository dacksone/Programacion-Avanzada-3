/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;

import javax.swing.JOptionPane;

/**
 *
 * @author DacksonE
 */
public class TestEjercicio2 {

    private static Ejercicio2 unBisiesto;

    public TestEjercicio2() {
        this.unBisiesto = new Ejercicio2();
    }

    public String Imprimir() {
        int a;
        String resultado;
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un año"));
        //System.out.println(a);
        unBisiesto.setAno(a);
        if (unBisiesto.esBisiesto()) {
            //System.out.println(unBisiesto.getAno() + " Es un numero bisiesto");
            resultado = "El año ingresado: " + unBisiesto.getAno() + " es un numero bisiesto";
        } else {
            resultado = "El año ingresado: " + unBisiesto.getAno() + " no es un numero bisiesto";
        }
        return resultado;

    }

    public static void main(String[] args) {

        TestEjercicio2 prueba = new TestEjercicio2();
        JOptionPane.showMessageDialog(null, prueba.Imprimir());

    }
}
