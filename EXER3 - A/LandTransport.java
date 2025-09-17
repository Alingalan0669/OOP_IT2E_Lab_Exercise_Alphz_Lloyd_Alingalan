class LandTransport extends Transportation {
    public LandTransport(String name) {
        super(name);
    }
}

class Truck extends LandTransport {
    public Truck() {
        super("Truck");
    }

    @Override
    public void move() {
        System.out.println("The truck drives on roads carrying heavy loads.");
    }
}

class SUV extends LandTransport {
    public SUV() {
        super("SUV");
    }

    @Override
    public void move() {
        System.out.println("The SUV drives smoothly on roads and rough terrain.");
    }
}

class Tricycle extends LandTransport {
    public Tricycle() {
        super("Tricycle");
    }

    @Override
    public void move() {
        System.out.println("The tricycle carries passengers on short road trips.");
    }
}

class Motorcycle extends LandTransport {
    public Motorcycle() {
        super("Motorcycle");
    }

    @Override
    public void move() {
        System.out.println("The motorcycle zooms fast on the streets.");
    }
}

class Kariton extends LandTransport {
    public Kariton() {
        super("Kariton");
    }

    @Override
    public void move() {
        System.out.println("The kariton is pulled manually on the road.");
    }
}
