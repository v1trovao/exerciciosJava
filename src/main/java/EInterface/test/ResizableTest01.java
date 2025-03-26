package EInterface.test;

import EInterface.dominio.Rectangle;

public class ResizableTest01 {

    public static void main(String[] args) {
        Rectangle rec = new Rectangle(3, 4);

        System.out.println("Base (w) = " + rec.getWeight());
        System.out.println("Altura (h) = " + rec.getHeight());

        rec.getArea();

        // Mudando a base e altura
        rec.resizeWidth(5);

        System.out.println("----------");

        System.out.println("Base (w) = " + rec.getWeight());
        System.out.println("Altura (h) = " + rec.getHeight());

        rec.getArea();
    }
}
