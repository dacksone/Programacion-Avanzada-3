package Modelo;


import java.util.Random;

public class Numero {

    private  int numeroSistema;

    public Numero() {
        final int VALOR_MAXIMO = 100;
        Random rnd = new Random();
        this.numeroSistema = rnd.nextInt(VALOR_MAXIMO)+1;
    }
    public int obtenerNumero(){
        return numeroSistema;
    }


}
