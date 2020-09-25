package grcy.sda.threads.counter;

public class CounterThreadTest {

    public static void main(String[] args) {
        Counter counter = new Counter();

        ThreadCounter threadCounter1 = new ThreadCounter(counter);
        ThreadCounter threadCounter2 = new ThreadCounter(counter);

        threadCounter1.setName("Thread1");
        threadCounter2.setName("Thread2");

        threadCounter1.start();
        threadCounter2.start();
    }
}
