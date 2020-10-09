package Version2;

import java.util.Scanner;

public class Usuarios2 {
    //ReglasIniciales unaRI;
    int identificacion;
    String nombre;

    public Usuarios2() {
        Scanner teclado = new Scanner(System.in);
        //this.unaRI = new ReglasIniciales();
        System.out.println("Ingrese identificacion:");
        this.identificacion = teclado.nextInt();
        System.out.println("Ingrese nombre:");
        this.nombre = teclado.next();
    }

    /*public ReglasIniciales getUnaRI() {
        return unaRI;
    }

    public void setUnaRI(ReglasIniciales unaRI) {
        this.unaRI = unaRI;
    }*/

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*public static void main(String[] args) {
        Usuarios2 asd = new Usuarios2();
        System.out.println(asd.getIdentificacion());
        System.out.println(asd.getNombre());
        System.out.println(asd.unaRI);
    }*/
}
