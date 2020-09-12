package grcy.sda.patterns.structural.facade;

import java.sql.Connection;

public class MySQLReportGenerator {
    public static Connection getMySQLDBConnection() {
        System.out.println("Retrive connection to MySQL database");
        return null;
    }

    public void generatePDFReportFromMySQL(String table, Connection connection) {
        System.out.println("Creating PDF report from " + table + " table on MySQL database");
    }


    public void generateHTMLReportFromMySQL(String table, Connection connection) {
        System.out.println("Creating HTML report from " + table + " table on MySQL database");
    }


}
