/*
* 2. Leer el valor de un año e indicar si es o no un año bisiesto.
* Recordar la regla: "Un año es bisiesto si es divisible por 400,
* o bien si es divisible por 4 pero no por 100".
 */
package Punto2;

/**
 *
 * @author DacksonE
 */
public class Ejercicio2 {
    
    private int  ano;
    
    public Ejercicio2 (){
        this.ano = 2015;
        
    }

    public Ejercicio2(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
    
    public boolean esBisiesto()
    {
        boolean bisiesto = false;
        if (ano % 4 == 0)
        {
            if ((ano % 100 != 0) || (ano % 400 == 0))
            {
                bisiesto = true;
            } else 
                {
                    bisiesto = false;
                }
        } else {
            bisiesto = false;
        }
        return bisiesto;
        
    }
    
    
    
    
}
