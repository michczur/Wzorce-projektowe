package grcy.sda.patterns.behavioral.templateMethod;

public class EmailNewsProvider  extends NewsProvider {
    String email;

    public EmailNewsProvider(String email) {
        this.email = email;
    }

    @Override
    public boolean authorize(String autorizationData) {
        if(autorizationData.contains("@")) {
            return true;
        }
        return false;
    }

    @Override
    public boolean endConnection(String autorizationData) {
        return email.contains("@");
    }


}
