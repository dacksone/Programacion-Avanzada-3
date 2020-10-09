package Version2;

import java.util.Scanner;

public class Union {
    Scanner teclado = new Scanner(System.in);
    ReglasIniciales unaRI;
    String dUsuarios [][];
    String titulos [] = {"Identificacion","Nombre","Valor de Apuesta","Ingrese apuesta","Resultado"};
    Usuarios2 unUsuario;
    Apuesta unaApuesta;

    public Union() {

        this.unaRI = new ReglasIniciales();
        //this.unUsuario = new Usuarios2();
        //this.unaApuesta = new Apuesta();
    }

    public void cargar(){
        teclado=new Scanner(System.in);
        int filas= unaRI.getCantJugadores();
        //System.out.print("Cuantas columnas tiene la matriz:");
        int columnas=5;

        dUsuarios=new String[filas][columnas];

        for(int f=0;f<filas;f++) {
            for(int c=0;c<(columnas-1);c++) {
                System.out.print("Ingrese"+ " "+titulos[c]+" del usuario:" );

                dUsuarios[f][c]=teclado.next();
            }
        }
    }

    public void imprimir() {
        for(int f=0;f<dUsuarios.length;f++) {
            for(int c=0;c<(dUsuarios[f].length);c++) {
                System.out.print(dUsuarios[f][c]+" ");
            }
            System.out.println();
        }
    }

    /*public static void main(String[] args) {
        Union asd = new Union();
        asd.cargar();
        asd.imprimir();
    }*/
}
