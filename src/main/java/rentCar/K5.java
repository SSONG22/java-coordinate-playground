package rentCar;

public class K5 extends Car {
    private String name;
    private int liter;
    private int distance;

    public K5(int distance) {
        name = "K5";
        this.distance = distance;
        this.liter = 13;
    }

    @Override
    double getDistancePerLiter() {
        return liter;
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
