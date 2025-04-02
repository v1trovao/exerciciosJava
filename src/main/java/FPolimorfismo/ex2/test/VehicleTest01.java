package FPolimorfismo.ex2.test;

import FPolimorfismo.ex2.dominio.Bicycle;
import FPolimorfismo.ex2.dominio.Vehicle;

public class VehicleTest01 {
    public static void main(String[] args) {
        Vehicle v1 = new Bicycle();

        v1.speedUp(10);
        v1.speedUp(10);
        System.out.println("Velocidade atual: " + v1.getSpeed());

        v1.speedDown(10);
        System.out.println("Velocidade atual: " + v1.getSpeed());


    }
}
