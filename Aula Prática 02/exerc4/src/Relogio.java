public class Relogio {

    private Time time;

    Relogio(Time t){
        this.time = t;
    }

    public String atualizaVisor(){

        this.time.timeEvent();

        String hr;
        String min;

        if(this.time.getHours() < 10)
            hr = "0" + this.time.getHours(); 
        else
            hr = "" + this.time.getHours();
        
        if(this.time.getMinutes() < 10)
            min = "0" + this.time.getMinutes();
        else
            min = "" + this.time.getMinutes();
        
        return hr + ":" + min;
    }

    

}
