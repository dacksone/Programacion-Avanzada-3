package Version2;

public class Crupier {
    Dado dadoUno;
    Dado dadoDos;

    public Crupier(Dado dadoUno, Dado dadoDos) {
        this.dadoUno = new Dado();
        this.dadoDos = new Dado();
    }

    public int lanzarDado(){
        return dadoUno.getDado() + dadoDos.getDado();
    }

}
