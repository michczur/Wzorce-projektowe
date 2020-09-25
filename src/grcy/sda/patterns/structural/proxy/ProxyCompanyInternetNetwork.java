package grcy.sda.patterns.structural.proxy;

public class ProxyCompanyInternetNetwork implements CompanyInternetNetwork {

    CompanyInternetNetwork companyInternetNetwork;

    @Override
    public void getAccess(String username) {
        if(isEmployee(username)) {
            companyInternetNetwork = new PrivateCompanyInternetNetwork(username);
        } else {
            companyInternetNetwork = new PublicCompanyInternetNetwork(username);
        }
        companyInternetNetwork.getAccess(username);
    }

    private boolean isEmployee(String username) {
        return CompanyEmployees.isEmployee(username);
    }
}
