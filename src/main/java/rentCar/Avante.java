package rentCar;

public class Avante extends Car {
    private String name;
    private int liter;
    private int distance;

    public Avante(int distance) {
        name = "Avante";
        this.distance = distance;
        this.liter = 15;
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
