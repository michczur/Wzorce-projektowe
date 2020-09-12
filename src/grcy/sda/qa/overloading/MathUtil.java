package grcy.sda.qa.overloading;


/**
 * W klasie przeciążymy metodę sum tak, aby za każdym razem były inne parametry wejsciowe
 *
 * to mogą być zarówno inne typy parametrów jak i różna liczba parametrów
 *
 */

public class MathUtil {

    public long sum(long arg1, long arg2) {
        System.out.println("=====!! Sumujemy longi !!=====");
        return arg1 + arg2;
    }

    //przeciążona metoda sum
    public int sum(int arg1, int arg2) {
        System.out.println("=====!! Sumujemy inty !======");
        return arg1 + arg2;
    }

    public static void main(String[] args) {
        MathUtil util = new MathUtil();

        System.out.println("Suma intów");
        System.out.println(util.sum(2, 3));

        System.out.println("Suma longów");
        System.out.println(util.sum(4L, 3L));
    }
}
