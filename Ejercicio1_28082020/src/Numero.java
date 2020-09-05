

import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DacksonE
 */
public class Numero {
    
    private int numeroSistema;
    
    public Numero(){
        Random rnd = new Random();
        final int VALOR_MAXIMO=100;
        this.numeroSistema = rnd.nextInt(VALOR_MAXIMO);
                   
    }
    
    public int getNumeroSistema(){
        return numeroSistema;
    }
    
    public static void main(String  [] args){
        Numero asd = new Numero();
        System.out.println(asd.getNumeroSistema());
    }
    
}
