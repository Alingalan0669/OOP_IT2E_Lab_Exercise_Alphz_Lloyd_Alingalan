class WaterTransport extends Transportation {
    public WaterTransport(String name) {
        super(name);
    }
}

class Boat extends WaterTransport {
    public Boat() {
        super("Boat");
    }

    @Override
    public void move() {
        System.out.println("The boat sails on rivers and lakes.");
    }
}

class Ship extends WaterTransport {
    public Ship() {
        super("Ship");
    }

    @Override
    public void move() {
        System.out.println("The ship travels across oceans carrying cargo and passengers.");
    }
}