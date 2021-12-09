// Vehicle.java:
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

abstract class Vehicle {
        private static int numVehicles;
        private String manufacturer;
        private int numWheels;
        
        public Vehicle() {
                numVehicles++;
        }
        
        
        // @param manufacturer
        // @param numWheels
         
        public Vehicle(String manufacturer, int numWheels) {
                this.manufacturer = manufacturer;
                this.numWheels = numWheels;
                numVehicles++;
        }


        /**
         * @return the numVehicles
         */
        public static int getNumVehicles() {
                return numVehicles;
        }

        /**
         * @param numVehicles the numVehicles to set
         */
        public static void setNumVehicles(int numVehicles) {
                Vehicle.numVehicles = numVehicles;
        }

        /**
         * @return the manufacturer
         */
        public String getManufacturer() {
                return manufacturer;
        }

        /**
         * @param manufacturer the manufacturer to set
         */
        public void setManufacturer(String manufacturer) {
                this.manufacturer = manufacturer;
        }

        /**
         * @return the numWheels
         */
        public int getNumWheels() {
                return numWheels;
        }

        /**
         * @param numWheels the numWheels to set
         */
        public void setNumWheels(int numWheels) {
                this.numWheels = numWheels;
        }

        public String getClassName() {
                return this.getClass().getSimpleName();
        }

        @Override
        public String toString() {
                return "Manufacturer= " + manufacturer + ", numWheels= " + numWheels+",";
        }

}
// Automobile.java:

abstract class Automobile extends Vehicle {
        private float mpg;
        private int numSeats;
        private String model;
        /**
         * @return the mpg
         */
        public float getMpg() {
                return mpg;
        }
        /**
         * @param mpg the mpg to set
         */
        public void setMpg(float mpg) {
                this.mpg = mpg;
        }
        /**
         * @return the numSeats
         */
        public int getNumSeats() {
                return numSeats;
        }
        /**
         * @param numSeats the numSeats to set
         */
        public void setNumSeats(int numSeats) {
                this.numSeats = numSeats;
        }
        /**
         * @return the model
         */
        public String getModel() {
                return model;
        }
        /**
         * @param model the model to set
         */
        public void setModel(String model) {
                this.model = model;
        }
        /**
         * Constructor
         */
        public Automobile() {
                super();
        }
        /**
         * Parameterized constructor
         * @param manufacturer
         * @param numWheels
         * @param mpg
         * @param numSeats
         * @param model
         */
        public Automobile(String manufacturer, int numWheels, float mpg, int numSeats, String model) {
                // call to base class constructor
                super(manufacturer, numWheels);
                this.mpg = mpg;
                this.numSeats = numSeats;
                this.model = model;
        }
        @Override
        public String toString() {
                return  super.toString()+"mpg=" + mpg + ", numSeats=" + numSeats + ", model=" + model;
        }
        public String getClassName() {
                return this.getClass().getSimpleName();
        }
}
// TwoWheeler.java:

abstract class TwoWheeler extends Vehicle {
        private String model;
        private int weight;

        /**
         * @return the model
         */
        public String getModel() {
                return model;
        }

        /**
         * @param model the model to set
         */
        public void setModel(String model) {
                this.model = model;
        }

        /**
         * @return the weight
         */
        public int getWeight() {
                return weight;
        }

        /**
         * @param weight the weight to set
         */
        public void setWeight(int weight) {
                this.weight = weight;
        }

        public TwoWheeler() {
                super();
        }

        /**
         * parameterized constructor
         * 
         * @param manufacturer
         * @param numWheels
         * @param model
         * @param weight
         */
        public TwoWheeler(String manufacturer, int numWheels, String model, int weight) {
                super(manufacturer, numWheels);
                this.model = model;
                this.weight = weight;
        }

        @Override
        public String toString() {
                return super.toString() + ",model=" + model + ", weight=" + weight + ",";
        }

        public String getClassName() {
                return this.getClass().getSimpleName();
        }
}
// SedanType.java:

/**
 * enumeration SedanType
 */
enum SedanType {
    SMALL, Family, Large, Luxury;
}

enum TruckType {
        Mini, Pickup, Tow, Flatbed, Semi
}
// Sedan.java:

class Sedan extends Automobile {
        private SedanType type;
        private int numCylinders;
        private int horsepower;

