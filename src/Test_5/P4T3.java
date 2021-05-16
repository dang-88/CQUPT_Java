package Test_5;

import java.util.Scanner;

interface MoneyFare {
    void charge(String name);
}

abstract class Vehicles {
    abstract void wheel(String name);
}

class Bus extends Vehicles implements MoneyFare {
    void wheel(String name) {
        System.out.println("The bus " + name + " has 6 wheels.");
    }

    public void charge(String name) {
        System.out.println("The bus " + name + " 2 yuan per people");
    }
}

class Taxi extends Vehicles implements MoneyFare {
    void wheel(String name) {
        System.out.println("The taxi " + name + " has 4 wheels.");
    }

    public void charge(String name) {
        System.out.println("The taxi " + name + " 2 yuan per km");
    }
}

class Car implements MoneyFare {
    public void charge(String name) {
        System.out.println("The car " + name + " is free if it is yours");
    }
}

public class P4T3 {
    public static void main(String args[]) {
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        Car car = new Car();
        String busname, taxiname, carname;
        Scanner s = new Scanner(System.in);
        System.out.println("Please  input  the  bus  line:  ");
        busname = s.nextLine();
        System.out.println("Please  input  the  taxi  name:  ");
        taxiname = s.nextLine();
        System.out.println("Please  input  the  car  brand:  ");
        carname = s.nextLine();
        bus.wheel(busname);
        bus.charge(busname);
        taxi.wheel(taxiname);
        taxi.charge(taxiname);
        car.charge(carname);
    }
}
