package EInterface.dominio;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void getArea() {
        System.out.println("Circle's area: " + Math.floor(Math.PI * Math.pow(radius, 2)) + "m2");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
