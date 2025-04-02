package FPolimorfismo.ex2.dominio;

public class Vehicle {

    private int speed = 0;

    public void speedUp(int valor) {
        speed += valor;
    }

    public void speedDown(int valor) {
        speed -= valor;
    }

    public int getSpeed() {
        return speed;
    }
}
