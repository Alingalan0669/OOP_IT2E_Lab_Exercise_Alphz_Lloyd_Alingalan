public class Place {
    private String name;
    private String location;
    private String description;

    // No-argument constructor
    public Place() {
        this.name = "No Name";
        this.location = "No Location";
        this.description = "No Description Yet";
    }

    // Parameterized constructor
    public Place(String name, String location, String description) {
        this.name = name;
        this.location = location;
        this.description = description;
    }

    // Display place information
    public void displayInfo() {
        System.out.println("Place Information:");
        System.out.println("Name: " + this.name);
        System.out.println("Location: " + this.location);
        System.out.println("Description: " + this.description);

    }
}
