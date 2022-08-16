public class ControleRemoto {

    private Televisao tv;

    public void setTv(Televisao tv) {
        this.tv = tv;
    }

    public void aumentaVolume() {
        if(tv.getVolume() < 100)
            tv.setVolume(tv.getVolume() + 1);
    }

    public void diminuiVolume() {
        if(tv.getVolume() > 0)
            tv.setVolume(tv.getVolume() - 1);
    }

    public void subirCanal() {
        tv.setCanal(tv.getCanal() + 1);
    }

    public void descerCanal() {
        if(tv.getCanal() > 0)
            tv.setCanal(tv.getCanal() - 1);
    }

    public void trocarCanal(int canal) { 
        tv.setCanal(canal);
    }

    @Override
    public String toString(){
        return "Volume atual: " + tv.getVolume() + " | Canal atual: " + tv.getCanal(); 
    }
}
