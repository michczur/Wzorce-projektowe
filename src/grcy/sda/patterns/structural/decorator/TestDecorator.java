package grcy.sda.patterns.structural.decorator;


public class TestDecorator {
    public static void main(String[] args) {
        Car basicCar = new BaseCar("Czerwony");
        basicCar.assemble();

        System.out.println("==================");
        Car basicCar2 = new BaseCar("żółty");
        Car sportCar = new SportPack(basicCar2, true, false);
        sportCar.assemble();


        System.out.println("==================");
        Car basicCar3 = new BaseCar("niebieski");
        WinterPack winterCar = new WinterPack(basicCar3, true, true);
        winterCar.assemble();


        System.out.println("==================");
        Car basicCar4 = new BaseCar("czarny");
        WinterPack winterCar2 = new WinterPack(basicCar4, true, false);
        SportPack sportCar2 = new SportPack(winterCar2, true, true);
        sportCar2.assemble();


        SportPack sportCar3 = new SportPack(
                                    new WinterPack(
                                        new BaseCar("czarny"), true, false)
                            , true, true);
        sportCar3.assemble();


    }
}
