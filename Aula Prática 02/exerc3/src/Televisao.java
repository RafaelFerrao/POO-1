public class Televisao {
    private int volume;
    private int canal;
    final int MAXIMO_CANAIS = 200;
    
    Televisao(int volume, int canal){
        this.volume = volume;
        this.canal = canal;
    }
    
    public int getVolume() {
        return volume;
    }
    public int getCanal() {
        return canal;
    }

    public void aumentaVolume() {
        if(this.volume < 100)
            this.volume++;
    }

    public void diminuiVolume() {
        if(this.volume > 0)
            this.volume--;
    }

    public void subirCanal() {
        if(this.canal < this.MAXIMO_CANAIS)
            this.canal++;
        else
            this.canal = 0;
    }

    public void descerCanal() {
        if(this.canal > 0)
            this.canal--;
        else
            this.canal = this.MAXIMO_CANAIS;
    }

    public void trocarCanal(int canal){
        if(canal > 0 && canal < this.MAXIMO_CANAIS)
            this.canal = canal;
    }

    @Override
    public String toString(){
        return "Volume atual: " + this.volume + " | Canal atual: " + this.canal;
    }
}
