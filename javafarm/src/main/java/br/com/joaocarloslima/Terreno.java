package br.com.joaocarloslima;

public class Terreno {
    private Batata batata;
    private Morango morango;
    private Cenoura cenoura;
    private int x;
    private int y;

    public Terreno(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void plantar(Batata batata){
        
    }

    public void plantar(Cenoura cenoura){

    }

    public void plantar(Morango morango){

    }

    public void colher(Celeiro celeiro){

    }

    public boolean estaOcupado(){
        return true;
    }

    public Batata getBatata() {
        return batata;
    }

    public Morango getMorango() {
        return morango;
    }

    public Cenoura getCenoura() {
        return cenoura;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    


}
