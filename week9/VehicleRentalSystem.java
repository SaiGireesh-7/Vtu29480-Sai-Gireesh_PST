// Week 9 - Task 3
// Question: Design a Vehicle Rental System using Java inheritance and runtime polymorphism.
// Base class: Vehicle(vehicleNumber, rentPerDay). Subclasses: Car, Bike, Truck.
// Car = rentPerDay*days; Bike = rentPerDay*days*0.90; Truck = rentPerDay*days*1.20.
// Platform: Eclipse IDE (as stated in the document)
import java.util.*;
abstract class Vehicle {
    String vehicleNumber; double rentPerDay;
    Vehicle(String n,double r){vehicleNumber=n;rentPerDay=r;}
    abstract double calculateRent(int days);
}
class Car extends Vehicle { Car(String n,double r){super(n,r);} double calculateRent(int d){return rentPerDay*d;} }
class Bike extends Vehicle { Bike(String n,double r){super(n,r);} double calculateRent(int d){return rentPerDay*d*0.90;} }
class Truck extends Vehicle { Truck(String n,double r){super(n,r);} double calculateRent(int d){return rentPerDay*d*1.20;} }
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); int n=sc.nextInt();
        while(n-->0){
            int type=sc.nextInt(); String number=sc.next(); double rent=sc.nextDouble(); int days=sc.nextInt();
            Vehicle v = type==1 ? new Car(number,rent) : type==2 ? new Bike(number,rent) : new Truck(number,rent);
            System.out.printf("%s %.2f%n", number, v.calculateRent(days));
        }
    }
}
