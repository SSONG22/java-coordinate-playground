package rentCar;

public class Sonata extends Car {
    private String name;
    private int liter;
    private int distance;

    public Sonata(int distance) {
        this.name = "Sonata";
        this.liter = 10;
        this.distance = distance;
    }

    @Override
    double getDistancePerLiter() {
        return distance / liter;
    }

    @Override
    double getTripDistance() {
        return distance;
    }

    @Override
    String getName() {
        return name;
    }
}
