package grcy.sda.qa.exceptions;

public class TableException {


    public static void main(String[] args) {

        Integer[] intTable = new Integer[10];

        for (int i = 0; i < intTable.length + 5; i++) {
            intTable[i] = i;
        }
    }
}
