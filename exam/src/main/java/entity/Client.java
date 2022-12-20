package entity;

public class Client {
   private Dokon dokon;
   public void booking(Dokon dokon) {
      this.dokon = dokon;
   }
   public Dokon getOrder() {
      return dokon;
   }
   public void showOrder() {
      System.out.println("Zakaz: ");
   //  dokon.showOrder();
   }
   public void pay() {
      if(dokon.isPayment() == true) {
      } else {
         dokon.setPayment(true);
      }
   }
   public void take() {
      if(dokon.isPayment() == false) {
      } else if(dokon.isRegister() == false) {
      } else {
         System.out.println("Thank you!");
      }
   }

}

