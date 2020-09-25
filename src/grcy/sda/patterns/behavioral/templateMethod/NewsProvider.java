package grcy.sda.patterns.behavioral.templateMethod;

public abstract class NewsProvider {
    private int id;
    private String message;

    public abstract boolean authorize(String autorizationData);

    public final boolean sendMessage(String autorizationData) {
        System.out.println("Message sent: " + message);
        return true;
    }

    public abstract boolean endConnection(String autorizationData);

    public final void provideNews(String autorizationData){
        if(authorize(autorizationData)) {
            sendMessage(autorizationData);
            endConnection(autorizationData);
        }
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