        /**
         * @return the type
         */
        public SedanType getType() {
                return type;
        }

        /**
         * @param type the type to set
         */
        public void setType(SedanType type) {
                this.type = type;
        }

        /**
         * @return the numCylinders
         */
        public int getNumCylinders() {
                return numCylinders;
        }

        /**
         * @param numCylinders the numCylinders to set
         */
        public void setNumCylinders(int numCylinders) {
                this.numCylinders = numCylinders;
        }

        /**
         * @return the horsepower
         */
        public int getHorsepower() {
                return horsepower;
        }

        /**
         * @param horsepower the horsepower to set
         */
        public void setHorsepower(int horsepower) {
                this.horsepower = horsepower;
        }

        /**
         * constructor
         */
        public Sedan() {
                super();
        }

        /**
         * parameterized constructor
         * 
         * @param manufacturer
         * @param numWheels
         * @param mpg
         * @param numSeats
         * @param model
         * @param type
         * @param numCylinders
         * @param horsepower
         */
        public Sedan(String manufacturer, int numWheels, float mpg, int numSeats, String model, SedanType type,
                        int numCylinders, int horsepower) {
                super(manufacturer, numWheels, mpg, numSeats, model);
                this.type = type;
                this.numCylinders = numCylinders;
                this.horsepower = horsepower;
        }

}
// Truck.java:

class Truck extends Automobile {
        private int numAxles;
        private int grossVechicleMass;
        private TruckType type;

        /**
         * @return the numAxles
         */
        public int getNumAxles() {
                return numAxles;
        }

        /**
         * @param numAxles the numAxles to set
         */
        public void setNumAxles(int numAxles) {
                this.numAxles = numAxles;
        }

        /**
         * @return the grossVechicleMass
         */
        public int getGrossVechicleMass() {
                return grossVechicleMass;
        }

        /**
         * @param grossVechicleMass the grossVechicleMass to set
         */
        public void setGrossVechicleMass(int grossVechicleMass) {
                this.grossVechicleMass = grossVechicleMass;
        }

        /**
         * @return the type
         */
        public TruckType getType() {
                return type;
        }

        /**
         * @param type the type to set
         */
        public void setType(TruckType type) {
                this.type = type;
        }

        /**
         * constructor
         */
        public Truck() {
                super();
        }

        @Override
        public String toString() {
                return super.toString() + ",numAxles=" + numAxles + ", grossVechicleMass=" + grossVechicleMass + ", type="
                                + type;
        }

        /**
         * parameterized constructor
         * 
         * @param manufacturer
         * @param numWheels
         * @param mpg
         * @param numSeats
         * @param model
         * @param numAxles
         * @param grossVechicleMass
         * @param type
         */
        public Truck(String manufacturer, int numWheels, float mpg, int numSeats, String model, int numAxles,
                        int grossVechicleMass, TruckType type) {
                super(manufacturer, numWheels, mpg, numSeats, model);
                this.numAxles = numAxles;
                this.grossVechicleMass = grossVechicleMass;
                this.type = type;
        }

        public String getClassName() {
                return this.getClass().getSimpleName();
        }
}
// MotorCycle.java:

class MotorCycle extends TwoWheeler {
        private float mpg;
        private int horsepower;

        /**
         * @return the mpg
         */
        public float getMpg() {
                return mpg;
        }

        /**
         * @param mpg the mpg to set
         */
        public void setMpg(float mpg) {
                this.mpg = mpg;
        }

        /**
         * @return the horsepower
         */
        public int getHorsepower() {
                return horsepower;
        }

        /**
         * @param horsepower the horsepower to set
         */
        public void setHorsepower(int horsepower) {
                this.horsepower = horsepower;
        }

        /**
         * constructor
         */
        public MotorCycle() {
                super();
        }

        /**
         * Parameterized constructor
         * @param manufacturer
         * @param numWheels
         * @param model
         * @param weight
         * @param mpg
         * @param horsepower
         */
        public MotorCycle(String manufacturer, int numWheels, String model, int weight, float mpg, int horsepower) {
                super(manufacturer, numWheels, model, weight);
                this.mpg = mpg;
                this.horsepower = horsepower;
        }

        @Override
        public String toString() {
                return super.toString() + ",mpg=" + mpg + ", horsepower=" + horsepower;
        }

        

