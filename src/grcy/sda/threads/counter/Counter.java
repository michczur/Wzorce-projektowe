package grcy.sda.threads.counter;

import static grcy.sda.threads.ThreadColor.*;

public class Counter {
    private int i;

    public void performCountdown() {
        String color;

        switch (Thread.currentThread().getName()) {
            case "Thread1" :
                color = ANSI_CYAN;
                break;
            case "Thread2" :
                color = ANSI_PURPLE;
                break;
            default:
                color = ANSI_BLUE;
        }

        //synchronized zapewnia że kod w tym bloku
        //wykona się w całości dla jednego wątku
        //i dopiero później będzie mógł być przejęty
        //przez inny wątek
        synchronized (this) {
            System.out.println(color + " Synchronized fragment start.");
            doRealCounting(color);
            System.out.println(color + " Synchronized fragment end. ");
        }
    }

    //private synchronized void doRealCounting(String color) {
    private void doRealCounting(String color) {
        for(i = 10; i > 0; i--) {
            System.out.println(color + Thread.currentThread().getName() + " , i = " + i);
        }
    }
}
