package grcy.sda.bank;

import java.util.Scanner;


public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rachunek rachunek = new Rachunek();
        System.out.println("czy chciałbyś założyć konto w banku ? y/n");
        String odpowiedz= scanner.nextLine();

//        switch (odpowiedz) {
//            case "y": {
//                rachunek.zalozenieRachunku();
//                // TODO: 25.09.2020 Stworzyć menu dostepnymi operacjami
//                break;
//            }
//            case "n": {
//                System.out.println("Dziekuję oraz zapraszamy ponownie");
//                break;
//            }
//        }
        rachunek.zalozenieRachunku();
        rachunek.getTypRachunku();
        rachunek.setTypRachunku("debetowy");
        rachunek.getTypRachunku();
        System.out.println("wpłacam 200 zł");
        rachunek.wplataNaRachunek(200);
        System.out.println("wpłacam dodaktowe 300 zł");
        rachunek.wplataNaRachunek(300);
        System.out.println("wyplacam 500, powinno zamknac rachunek");
        rachunek.wyplataZRachunku(500);
    }
}
