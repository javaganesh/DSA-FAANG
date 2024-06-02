package com.dsa.designpaatern.obserb1;

import com.dsa.designpaatern.factory.Notifcation;

import java.util.ArrayList;
import java.util.List;

interface NotifyCutomerInterace {
    void notiFication(String tweety);
}

class Customer implements NotifyCutomerInterace {
    String name;
    Customer(String name){
        this.name=name;
    }

    @Override
    public void notiFication(String tweety) {
        System.out.println(name+" has Notifiation recived"+tweety);
    }
}
interface  ManageSubscribersAndNotify{

    public void addSubscriber(NotifyCutomerInterace r);
    public void removeSubscriber(NotifyCutomerInterace r);
    public void notifySubscriber(String mess);

}

class InsuranceCompny implements ManageSubscribersAndNotify{
   String insUranceCompanyName;
    public InsuranceCompny(String insUranceCompanyName){
        this.insUranceCompanyName=insUranceCompanyName;
    }

     List<NotifyCutomerInterace> list=new ArrayList<>();

    @Override
    public void addSubscriber(NotifyCutomerInterace r) {
        list.add(r);

    }

    @Override
    public void removeSubscriber(NotifyCutomerInterace r) {
       list.remove(r);
    }

    @Override
    public void notifySubscriber(String message) {
      list.forEach(c->{
          c.notiFication(message);
      });
    }
}

public class ObserverPatternExample {
    public static void main(String[] args) {

         Customer Ganesh=new Customer("Ganesh");
         Customer Rakeshsh=new Customer("Rakesh");
         Customer Roshan=new Customer("Roshn");
         Customer Naresh=new Customer("Naresh");
         Customer Dharmresh=new Customer("Harish");

        InsuranceCompny tata=new InsuranceCompny("tata");
        tata.addSubscriber(Ganesh);
        tata.addSubscriber(Rakeshsh);
        tata.addSubscriber(Roshan);
        tata.addSubscriber(Naresh);
        tata.notifySubscriber("Tata office will be open from 9am to 6pm ");
        tata.addSubscriber(Roshan);
        tata.notifySubscriber("new offer will came in this puja vecation  ");






    }
}
