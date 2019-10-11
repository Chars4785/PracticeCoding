//package test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Sol {
//
//    public void addVehicle(List<Vehicle> vehicles) {
//
//    }
//
//    public static void main(String[] arg) {
//
//        List<Vehicle> vehicles = new ArrayList<>();
//        vehicles.add(new Vehicle());
//        vehicles.add(new Vehicle());
//
//        List<Bike> bikes = new ArrayList<>();
//        bikes.add(new Bike());
//        bikes.add(new Bike());
//
//        List<Car> cars = new ArrayList<>();
//        cars.add(new Car());
//        cars.add(new Car());
//
//        Sol mechanic = new Sol();
//
//        mechanic.addVehicle(vehicles); // compiles fine
//        mechanic.addVehicle(bikes);    // compilation fails
//        mechanic.addVehicle(cars);     // compilation fails
//    }
//}
//
//class Vehicle {
//
//    public void service() {
//        System.out.println("Generic vehicle servicing");
//    }
//
//}
//
//class Bike extends Vehicle {
//    @Override
//    public void service() {
//        System.out.println("Bike specific servicing");
//    }
//}
//
//class Car extends Vehicle {
//
//    @Override
//    public void service() {
//        System.out.println("Car specific servicing");
//    }
//
//}
