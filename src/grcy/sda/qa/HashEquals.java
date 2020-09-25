package grcy.sda.qa;

public class HashEquals {

    public static void main(String[] args) {
        String aaa = new String("aaa");

        String bbb = new String("bbb");

        System.out.println(aaa == "aaa");
        System.out.println(aaa.equals("aaa"));
        System.out.println(aaa.equals(new String("aaa")));
        System.out.println(aaa.equals(new String("aaa")));
        System.out.println(aaa.hashCode() == new String("aaa").hashCode());
    }
}
