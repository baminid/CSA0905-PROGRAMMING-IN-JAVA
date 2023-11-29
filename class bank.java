```
public class Bank {
   public double getRateOfInterest() {
      return 0;
   }
}

class SBI extends Bank {
   public double getRateOfInterest() {
      return 8.4;
   }
}

class ICICI extends Bank {
   public double getRateOfInterest() {
      return 7.3;
   }
}

class AXIS extends Bank {
   public double getRateOfInterest() {
      return 9.7;
   }
}

class TestBank {
   public static void main(String args[]) {
      Bank bank1 = new SBI();
      Bank bank2 = new ICICI();
      Bank bank3 = new AXIS();
      System.out.println("Rate of Interest of SBI: " + bank1.getRateOfInterest());
      System.out.println("Rate of Interest of ICICI: " + bank2.getRateOfInterest());
      System.out.println("Rate of Interest of AXIS: " + bank3.getRateOfInterest());
   }
}

```