package module6.activity;

public abstract class Shape {

    public String color;

    public Shape() {

    }
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public void setColor(String c) {
        color = c;
    }

    public String getColor() {
        return color;
    }

}
