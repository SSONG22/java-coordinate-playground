package rentCar;

public class Avante implements Car {
    private String name;
    private int liter;
    private int distance;

    public Avante(int distance) {
        name = "Avante";
        this.distance = distance;
        this.liter = 15;
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
