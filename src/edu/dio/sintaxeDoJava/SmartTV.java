package edu.dio.sintaxeDoJava;

public class SmartTV {
    private boolean ligada;
    private boolean mudo;
    private int canal;
    private int volume;

    public SmartTV(){
        ligada = false;
        mudo = false;
        canal = 1;
        volume = 0;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal < 1 || canal > 13){
            return;
        }
        this.canal = canal;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isMudo() {
        return mudo;
    }

    public void setMudo(boolean mudo) {
        this.mudo = mudo;
        if(mudo){
            volume = 0;
        }
    }

    public void aumentarVolume() {
        if (volume == 100){
            return;
        }
        mudo = false;
        volume++;
    }

    public void diminuirVolume() {
        if(volume == 0){
            return;
        }

        mudo = false;
        volume--;
    }

    public void aumentarCanal() {
        if (canal == 13){
            return;
        }
        canal++;
    }

    public void diminuirCanal() {
        if(canal == 1){
            return;
        }
        canal--;
    }

    public String toString(){
        return "Canal: " + canal + "\nVolume: " + volume + "\nMudo: " + mudo;
    }
}
