/*
Multilevel inheritance is where a derived class is created by inheriting
from a parent class that is itself derived from another parent class is called multilevel inheritance.*/
class Vehicle {
    void key() {
        System.out.println("Key is Needed to Drive a Vehicle");
    }

    void Petrol() {
        System.out.println("Petrol is Needed to Drive a Vehicle");
    }

    void License() {
        System.out.println("License is Needed to Drive a Vehicle");
    }
}
    class Bike extends Vehicle {
        void Helmet() {
            System.out.println("To Drive Bike We Have to wear Helmet");
        }
    }
    class Car extends Bike {
        void SeatBelt() {
            System.out.println("To Drive Car We Have To Wear Seat Belts");
        }
    }
    public class Multi_Level_Inheritance {
        public static void main(String[] args) {
            Car car = new Car();
            car.key();
            car.Petrol();
            car.License();
            car.Helmet();
            car.SeatBelt();
        }
    }
