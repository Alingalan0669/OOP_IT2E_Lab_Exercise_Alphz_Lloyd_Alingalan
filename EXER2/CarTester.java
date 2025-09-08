public class CarTester {
    public static void main(String[] args) {
        // Example 1: Using parameterized constructor
        Car c1 = new Car("Yellow", "KAW12345", "AB123");

        // Example 2: Using no-argument constructor
        Car c2 = new Car();

        // Example 3: Another car with different details
        Car c3 = new Car("Red", "XYZ9876", "CH56789");

        // Display info for each car
        c1.displayInfo();
        c2.displayInfo();
        c3.displayInfo();
    }
}
