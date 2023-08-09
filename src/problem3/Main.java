package problem3;

import com.sun.security.jgss.GSSUtil;

/*
Design a transportation management system for a company that handles a fleet
of vehicles including cars, trucks, and motorcycles. The system should be able to manage vehicle information,
perform emissions checks, and handle maintenance scheduling.
Create a base class called Vehicle with properties like model, year, fuel type, and mileage. Implement appropriate
constructors and methods for displaying vehicle information.
Implement subclasses for Car, Truck, and Motorcycle that inherit from Vehicle. Each subclass should have additional
properties and methods specific to its type.
Define an interface called EmissionControl with a method checkEmission() to simulate emissions checks. Implement this
 interface in the appropriate subclass.
Implement a class MaintenanceSchedule with a method scheduleMaintenance() that prints a message about scheduling
maintenance for a vehicle.
 */
class Vehicle{
    private String model;
   private  int year;
   private String fuel_type;
   private double mileage;
    public Vehicle(String model, int year, String fuel_type, double mileage){
        this.model = model;
        this.year = year;
        this.fuel_type = fuel_type;
        this.mileage = mileage;
    }
  public void displayInfo(){
      System.out.println("Model name: " + model);
      System.out.println("Year: " + year);
      System.out.println("Fuel type: " + fuel_type);
      System.out.println("Mileage: " + mileage + " Kmpl");
  }
  public String getModel(){
        return model;
    }
}
interface EmissionControl{
    public void checkEmission();
}
class MaintenanceSchedule{
    public void scheduleMaintenance(Vehicle vehicle){
        System.out.println("Maintenance schedule for " + vehicle.getModel() + " appointed.");
    }
}
class Car extends Vehicle implements EmissionControl{
    String car_type;

    public Car(String model, int year, String fuel_type, double mileage, String car_type){
        super(model, year, fuel_type, mileage);
        this.car_type = car_type;
        }

    @Override
    public void displayInfo() {
            super.displayInfo();
        System.out.println("Car Type: " + car_type);
    }

    @Override
    public void checkEmission() {
        System.out.println("Emission Control for " + super.getModel() + " checked.");
    }
}
class Truck extends Vehicle{
    int capacity;
    public Truck(String model, int year, String fuel_type, double mileage, int capacity){
        super(model, year, fuel_type, mileage);
        this.capacity = capacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Capacity: " + capacity + " Kg");
    }
}
class Motorcycle extends Vehicle{
    boolean hasSideCar;
    public Motorcycle(String model, int year, String fuel_type, double mileage, boolean hasSideCar){
        super(model, year, fuel_type, mileage);
        this.hasSideCar = hasSideCar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        if(hasSideCar){
            System.out.println(super.getModel() + " has sidecar");
        }
        else{
            System.out.println(super.getModel() + " has no sidecar");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car("Mercedes", 2020, "Diesel", 8.00, "sedan");
        c.displayInfo();
        c.checkEmission();
        Truck t = new Truck("Tata", 2002, "Diesel", 13.3, 400);
//        t.displayInfo();
        Motorcycle m = new Motorcycle("Pulsar", 2005, "Petrol", 45.5, false);
//        m.displayInfo();
        MaintenanceSchedule ms = new MaintenanceSchedule();

        Vehicle[] arr = {c, t, m};
        for(int i = 0; i < 3; i++){
            ms.scheduleMaintenance(arr[i]);
        }
    }
}
