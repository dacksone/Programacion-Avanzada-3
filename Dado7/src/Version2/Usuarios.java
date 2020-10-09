package Version2;

import java.util.Scanner;

public class Usuarios {
    Scanner teclado;
    ReglasIniciales unaRI;
    String dUsuarios [][];

    public Usuarios() {
        this.unaRI = new ReglasIniciales();


    }

    public void cargar(){
        teclado=new Scanner(System.in);
        int filas= 3;
        //System.out.print("Cuantas columnas tiene la matriz:");
        int columnas=unaRI.getCantJugadores();

        dUsuarios=new String[filas][columnas];
        for(int f=0;f<unaRI.getCantJugadores();f++) {
            for(int c=0;c<dUsuarios[f].length;c++) {
                System.out.print("Ingrese componente:");

                dUsuarios[f][c]=teclado.next();
            }
        }
    }

    public void imprimir() {
        for(int f=0;f<unaRI.getCantJugadores();f++) {
            for(int c=0;c<dUsuarios[f].length;c++) {
                System.out.print(dUsuarios[f][c]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Usuarios asd = new Usuarios();
        asd.cargar();
        asd.imprimir();
    }
}
