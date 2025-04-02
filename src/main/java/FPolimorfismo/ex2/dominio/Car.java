package FPolimorfismo.ex2.dominio;

public class Car extends Vehicle {

    @Override
    public void speedUp(int valor) {
        super.speedUp(valor);
        System.out.println("Velocidade do carro aumentou para" + this.getSpeed());
    }

    public void speedDown(int valor) {
        super.speedDown(valor);
        System.out.println("Velocidade do carro diminui para" + this.getSpeed());
    }
}
