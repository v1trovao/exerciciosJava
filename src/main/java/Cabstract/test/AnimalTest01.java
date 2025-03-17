package Cabstract.test;

import Cabstract.dominio.Cat;
import Cabstract.dominio.Pig;

public class AnimalTest01 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Zoe");
        Pig peppa = new Pig("Peppa");

        cat1.sound();
        peppa.sound();
    }
}
