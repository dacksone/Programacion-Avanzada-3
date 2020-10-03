import java.util.Scanner;

public class Apuesta {
    double unaApuesta;

    public Apuesta() {
        System.out.println("Ingrese el valor de la apuesta: ");
        Scanner sc = new Scanner(System.in);
                this.unaApuesta = sc.nextDouble();
    }

    public double getUnaApuesta() {
        return unaApuesta;
    }
/*
    public static void main(String[] args) {
        Apuesta asd = new Apuesta();
        System.out.println("El valor ingresa es: "+ asd.getUnaApuesta());

    }*/
}
