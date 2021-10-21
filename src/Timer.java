public class Timer implements Runnable{
    private SecondThread secondThread;
    private MinuteThread minuteThread;
    private HourThread hourThread;

    public Timer(){
        this.secondThread = new SecondThread(0);
        this.minuteThread = new MinuteThread(0);
        this.hourThread = new HourThread(0);
    }

    @Override
    public void run() {
        secondThread.start();
        minuteThread.start();
        hourThread.start();
        int second = 0, minute = 0, hour = 0;

        while(true){
            System.out.println("Second State: " + secondThread.getState());
            System.out.println("Minute State: " +minuteThread.getState());
            System.out.println("Hour State: " +hourThread.getState());
            second = secondThread.getSecond();
            minute = minuteThread.getMinute();
            hour = hourThread.getHour();
            System.out.println(hour + ":" + minute + ":" + second);
        }
    }

    public static void main(String[] args) {
        new Timer().run();
    }
}