        public String getClassName() {
                return this.getClass().getSimpleName();
        }
}
// Bicycle.java:

class Bicycle extends TwoWheeler {
        private int caloriesBurnedPerHour;
        private boolean hasGears;
        private boolean hasSuspensions;

        /**
         * @return the caloriesBurnedPerHour
         */
        public int getCaloriesBurnedPerHour() {
                return caloriesBurnedPerHour;
        }

        /**
         * @param caloriesBurnedPerHour the caloriesBurnedPerHour to set
         */
        public void setCaloriesBurnedPerHour(int caloriesBurnedPerHour) {
                this.caloriesBurnedPerHour = caloriesBurnedPerHour;
        }

        /**
         * @return the hasGears
         */
        public boolean isHasGears() {
                return hasGears;
        }

        /**
         * @param hasGears the hasGears to set
         */
        public void setHasGears(boolean hasGears) {
                this.hasGears = hasGears;
        }

        /**
         * @return the hasSuspensions
         */
        public boolean isHasSuspensions() {
                return hasSuspensions;
        }

        /**
         * @param hasSuspensions the hasSuspensions to set
         */
        public void setHasSuspensions(boolean hasSuspensions) {
                this.hasSuspensions = hasSuspensions;
        }

        /**
         * Default Constructor
         */
        public Bicycle() {
                super();
        }

        /**
         * Parameterized Constructor
         * 
         * @param manufacturer
         * @param numWheels
         * @param model
         * @param weight
         * @param caloriesBurnedPerHour
         * @param hasGears
         * @param hasSuspensions
         */
        public Bicycle(String manufacturer, int numWheels, String model, int weight, int caloriesBurnedPerHour,
                        boolean hasGears, boolean hasSuspensions) {
                super(manufacturer, numWheels, model, weight);
                this.caloriesBurnedPerHour = caloriesBurnedPerHour;
                this.hasGears = hasGears;
                this.hasSuspensions = hasSuspensions;
        }

        @Override
        public String toString() {
                return super.toString() + ",caloriesBurnedPerHour=" + caloriesBurnedPerHour + ", hasGears=" + hasGears
                                + ", hasSuspensions=" + hasSuspensions;
        }

        public String getClassName() {
                return this.getClass().getSimpleName();
        }
}
// VehicleDatabase.java:

public class VehicleDatabase {

