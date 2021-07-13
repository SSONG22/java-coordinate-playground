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
        return distance / liter;
    }

    @Override
    double getTripDistance() {
        return distance * liter;
    }

    @Override
    String getName() {
        return name;
    }
}
