package coordinate.model;

import java.util.List;
import java.util.Objects;

public abstract class AbstractFigure implements Figure{

    private static final String ERROR_FIGURE_NULL = "올바른 Point 값이 아닙니다.";
    private final List<Point> points;

    // 생성자, 공통로직만 구현
    AbstractFigure(List<Point> points){
        if(points == null || points.isEmpty())
            throw new IllegalArgumentException(ERROR_FIGURE_NULL);
        this.points = points;
    }

    @Override
    public List<Point> getPoints() {
        return points;
    }

    @Override
    public boolean hasPoint(int x, int y) {
        return getPoints().stream().anyMatch(point -> point.isSame(x,y));
    }

//    double area();
//    String getAreaInfo(); 는 Figure 구현체에서 Override


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractFigure that = (AbstractFigure) o;
        return Objects.equals(points, that.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }
}
