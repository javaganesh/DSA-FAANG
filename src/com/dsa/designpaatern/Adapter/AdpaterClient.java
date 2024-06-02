package com.dsa.designpaatern.Adapter;

 interface BuildDesk{
    void setPayjmentType(String payjmentType);
    String getPaymentType();

    void setDetails(String data);
    String getDetails();

 }
interface PayTm{
    void setTypeOfPayment(String payjmentType);
    String getTypeOfent();

    void providedDetails(String data);
    String getDetails();

}

class  PaymentAdpter {
   static PayTm p=null;
    PaymentAdpter(PayTm payTm){
        this.p=payTm;
    }
    static PayTm   converBuidDiskTipayTm(BuildDesk b){
       p.setTypeOfPayment(b.getPaymentType());
       p.providedDetails(b.getDetails());
        return p;
  }


}

 class GaneshIt  implements BuildDesk{
     String payjmentType=null;
     String data=null;
     @Override
     public void setPayjmentType(String payjmentType) {
        this.payjmentType=payjmentType;
     }

     @Override
     public String getPaymentType() {
         return payjmentType;
     }

     @Override
     public void setDetails(String data) {
           this.data=data;
     }

     @Override
     public String getDetails() {
         return data;
     }
 }

public class AdpaterClient {


    public static void main(String[] args) {
    GaneshIt ganeshIt=new GaneshIt();
    ganeshIt.setPayjmentType("UPI");
    ganeshIt.setDetails("8456018636");
    PaymentAdpter.converBuidDiskTipayTm(ganeshIt);
    }
}
