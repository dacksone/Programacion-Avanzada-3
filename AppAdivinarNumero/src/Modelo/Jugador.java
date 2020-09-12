package Modelo;

public class Jugador {
    private Numero unNumero;

    public Jugador() {
        this.unNumero = new Numero();
    }

    public Pista evaluarNumero(int numeroIntento){

        int resta = unNumero.obtenerNumero()-numeroIntento;
        if (resta<0) {
            return Pista.ALTO;
        } else if (resta > 0){
            return Pista.BAJO;
        } else {
            return Pista.IGUAL;
        }
    }

}
