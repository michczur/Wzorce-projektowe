package grcy.sda.threads.basics;

import static grcy.sda.threads.ThreadColor.ANSI_RED;

public class RunnableSample implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Runnable sample in action!");
    }
}
