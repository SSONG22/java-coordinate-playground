package location;

import java.util.List;

public class Rectangle implements LocationCalc{
    private Line width;
    private Line height;

    private Rectangle(Line width, Line height) {
        this.width = width;
        this.height = height;
    }

    public static Rectangle of(String input) {
        List<Point> points = StringUtils.convertLocation(input);
        if (points.size() != 4) throw new IllegalArgumentException("4개의 점이 필요합니다.");
        Line width, height;
        if (points.get(0).isLine(points.get(1))) {
            width = new Line(points.get(0), points.get(1));
            height = new Line(points.get(1), points.get(2));
        } else if (points.get(0).isLine(points.get(2))) {
            width = new Line(points.get(0), points.get(2));
            height = new Line(points.get(1), points.get(3));
        } else {
            width = new Line(points.get(0), points.get(3));
            height = new Line(points.get(1), points.get(2));
        }
        return new Rectangle(width, height);
    }

    @Override // 사각형 넓이
    public double length() {
        return width.length() * height.length();
    }
}
