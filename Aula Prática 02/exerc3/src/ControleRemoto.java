public class ControleRemoto {

    private Televisao tv;

    ControleRemoto(Televisao tv){
        this.tv = tv;
    }

    public void aumentaVolume(){
        tv.aumentaVolume();
    }

    public void diminuiVolume(){
        tv.diminuiVolume();
    }

    public void subirCanal(){
        tv.subirCanal();
    }

    public void descerCanal() {
        tv.descerCanal();
    }

    public void trocarCanal(int canal) { 
        tv.trocarCanal(canal);
    }

    //

    @Override
    public String toString(){
        return tv.toString();
    }
}
