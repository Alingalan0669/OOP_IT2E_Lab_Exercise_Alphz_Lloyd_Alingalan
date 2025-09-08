public class Car {
    private String color;
    private String plateNo;
    private String chassisNo;

    // No-argument constructor
    public Car() {
        this.color = "No Color";
        this.plateNo = "No Plate Number";
        this.chassisNo = "No Chassis No Yet";
    }

    // Parameterized constructor
    public Car(String color, String plateNo, String chassisNo) {
        this.color = color;
        this.plateNo = plateNo;
        this.chassisNo = chassisNo;
    }

    // Display car information
    public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Color: " + this.color);
        System.out.println("Plate Number: " + this.plateNo);
        System.out.println("Chassis Number: " + this.chassisNo);
        System.out.println("-------------------------");
    }
}
