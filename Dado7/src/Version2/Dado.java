package Version2;

import java.util.Random;

public class Dado {
    private int dado;

    public Dado() {
        final int VALOR_MAXIMO = 6;
        Random rnd = new Random();
        this.dado = rnd.nextInt(VALOR_MAXIMO)+1;

    }

    public int getDado() {
        return dado;
    }



}
