package L01_Working_with_Abstraction.lab.P02PointInRectangle;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isGreaterThanOrEqual(Point p) {
        return x >= p.x && y >= p.y;
    }

    public boolean isLessThanOrEqual(Point p) {
        return x <= p.x && y <= p.y;
    }
}
