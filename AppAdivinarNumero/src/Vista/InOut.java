package Vista;

import java.util.Scanner;

public class InOut {
    public Scanner sc;

    public InOut() {
        this.sc = new Scanner(System.in);
    }

    public  void imprimirDatos(String mensaje){
        System.out.println(mensaje);
    }

    public int leerDatos(){
        return sc.nextInt();
    }

}

