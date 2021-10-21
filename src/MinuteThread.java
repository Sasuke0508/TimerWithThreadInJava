public class MinuteThread extends Thread{
    private int minute;

    public  MinuteThread(int minute){
        this.minute = minute;
    }

    @Override
    public void run() {
        try {
            System.out.println("Call minute thread!");
            this.wait();
            minute++;
            if(minute == 3){
                minute = 0;
                notify();
            }
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getMinute() {
        return minute;
    }
}
