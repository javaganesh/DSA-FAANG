package com.dsa.designpaatern.templteReport;

public abstract class ReportGenerte {
    public  final  void  generateReport(){
        readData();
        processdata();
        generate();
        saveReport();


    }

    private void saveReport() {
        System.out.println("Save the data");
    }

    public abstract void generate();


    private void processdata() {
        System.out.println("Process the data");
    }

    private void readData() {
        System.out.println("Read the data");
    }

}
