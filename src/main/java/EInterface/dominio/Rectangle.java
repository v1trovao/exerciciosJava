package EInterface.dominio;

public class Rectangle implements Shape, Resizable{

    private int width; //base
    private int height; //altura

    public Rectangle(int weight, int height) {
        this.width = weight;
        this.height = height;
    }


    public void getArea() {

        System.out.println("Rectangle's Area: " + width * height + "m2");
    }

    public void resizeWidth(int width) {
        this.width = width;
    }

    @Override
    public void resizeHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return width;
    }

    public void setWeight(int weight) {
        this.width = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
