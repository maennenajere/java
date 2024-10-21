/* Finally, create class ShapeFactory that follows the Factory Method pattern to create instances of shapes, i.e. circle or rectangle.

As in the Factory Method, declare default constructor as private.

Add static method create(String type, Double[] params) that creates the shapes.
So it must return an instance of interface Shape based on the parameter type, which can be either "circle" or "rectangle".
The parameter params is passed to the constructor of the instances to be created.
Thus it contains either the radius of a circle or the width and length of the rectangle. */
package designpatterns;

public class ShapeFactory {

    private ShapeFactory() {
    }

    public static Shape create(String type, Double[] params) {
        if (type.equalsIgnoreCase("circle")) {
            return new Circle(params);
        } else if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle(params);
        } else {
            throw new IllegalArgumentException("nono: " + type);
        }
    }
}
