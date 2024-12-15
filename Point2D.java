public class Point2D
{
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int num) {
        y = num;
    }

    public void setX(int num) {
        x = num;
    }

    public String toString() {
        return "A point at (" + x + ", " + y + ")";
    }

    public boolean equals(Point2D secondPoint) {
        return (x == secondPoint.getX() && y == secondPoint.getY());
    }
}
