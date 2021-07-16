package coordinate.model;

import java.util.List;

public class Triangle extends AbstractFigure {
    private static final String ERROR_INVALID_TRIANGLE = "삼각형 모양이 아닙니다.";
    private static final String OUTPUT_AREA_OF_TRIANGLE = "삼각형의 넓이는 ";

    Triangle(List<Point> points) {
        super(points);
        // 삼각형이 안되는 경우는 3점이 모두 일직선에 놓였을 때다.
        if (isInStraightLine(points)) {
            throw new IllegalArgumentException(ERROR_INVALID_TRIANGLE);
        }
    }

    private boolean isInStraightLine(List<Point> points) {
        // 0,1 - 0,2 의 좌표 기울기가 같으면 일직선상에 있다.
        return points.get(0).calculateSlope(points.get(1)) == points.get(0).calculateSlope(points.get(2));
    }


    @Override
    public double area() {
        double firstSide = getPoints().get(0).calculateDistance(getPoints().get(1));
        double secondSide = getPoints().get(1).calculateDistance(getPoints().get(2));
        double thirdSide = getPoints().get(2).calculateDistance(getPoints().get(0));

        return calculateFormulaOfHero(firstSide, secondSide, thirdSide);
    }

    private double calculateFormulaOfHero(double firstSide, double secondSide, double thirdSide) {
        double s = (firstSide + secondSide + thirdSide) / 2;
        return Math.sqrt(s * (s - firstSide) * (s - secondSide) * (s - thirdSide));
    }

    @Override
    public String getAreaInfo() {
        return OUTPUT_AREA_OF_TRIANGLE + area();
    }
}
