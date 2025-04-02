package FPolimorfismo.ex1.dominio;

public class Animal {

    protected String tempoVida;
    protected boolean ehDomestico;

    public Animal(String tempoVida, boolean ehDomestico) {
        this.tempoVida = tempoVida;
        this.ehDomestico = ehDomestico;
    }

    public void sound(){
        System.out.println("Animal sound");
    }

    public String getTempoVida() {
        return tempoVida;
    }

    public void setTempoVida(String tempoVida) {
        this.tempoVida = tempoVida;
    }

    public void isDomestico() {
        if (ehDomestico) {
            System.out.println("Domestico");
        } else {
            System.out.println("Não é doméstico");
        }
    }
}
