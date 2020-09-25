package grcy.sda.patterns.structural.proxy;

import java.util.Arrays;
import java.util.List;

public class ProxyDemo {
    public static void main(String[] args) {
        CompanyEmployees companyEmployees = new CompanyEmployees();
        List<String> employeeList = Arrays.asList("Anna", "Jan", "Paweł");
        companyEmployees.setEmployees(employeeList);

        CompanyInternetNetwork internetNetwork = new ProxyCompanyInternetNetwork();
        internetNetwork.getAccess("Anna");
        internetNetwork.getAccess("Marian");
        internetNetwork.getAccess("Paweł");
        internetNetwork.getAccess("Igor");

    }
}
