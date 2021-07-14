package coordinate.model;

import java.util.List;

public interface Figure {
    boolean hasPoint(int x, int y);
    List<Point> getPoints();
    double area();
    String getAreaInfo();
}
