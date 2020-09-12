package Control;

import Modelo.Jugador;
import Modelo.Pista;
import Vista.InOut;

public class AppAdivinaUnNumero {

    private Jugador unJugador;
    private InOut interfaz;

    public AppAdivinaUnNumero() {
        this.unJugador = new Jugador();
        this.interfaz = new InOut();
    }

    public void jugar(){
        interfaz.imprimirDatos("Estoy pensando en un numero entre 1 y 100");
        Pista unaPista = null;
        int intentos = 1;
        while (unaPista != Pista.IGUAL){
            interfaz.imprimirDatos("Cual cree qué es?");
            int intento = interfaz.leerDatos();
            unaPista = unJugador.evaluarNumero(intento);
            interfaz.imprimirDatos("Tu intento es: "+ unaPista);
            intentos++;
        }
        interfaz.imprimirDatos("!Felicitaciones, adivino el numero despues de " + intentos+ " intentos !");
    }

    public static void main(String[] args) {
        AppAdivinaUnNumero app = new AppAdivinaUnNumero();

        app.jugar();
    }
}
