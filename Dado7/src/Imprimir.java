import java.util.Scanner;

public class Imprimir {
    public Scanner sc;

    public Imprimir() {
        this.sc = new Scanner(System.in);
    }

    public  void imprimirDatos(String mensaje){
        System.out.println(mensaje);
    }

    public int leerDatos(){
        return sc.nextInt();
    }

}
