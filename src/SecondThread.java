public class SecondThread extends Thread{
    private int second;

    public SecondThread(int second){
        this.second = second;
    }

    @Override
    public void run() {
        try {
            while(true){
                Thread.sleep(1000);
                second++;
                if(second == 3) {
                    second = 0;
                    notify();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getSecond() {
        return second;
    }
}
