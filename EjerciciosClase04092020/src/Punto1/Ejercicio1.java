/*
* 1. Leer un número entero n y calcular e imprimir su inverso 1/n.
* Considerar el caso especial del valor 0 , en cuyo caso el programa
* debera escribir el mensaje "ERROR - división por cero" 
 */
package Punto1;

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
    
    public String calculo(){
        int resultado = 0;
        
        if (n==0)
            //System.out.println("ERROR-división por cero");
            return Integer.toString(resultado);
            else {
        resultado = n*(-1);
        //resultado = 1/10;
            //System.out.println("El inverso de "+n+" es : " +resultado);
            return Integer.toString(resultado);
                    
    }
    
    
    
    }
    
    
    
}
