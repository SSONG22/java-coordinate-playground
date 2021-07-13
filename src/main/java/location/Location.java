package location;

public class Location {
    private int x;
    private int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double differ(Location B) {
        return Math.sqrt((this.x - B.getX()) * (this.x - B.getX()) + (this.y - B.getY()) * (this.y - B.getY()));
    }
}
