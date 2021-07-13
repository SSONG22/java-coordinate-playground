package location;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double differ(Point B) {
        return Math.sqrt((this.x - B.getX()) * (this.x - B.getX()) + (this.y - B.getY()) * (this.y - B.getY()));
    }

    public boolean isLine(Point point) {
        return ((this.x == point.getX() && this.y != point.getY()) || (this.y == point.getY() && this.x != point.getX()));
    }
}
