package Version2;

import java.util.Scanner;

public class ReglasIniciales {

    double topeMaximo;
    int cantJugadores;
    int tresOCuatro;
    double baseCasino;

    public ReglasIniciales() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el tope Maximo de las apuestas:");
        this.topeMaximo = teclado.nextDouble();
        System.out.println("Ingrese la cantidad de jugadores: ");
        this.cantJugadores = teclado.nextInt();
        System.out.println("Ingrese el tipo de apuesta 1-> 3 a 1 , 2-> 4 a 1:");
        this.tresOCuatro = teclado.nextInt();
    }

    public double getTopeMaximo() {
        return topeMaximo;
    }

    public void setTopeMaximo(double topeMaximo) {
        this.topeMaximo = topeMaximo;
    }

    public int getCantJugadores() {
        return cantJugadores;
    }

    public void setCantJugadores(int cantJugadores) {
        this.cantJugadores = cantJugadores;
    }

    public int getTresOCuatro() {
        return tresOCuatro;
    }

    public void setTresOCuatro(int tresOCuatro) {
        this.tresOCuatro = tresOCuatro;
    }

    public double getBaseCasino() {
        return baseCasino;
    }

    public void setBaseCasino(double baseCasino) {
        this.baseCasino = baseCasino;
    }
}
