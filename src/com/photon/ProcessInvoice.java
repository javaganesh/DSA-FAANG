package com.photon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessInvoice {
    public static List<Invoice> process(String[] invoicesRAW){
        List<Invoice> invoiceList=new ArrayList<>();
        for(String str:invoicesRAW){
            //INV005,3000.0,INV003
             String[] inv = str.split(",");
            Invoice invoice=new Invoice(inv[0],Double.parseDouble(inv[1]), inv[2]);
            invoiceList.add(invoice);
        }

      List<Invoice> sortedByDependon  =invoiceList
              .stream()
              .sorted(Comparator.comparing(Invoice::dependsOn)) 
              .collect(Collectors.toList());

        return sortedByDependon;

    }
}
