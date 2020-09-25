package grcy.sda.threads.counter;

public class ThreadCounter extends Thread {
    private Counter counter;

    public ThreadCounter(Counter counter) {
        //super(); nie widać ale jest
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.performCountdown();
    }
}
