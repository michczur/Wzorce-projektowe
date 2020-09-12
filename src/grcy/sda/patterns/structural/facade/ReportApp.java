package grcy.sda.patterns.structural.facade;

import java.sql.Connection;

public class ReportApp {
    public static void main(String[] args) {

        System.out.println("Report generation classic way");
        //MySQL
        Connection mySQLconnection = MySQLReportGenerator.getMySQLDBConnection();
        MySQLReportGenerator mySQLReportGenerator = new MySQLReportGenerator();
        mySQLReportGenerator.generatePDFReportFromMySQL("Customers", mySQLconnection);

        //Facade
        ReportProvider.generateReport(ReportProvider.DBType.ORACLE, ReportProvider.ReportType.PDF,"Customers");

        //ReportProvider.generateReport(getCustomerDBConnection(), ReportProvider.ReportType.PDF,"Customers");
    }
}
