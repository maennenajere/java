package exercises;

/*Create a class Rectangle that extends Shape:

Add private attributes Double length and Double width.

Implement the constructor Rectangle(String name,  Double length,  Double width) to initialize the name, length, and width attributes.

Override the calculateArea() method to return the area of the rectangle (using length * width). */
public class Rectangle extends Shape {

    private Double length;
    private Double width;

    public Rectangle(String name, Double length, Double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public Double calculateArea() {
        return length * width;
    }
}
