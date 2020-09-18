package grcy.sda.threads.basics;

import static grcy.sda.threads.ThreadColors.ANSI_BLUE;


public class OtherThread extends Thread {
    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Another thread in action");
        System.out.println(ANSI_BLUE + currentThread().getName());

        try {
            sleep(4000);
            System.out.println(ANSI_BLUE + "Enough sleeping, back to work");
        } catch (InterruptedException e){
            System.out.println(ANSI_BLUE + "Interrupted, could not sleep enough !");
        }
    }
}
