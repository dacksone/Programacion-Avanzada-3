/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package1.Laboratorio;

/**
 *
 * @author DacksonE
 */
public class Ejercicio1 {
    
    private int n;

    public Ejercicio1() {
    }

    public Ejercicio1(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public void calculo(){
        int resultado;
        
        if (n==0)
            System.out.println("ERROR-división por cero");
            else {
        resultado = n*(-1);
        //resultado = 1/10;
            System.out.println("El inverso de "+n+" es : " +resultado);
                    
    }
    
    
    
    }
    
    
    
}
