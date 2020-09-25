package grcy.sda.patterns.structural.proxy;

public class PrivateCompanyInternetNetwork implements CompanyInternetNetwork {

    private String username;

    public PrivateCompanyInternetNetwork(String username) {
        this.username = username;
    }

    @Override
    public void getAccess(String username) {
        System.out.println("Access granted to Private Network for " + username);
    }
}
