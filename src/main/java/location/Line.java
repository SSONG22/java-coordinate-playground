package location;

import java.util.ArrayList;
import java.util.List;

public class Line implements LocationCalc{
    private List<Point> points;

    private Line(List<Point> list) {
        points = list;
    }
    public Line(Point a, Point b){
        points = new ArrayList<>();
        points.add(a); points.add(b);
    }

    public static Line of(String input) {
        return new Line(StringUtils.convertLocation(input));
    }

    public double length() {
        return points.get(0).differ(points.get(1));
    }
}
