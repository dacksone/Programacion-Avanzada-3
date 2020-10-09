package Version2;

import java.util.Scanner;

public class Apuesta {
    double valorApostar;
    int DescApuesta;
    boolean resultado ;

    public Apuesta() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor de la apuesta: ");
        this.valorApostar = teclado.nextDouble();
        System.out.println("Ingrese su apuesta 1 ->Mayor\n" +
                "2->Menor\n" +
                "3->Igual");
        DescApuesta = teclado.nextInt();
        //this.resultado = false;

    }

    public double getValorApostar() {
        return valorApostar;
    }

    public void setValorApostar(double valorApostar) {
        this.valorApostar = valorApostar;
    }

    public int getDescApuesta() {
        return DescApuesta;
    }

    public void setDescApuesta(int descApuesta) {
        DescApuesta = descApuesta;
    }
}
