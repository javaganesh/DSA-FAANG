package com.dsa.designpaatern.obserb;

import java.util.ArrayList;
import java.util.List;

public class Youtube {
    public static void main(String[] args) {
      SubScribder s1=new SubScribder("Ganesh");
      SubScribder s2=new SubScribder("Harish");
      SubScribder s3=new SubScribder("Ramesh");
      SubScribder s4=new SubScribder("Nites");
      SubScribder s5=new SubScribder("gargi");
        List<SubScribder> slist=List.of(s1,s2,s3,s4,s5);


        Chanelpublisher ganesh=new Chanelpublisher();
        ganesh.subscribe(s1);
        ganesh.subscribe(s2);
        ganesh.subscribe(s3);
        ganesh.subscribe(s4);
        ganesh.subscribe(s5);



        ganesh.upload("Learn how to master In Code LowDevelel Design ");







    }
}
