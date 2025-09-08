public class PlaceTester {
    public static void main(String[] args) {
        // Example 1: Famous landmark
        Place p1 = new Place("Eiffel Tower", "Paris, France", "An iconic iron tower built in 1889.");

        // Example 2: Using no-argument constructor
        Place p2 = new Place();

        // Example 3: Another place
        Place p3 = new Place("Boracay", "Aklan, Philippines", "A tropical island famous for its white sand beaches.");

        // Display info for each place
        p1.displayInfo();
        p2.displayInfo();
        p3.displayInfo();
    }
}
