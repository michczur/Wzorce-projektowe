package grcy.sda.patterns.structural.facade;

import java.sql.Connection;

public class OracleReportGenerator {


    public static Connection getOracleDBConnection() {
        System.out.println("Retrive connection to Oracle database");
        return null;
    }

    public void generatePDFReportFromOracle(String table, Connection connection) {
        System.out.println("Creating PDF report from " + table + " table on Oracle database");
    }


    public void generateHTMLReportFromOracle(String table, Connection connection) {
        System.out.println("Creating HTML report from " + table + " table on Oracle database");
    }

}
