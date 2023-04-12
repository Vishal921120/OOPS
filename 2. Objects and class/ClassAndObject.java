// Here's an example of a simple class and its object in Java:

public class ClassAndObject{
    public static class Car { 
        private String make; 
        private String model; 
        private int year; 

        public Car(String make, String model, int year) { 
            this.make = make; 
            this.model = model; 
            this.year = year; 
        } 

        public String getMake() { 
            return make; 
        } 

        public String getModel() { 
            return model; 
        } 

        public int getYear() { 
            return year; 
        } 
        
        public void drive() { 
            System.out.println("The " + make + " " + model + " is driving!"); 
            } 
    }

    public static void main(String[] args){
        // This class is called Car and it has three properties: make, model, and year. 
        // It also has a constructor method that takes those three properties as arguments 
        //and sets them as the values of the corresponding properties. 
        //Additionally, it has three getter methods to retrieve the values of the properties, and a drive method that prints a message to the console.
        // To create an object of this class, we would use the new keyword and pass the required arguments to the constructor:

        Car myCar = new Car("Toyota", "Camry", 2020); 
        // This creates a new Car object with the make "Toyota", model "Camry", and year 2020, and assigns it to the variable myCar. We can then call the object's methods, like so:
        // scssCopy code
        System.out.println(myCar.getMake()); // prints "Toyota" 
        System.out.println(myCar.getModel()); // prints "Camry" 
        System.out.println(myCar.getYear()); // prints "2020" 
        myCar.drive(); // prints "The Toyota Camry is driving!" 

        // This demonstrates the basic principles of classes and objects in Java. 
        // The class provides a blueprint for creating objects with specific properties and behaviors, 
        // and each object is an instance of that class with its own unique set of values for the properties.
    }
} 
