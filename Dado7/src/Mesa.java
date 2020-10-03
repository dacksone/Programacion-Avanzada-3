public class Mesa {

    private Jugadores unJugador;
    double apuestaTotal=0;
    private Crupier unCrupier;
    int totalDados = 0;

    public Mesa() {
        this.unJugador = new Jugadores();
        this.unCrupier = new Crupier();
    }

    public double CompararApuesta(){

        apuestaTotal = unJugador.getUnaApuesta().getUnaApuesta();

        totalDados = unCrupier.lanzarDado();
        if (totalDados>7){
            apuestaTotal = apuestaTotal;
            return apuestaTotal;
        } else if (totalDados<7){
            apuestaTotal = apuestaTotal;
            return apuestaTotal;
        } else {
            apuestaTotal = apuestaTotal * 3;
            return apuestaTotal;
        }
    }

    public Reglas CompararReglas(){
        int totalDados = 0;
        totalDados = unCrupier.lanzarDado();
        if (totalDados>7){
            return Reglas.MAYOR;
        } else if (totalDados<7){
            return Reglas.MENOR;
        } else {
            return Reglas.IGUAl;
        }
    }


    public double getApuestaTotal() {
        return apuestaTotal;
    }

    public static void main(String[] args) {
        Mesa mesa1 = new Mesa();
        System.out.println(mesa1.unCrupier.lanzarDado());

        mesa1.CompararApuesta();
        mesa1.CompararReglas();

        System.out.println("El valor total es: "+mesa1.getApuestaTotal());
        System.out.println("La regla: " + mesa1.CompararReglas());

    }

}
