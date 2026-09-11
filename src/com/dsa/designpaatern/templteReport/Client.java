package com.dsa.designpaatern.templteReport;

public class Client {
    public static void main(String[] args) {
        ReportGenerte reportGenerte=new ExcelReport();
        reportGenerte.generateReport();
    }
}
