// Week 9 - Task 4
// Question: Design a Payment Processing System using an interface and an abstract class.
// Credit Card fee = 2%, UPI = 1%, Net Banking = 1.5%.
// The design permits adding a new Payment implementation without changing PaymentProcessor.
// Platform: Eclipse IDE (as stated in the document)
import java.util.*;
interface Payment { void pay(double amount); }
class CreditCardPayment implements Payment { public void pay(double amount){} }
class UPIPayment implements Payment { public void pay(double amount){} }
class NetBankingPayment implements Payment { public void pay(double amount){} }
abstract class PaymentProcessor { abstract double processPayment(Payment payment,double amount); }
class OnlinePaymentProcessor extends PaymentProcessor {
    double processPayment(Payment p,double amount){
        double fee;
        if(p instanceof CreditCardPayment) fee=0.02;
        else if(p instanceof UPIPayment) fee=0.01;
        else fee=0.015;
        p.pay(amount);
        return amount*(1+fee);
    }
}
public class PaymentProcessingSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); int n=sc.nextInt(); OnlinePaymentProcessor p=new OnlinePaymentProcessor();
        while(n-->0){
            int type=sc.nextInt(); double amount=sc.nextDouble(); Payment pay;
            if(type==1){pay=new CreditCardPayment(); System.out.printf("CreditCard %.2f%n",p.processPayment(pay,amount));}
            else if(type==2){pay=new UPIPayment(); System.out.printf("UPI %.2f%n",p.processPayment(pay,amount));}
            else {pay=new NetBankingPayment(); System.out.printf("NetBanking %.2f%n",p.processPayment(pay,amount));}
        }
    }
}
