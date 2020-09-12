package grcy.sda.patterns.structural.facade;

import java.sql.Connection;

public class ReportProvider {

    public enum DBType {
        MYSQL,
        ORACLE
    }

    public enum ReportType {
        HTML,
        PDF
    }

    public static void generateReport(DBType dbType, ReportType reportType, String table) {
        Connection connection = null;

        switch (dbType) {
            case ORACLE:
                connection = OracleReportGenerator.getOracleDBConnection();
                OracleReportGenerator oracleReportGenerator = new OracleReportGenerator();
                switch (reportType) {
                    case PDF:
                        oracleReportGenerator.generatePDFReportFromOracle(table, connection);
                        break;
                    case HTML:
                        oracleReportGenerator.generateHTMLReportFromOracle(table, connection);
                        break;
                }
                break;
            case MYSQL:
                connection = MySQLReportGenerator.getMySQLDBConnection();
                MySQLReportGenerator mySQLReportGenerator = new MySQLReportGenerator();
                switch (reportType) {
                    case PDF:
                        mySQLReportGenerator.generatePDFReportFromMySQL(table, connection);
                        break;
                    case HTML:
                        mySQLReportGenerator.generateHTMLReportFromMySQL(table, connection);
                        break;
                }
        }
    }
}
