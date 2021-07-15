package coordinate.model;

import java.util.List;

public class Line extends AbstractFigure {
    private static final String RESULT_OF_LINE = "두 점 사이의 거리는 ";

    public Line(List<Point> points) {
        super(points);
    }

    @Override
    public double area() {
        return getPoints().get(0).calculateDistance(getPoints().get(1));
    }

    @Override
    public String getAreaInfo() {
        return RESULT_OF_LINE + area();
    }
}