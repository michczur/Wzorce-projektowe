package grcy.sda.threads.basics;

import static grcy.sda.threads.ThreadColor.*;
import static java.lang.Thread.sleep;

public class MainThread {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Main thread in action");

        OtherThread otherThread = new OtherThread();
        //uruchamiamy wątek metodą start() a nie run()
        //bo run() nie odpala kodu w nowym wątku tylko kontynuuje w bieżącym
        otherThread.setName("==== !!! Nowy zajefajny wątek do zadań specjalnych !!! ====");
        otherThread.start(); //
        //otherThread.run(); //tak nie odpalamy osobnego wątku tylko po prostu kod metody w osobnej klasie

        Thread runnableSample = new Thread(new RunnableSample());
        runnableSample.start();

        //wątek na klasie anonimowej
        //najczęściej do uruchamiania jednorazowego
        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Anonymous class thread in action");
            }
        }.start();

        try {
            //usypiamy main thread na 2s
            sleep(2000);
            //otherThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //wątek na nadpisanej definicji RunnableSample
        //bo w tym miejscu chcemy żeby kod zadziałał trochę inaczej
        runnableSample = new Thread(new RunnableSample() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Overridden RunnableSample working!");

                //łączenie wątków metodą join()
                try {
                    otherThread.join(); //zaczekaj na dalsze wykonywanie nadpisanej RunnableSample
                    //do momentu aż skończy się wykonywać otherThread
                    System.out.println(ANSI_RED + "Other thread finished so Overwritten RunnableSample works again");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "Overwritten RunnableSample interrupted");
                }

            }
        });
        runnableSample.start();
        runnableSample.interrupt();

        System.out.println(ANSI_PURPLE + "End of main thread");
    }
}
