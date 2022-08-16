public class Clock {
    private int hours;
    private int minutes;

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public boolean initialize(int hours, int minutes) {
        if(hours >= 0 && minutes >= 0)
            if(hours < 24 && minutes < 60) {
                setHours(hours);
                setMinutes(minutes);
                return true;
            }
        return false;
    }

    
    public String atualizaVisor(){
        String hr;
        String min;

        if(getHours() < 10)
            hr = "0" + getHours(); 
        else
            hr = "" + getHours();
        
        if(getMinutes() < 10)
            min = "0" + getMinutes();
        else
            min = "" + getMinutes();
        
        return hr + ":" + min;
    }

    public String clockEvent(){
        if(getMinutes() + 1 < 60)
            setMinutes(getMinutes() + 1);
        else {
            setMinutes(0);
            if(getHours() + 1 < 24)
                setHours(getHours() + 1);
            else
                setHours(0);
        }
        
        return atualizaVisor();
    }

}
