package grcy.sda.patterns.behavioral.templateMethod;

public class TemplateDemo {

    public static void main(String[] args) {

        NewsProvider provider = new EmailNewsProvider("aaa@bbb.ccc");
        provider.setMessage("Message one");
        provider.provideNews("aaa@bbb.ccc");

        provider.setMessage("alert!");
        provider.provideNews("aaa");
    }
}
