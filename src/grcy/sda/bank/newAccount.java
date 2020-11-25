package grcy.sda.bank;

import java.util.Scanner;

public class newAccount {
    Scanner scanner = new Scanner(System.in);
    Rachunek rachunek = new Rachunek();
    public newAccount() {
        System.out.println("podaj imie");
        rachunek.setImie(scanner.nextLine());
        System.out.println("podaj nazwikso");
        rachunek.setNazwisko(scanner.nextLine());
        System.out.println("w jakim banku ?");
        rachunek.setNazwa(scanner.nextLine());
        System.out.println("podaj pesel");
        rachunek.setPesel(scanner.nextInt());
        System.out.println("utworzono rachunek w banku "+rachunek.getNazwa()+"na Klienta "+rachunek.getImie()+' '+rachunek.getNazwisko());
    }
}
