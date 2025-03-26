package EInterface.dominio;

public class Triangle implements Shape {

    private int height;
    private int weight;

    public Triangle(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public void getArea() {
        System.out.println("Triangle's Area: " + (height * weight / 2) + "m2");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
