package location;

import java.util.ArrayList;
import java.util.List;

public class Triangle implements LocationCalc {
    private List<Line> lines = new ArrayList<>();

    public Triangle(String input) {
        List<Point> points = StringUtils.convertLocation(input);
        lines.add(new Line(points.get(0), points.get(1)));
        lines.add(new Line(points.get(1), points.get(2)));
        lines.add(new Line(points.get(0), points.get(2)));
    }

    private double getS() {
        double sum = 0;
        for (Line line : lines) {
            sum += line.length();
        }
        return sum / 2;
    }

    @Override
    public double length() { // 삼각형의 넓이
        double s = getS();
        double result = s;
        for (Line line : lines) {
            result *= (s - line.length());
        }
        return Math.round(Math.sqrt(result) * 10) / 10;
    }
}
