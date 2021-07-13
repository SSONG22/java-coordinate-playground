package rentCar;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    private static final String NEWLINE = System.getProperty("line.separator");
    private List<Car> lentCars;

    private RentCompany() {
        lentCars = new ArrayList<>();
    }

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        lentCars.add(car);
    }

    public String generateReport() {
        StringBuilder sb = new StringBuilder("");
        for (Car car : lentCars) {
            sb.append(car.getName() + " : " + round(car.getChargeQuantity()) + "리터" + NEWLINE);
        }
        return sb.toString();
    }

    public long round(double num) {
        return Math.round(num);
    }
}
