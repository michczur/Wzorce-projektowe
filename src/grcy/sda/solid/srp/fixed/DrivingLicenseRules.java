package grcy.sda.solid.srp.fixed;

public class DrivingLicenseRules {

    private static final int DRIVING_LICENSE_REQUIRED_AGE = 18;

    public static boolean canGetDrivingLicense(Person person) {
        //return person.getAge() >= 18; w naszym kodzie 18 to jest MAGIC NUMBER
        return person.getAge() >= DRIVING_LICENSE_REQUIRED_AGE;
    }
}
