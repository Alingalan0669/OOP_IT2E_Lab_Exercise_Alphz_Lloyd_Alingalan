public class TransportationTester {
    public static void main(String[] args) {
        // Air Transport
        Transportation plane = new Plane();
        Transportation helicopter = new Helicopter();

        // Land Transport
        Transportation truck = new Truck();
        Transportation suv = new SUV();
        Transportation tricycle = new Tricycle();
        Transportation motorcycle = new Motorcycle();
        Transportation kariton = new Kariton();

        // Water Transport
        Transportation boat = new Boat();
        Transportation ship = new Ship();

        // Test them
        plane.move();
        helicopter.move();
        truck.move();
        suv.move();
        tricycle.move();
        motorcycle.move();
        kariton.move();
        boat.move();
        ship.move();
    }
}
