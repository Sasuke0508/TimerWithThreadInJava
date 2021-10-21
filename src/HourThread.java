public class HourThread extends Thread{
    private int hour;

    public HourThread(int hour){
        this.hour = hour;
    }

    @Override
    public void run() {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hour++;
        if(hour == 24){
            hour = 0;
        }
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getHour() {
        return hour;
    }
}
