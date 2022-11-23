package module6.activity;

public class AbstractionActivity {
    public static void main(String[] args) {
        // Create a Rectangle object with length 10 and breadth 5
        Rectangle rectangle = new Rectangle(5, 6);
        // Create a Circle object with radius 5
        Circle circle = new Circle(5);
        // Set the color of the rectangle to red
        rectangle.setColor("red");
        // Set the color of the circle to blue
        circle.setColor("blue");
        // Print the area and perimeter of the rectangle
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
        System.out.println("Perimeter of rectangle: " + rectangle.calculatePerimeter());
        System.out.println("Color of rectangle: " + rectangle.getColor());
        // Print the area and perimeter of the circle
        System.out.println("Area of circle: " + circle.calculateArea());
        System.out.println("Perimeter of circle: " + circle.calculatePerimeter());
        System.out.println("Color of circle: " + circle.getColor());



    }
}
