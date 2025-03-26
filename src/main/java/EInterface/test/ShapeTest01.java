package EInterface.test;

import EInterface.dominio.Circle;
import EInterface.dominio.Rectangle;
import EInterface.dominio.Triangle;

public class ShapeTest01 {

    public static void main(String[] args) {
        Rectangle rec = new Rectangle(4, 5);
        Circle cic = new Circle(3);
        Triangle tri = new Triangle(10, 6);

        rec.getArea();
        cic.getArea();
        tri.getArea();
    }
}
