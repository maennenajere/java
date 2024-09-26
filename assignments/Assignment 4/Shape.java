package exercises;

/* Create an abstract class Shape:

Add a protected attribute String name.

Implement a constructor Shape(String name) to initialize the name attribute.

Implement the abstract method public abstract  Double calculateArea().

Implement the method public String getName() that returns the name of the shape. */
public abstract class Shape {

    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract Double calculateArea();

    public String getName() {
        return name;
    }
}
