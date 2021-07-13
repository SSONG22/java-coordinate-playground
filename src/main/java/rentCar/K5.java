package rentCar;

public class K5 implements Car {
    private String name;
    private int liter;
    private int distance;

    public K5(int distance) {
        name = "K5";
        this.distance = distance;
        this.liter = 13;
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
