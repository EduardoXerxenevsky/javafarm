package br.com.joaocarloslima;

public class Batata {

    private int tamanho=1;
    private int tempoDeVida=1;
    private int tempoDeCrescimento=3;

    public void crescer(){
    
        tempoDeVida++;
        if(tempoDeVida%tempoDeCrescimento==0){
            tamanho++;
        }
    
    }

    public boolean podeColher(){
        
        if(tamanho==4) {
            return true;
        }
        return false;
    }

    public String getImagem(){
        return "images/batata" + tamanho + ".png";
    }

}
