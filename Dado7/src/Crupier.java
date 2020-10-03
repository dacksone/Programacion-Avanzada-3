public class Crupier {
    private Dado dadoUno;
    private Dado dadoDos;
    //private Jugadores unJugador;
    private Imprimir inOut;


    public Crupier() {
        this.dadoUno = new Dado();
        this.dadoDos = new Dado();
        //this.unJugador = new Jugadores();

    }

    public int lanzarDado(){
        return dadoUno.getDado() + dadoDos.getDado();
    }

    /*public double SumarApuestas(){
        return unJugador.getUnaApuesta().getUnaApuesta();
    }*/




    /*public Reglas Comparar(){
        if (lanzarDado()>7){
            return Reglas.MAYOR;
        } else if (lanzarDado()<7){
            return Reglas.MENOR;
        } else {
            return Reglas.IGUAl;
        }
    }*/


   /* public static void main(String[] args) {
        int resultado = 0;
        double apuesta;
        System.out.println("Que comience el Juego");
        System.out.println("Antes que todo por favor participantes digan sus apuestas.");
        Crupier app = new Crupier();
        apuesta = app.ObtenerApuesta();

        *//*System.out.println("El valor de la apuesta es: "+ app.unJugador.getUnaApuesta());
        System.out.println("Se lanzan los dados y el numero es.....");
        System.out.println("...");
        System.out.println("..");
        System.out.println(".");*//*

        resultado= app.lanzarDado();
        if (app.unJugador.SelecRegla() == app.Comparar()) {

            System.out.println("Felicidades, ha caido : "+ app.lanzarDado() + " , has ganado: " +apuesta );
        } else {

        } System.out.println("Lastimosamente no has ganado, ha caido : "+ app.lanzarDado() + " la casa gana"+ apuesta );
    }*/


}
