package grcy.sda.threads.basics;

import static grcy.sda.threads.ThreadColors.*;
import static java.lang.Thread.sleep;

public class MainThread {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "main thread in action");

        OtherThread otherThread = new OtherThread();

        // uruchamiamy wątek metodą start a nie run
        // bo run nie odpala kodu w nowym watku tylko kontynuje w bieżacym
        otherThread.setName("===!!! Nowy zajefajny watek do zadan specjanych !!!===");
        otherThread.start();
        //otherThread.run(); // nie odpalamy osobnego watku tylko odpala kod metody w ramach biezacego

        Thread runnableSample = new Thread(new RunnableSample());
        runnableSample.start();

        // watek w klasie anonimowej
        // najczesciej do uruchamiania jednorazowego
        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Anonymous class thread in action");

                //łączenie wątków metodą join()
               // otherThread.join(); // zaczekaj na dalsze wykonywanie nadpisanej RunnableSample
                // do momentu az skonczy sie wykonywać otherThread
                System.out.println(ANSI_RED+"Other thread finished so overwritten RunnableSample works again");

            }
        }.start();
        try {
            //usypiamy main thread na 2s
            sleep(2000);
            //otherThread.interrupt();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        runnableSample = new Thread(new RunnableSample() {
            @Override
            public void run() {
                System.out.println(ANSI_RED+ "Overridden RunnableSample working!");
            }
        });
        runnableSample.start();

        System.out.println(ANSI_PURPLE + "End of main thread");

    }
}
