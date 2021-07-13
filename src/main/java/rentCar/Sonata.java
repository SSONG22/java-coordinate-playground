package rentCar;

public class Sonata implements Car {
    private String name;
    private int liter;
    private int distance;

    public Sonata(int distance) {
        this.name = "Sonata";
        this.liter = 10;
        this.distance = distance;
    }

    @Override
    public double getDistancePerLiter() {
        return liter;
    }

    @Override
    public double getTripDistance() {
        return distance;
    }

    @Override
    public String getName() {
        return name;
    }
}