        public static void main(String[] args) {
                String filename = null;
                Scanner scanner = new Scanner(System.in);
                if (args.length > 0) {
                        filename = args[0];
                        try {
                                Scanner fileInput = new Scanner(new File(filename));
                                int count = 0;
                                int index = 0;
                                Vehicle[] vehicles = null;
                                // iterate till the file has contents
                                while (fileInput.hasNext()) {
                                        // if the first line
                                        if (count == 0) {
                                                // read the value and create the array of the count size
                                                count = fileInput.nextInt();
                                                fileInput.nextLine();
                                                vehicles = new Vehicle[count];
                                        } else {
                                                // read the line
                                                String line = fileInput.nextLine();
                                                // split the line by ,
                                                String[] lineArr = line.split(",");
                                                // check for the type and instantiate the obejcts of that type
                                                if (lineArr[0].equalsIgnoreCase("Truck")) {
                                                        String manufacturer = lineArr[1].trim();
                                                        int numWheels = Integer.parseInt(lineArr[2].trim());
                                                        float mpg = Float.parseFloat(lineArr[3].trim());
                                                        int numSeats = Integer.parseInt(lineArr[4].trim());
                                                        String model = lineArr[5].trim();
                                                        int numAxles = Integer.parseInt(lineArr[6].trim());
                                                        int grossVechicleMass = Integer.parseInt(lineArr[7].trim());

                                                        String ty = lineArr[8];
                                                        TruckType type = null;
                                                        // Mini, Pickup, Tow, Flatbed, Semi
                                                        if (ty.equalsIgnoreCase("Mini"))
                                                                type = TruckType.Mini;
                                                        else if (ty.equalsIgnoreCase("Flatbed"))
                                                                type = TruckType.Flatbed;
                                                        else if (ty.equalsIgnoreCase("Pickup"))
                                                                type = TruckType.Pickup;
                                                        else if (ty.equalsIgnoreCase("Semi"))
                                                                type = TruckType.Semi;
                                                        else if (ty.equalsIgnoreCase("Tow"))
                                                                type = TruckType.Tow;

                                                        vehicles[index] = new Truck(manufacturer, numWheels, mpg, numSeats, model, numAxles,
                                                                        grossVechicleMass, type);
                                                } else if (lineArr[0].equalsIgnoreCase("Sedan")) {
                                                        String manufacturer = lineArr[1].trim();
                                                        int numWheels = Integer.parseInt(lineArr[2].trim());
                                                        float mpg = Float.parseFloat(lineArr[3].trim());
                                                        int numSeats = Integer.parseInt(lineArr[4].trim());
                                                        String model = lineArr[5].trim();
                                                        String ty = lineArr[6].trim();
                                                        SedanType type = null;
                                                        if (ty.equalsIgnoreCase("Family"))
                                                                type = SedanType.Family;
                                                        else if (ty.equalsIgnoreCase("Large"))
                                                                type = SedanType.Large;
                                                        else if (ty.equalsIgnoreCase("SMALL"))
                                                                type = SedanType.SMALL;
                                                        else if (ty.equalsIgnoreCase("Luxury"))
                                                                type = SedanType.Luxury;
                                                        int numCylinders = Integer.parseInt(lineArr[6].trim());
                                                        int horsepower = Integer.parseInt(lineArr[7].trim());

                                                        vehicles[index] = new Sedan(manufacturer, numWheels, mpg, numSeats, model, type,
                                                                        numCylinders, horsepower);
                                                } else if (lineArr[0].equalsIgnoreCase("MotorCycle")) {
                                                        String manufacturer = lineArr[1].trim();
                                                        int numWheels = Integer.parseInt(lineArr[2].trim());
                                                        float mpg = Float.parseFloat(lineArr[3].trim());
                                                        String model = lineArr[4].trim();
                                                        int weight = Integer.parseInt(lineArr[5].trim());
                                                        int horsepower = Integer.parseInt(lineArr[6].trim());
                                                        

                                                        vehicles[index] = new MotorCycle(manufacturer, numWheels, model, weight, mpg, horsepower);
                                                } else if (lineArr[0].equalsIgnoreCase("Bicycle")) {

                                                        String manufacturer = lineArr[1].trim();
                                                        int numWheels = Integer.parseInt(lineArr[2].trim());
                                                        String model = lineArr[3].trim();
                                                        int weight = Integer.parseInt(lineArr[4].trim());
                                                        int caloriesBurnedPerHour = Integer.parseInt(lineArr[5].trim());
                                                        boolean hasGears = Boolean.parseBoolean(lineArr[6].trim());
                                                        boolean hasSuspension = Boolean.parseBoolean(lineArr[7].trim());

                                                        vehicles[index] = new Bicycle(manufacturer, numWheels, model, weight, caloriesBurnedPerHour,
                                                                        hasGears, hasSuspension);
                                                }
                                                index++;
                                        }
                                }

                                String doContinue = "yes";

                                // iterate till the user continues to wish
                                while (true) {
                                        // display the menu and get user choice
                                        System.out.print(
                                                        "1. Display contents of Vehicle database\n2. Choose a class to view information\nEnter your choice: ");
                                        int choice = scanner.nextInt();
                                        scanner.nextLine();
                                        // check for choice
                                        if (choice == 1) {

                                                for (int item = 0; item < count; item++) {
                                                        System.out.println(vehicles[item].toString());
                                                }
                                        } else if (choice == 2) {
                                                System.out.print("Sedan\nTruck\nMotorcycle\nBicycle\nEnter your choice: ");
                                                String classType = scanner.nextLine();
                                                for (int item = 0; item < count; item++) {
                                                        if (vehicles[item].getClassName().equalsIgnoreCase(classType))
                                                                System.out.println(vehicles[item].toString());
                                                }
                                        }
                                        System.out.println("Do you want to check again (yes/ no)? ");
                                        doContinue = scanner.nextLine();

                                        if (doContinue.equalsIgnoreCase("yes")) {
                                                continue;
                                        } else {
                                                System.out.println("Thanks for using the Vehicle database");
                                                break;
                                        }
                                }

                        } catch (FileNotFoundException e) {
                                e.printStackTrace();
                        }
                } else {
                        System.out.println("Please provide file name!");
                }
                scanner.close();
        }

}
