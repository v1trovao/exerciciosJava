package FPolimorfismo.ex2.dominio;

public class Bicycle extends Vehicle {

    public void speedUp(int valor) {
        super.speedUp(valor);
        System.out.println("Velocidade da bicicleta aumentou para " + this.getSpeed());
    }

    public void speedDown(int valor) {
        super.speedDown(valor);
        System.out.println("Velocidade da bicicleta diminui para " + this.getSpeed());
    }
}
