import java.util.Scanner;

public class Jugadores {

    int documento;
    String nombre;

    public Jugadores(int documento, String nombre) {
        this.documento = documento;
        this.nombre = nombre;
    }



    /*private Apuesta unaApuesta;
    private Reglas unaRegla;

    public Jugadores() {
        this.unaApuesta = new Apuesta();

    }

    public Reglas  SelecRegla(){
        int seleccion;

        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione una regla: ");
        System.out.println(
                "Opcion 1: Mayor que 7\n" +
                "Opcion 2: Igual a 7\n" +
                "Opcion 3: Menor a 7\n"
        );
        System.out.println("Ingrese la opcion");
        seleccion = sc.nextInt();
        if (seleccion==1){
            return Reglas.MAYOR;
        }else if (seleccion==2){
            return Reglas.IGUAl;
        } else {
            return Reglas.MENOR;
        }
    }

    public Apuesta getUnaApuesta() {
        return unaApuesta;
    }

    public Reglas getUnaRegla() {
        return unaRegla;
    }

    *//*public static void main(String[] args) {
        Jugadores asd = new Jugadores();
        System.out.println("Valor deapuesta: "+ asd.unaApuesta.getUnaApuesta());
        asd.SelecRegla();

    }*/

}
