package exercises;

/* Create a class Circle that extends abstract class Shape:

Add a private attribute Double radius.

Implement the constructor Circle(String name,  Double radius) to initialize the name and radius attributes.

Override the calculateArea() method to return the area of the circle (using Math.PI * radius * radius). */
public class Circle extends Shape {

    private Double radius;

    public Circle(String name, Double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public Double calculateArea() {
        return Math.PI * radius * radius;
    }
}
