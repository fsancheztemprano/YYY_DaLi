package lib.Geometry;

public class Polygon {
    private int numOfSides;
    private double sideLength;
    private Point center;

    public Polygon() {
    }

    public Polygon(int numOfSides, double sideLength) {
        this.numOfSides = numOfSides;
        this.sideLength = sideLength;
        center = new Point(0, 0);
    }

    public Polygon(int numOfSides, double sideLength, Point center) {
        this.numOfSides = numOfSides;
        this.sideLength = sideLength;
        this.center = center;
    }

    public int getNumOfSides() {
        return numOfSides;
    }

    public void setNumOfSides(int numOfSides) {
        this.numOfSides = numOfSides;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double area() {
        return (numOfSides * sideLength * sideLength) / (4 * Math.tan(Math.PI / numOfSides));
    }

    public double perimeter() {
        return sideLength * numOfSides;
    }

}
