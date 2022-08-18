public class Time {
    private int hours;
    private int minutes;

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    private void setHours(int hours) {
        if (hours >= 0 && hours <= 23)
            this.hours = hours;
        else
            this.hours = 0;
    }

    private void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 59)
            this.minutes = minutes;
        else
            this.minutes = 0;
    }

    public void timeEvent(){
        if(this.getMinutes() + 1 < 60)
            this.setMinutes(this.getMinutes() + 1);
        else {
            this.setMinutes(0);
            if(this.getHours() + 1 < 24)
                this.setHours((this.getHours() + 1));
            else
                this.setHours(0);
        }
    }

    Time(int h, int m) {
        setMinutes(m);
        setHours(h);
    }
}
