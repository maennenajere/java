/* Write class Rectangle that implements interface Shape, and additionally:

Member variables of type Double width and length.

Again constructor with the parameter Double[] params.

The constructor must check that there are exactly two parameters in the Double array, i.e. the width and length of the rectangle.
If there are more or less parameters than two, it throws IllegalArgumentException with message Number of parameters wrong for rectangle, needs width and length. 
Do not catch this exception in the method, since we want to test it. */
package designpatterns;

public class Rectangle implements Shape {

    private Double width;
    private Double height;

    public Rectangle(Double[] params) {
        if (params.length != 2) {
            throw new IllegalArgumentException("Number of parameters wrong for rectangle, needs width and length");
        }
        this.width = params[0];
        this.height = params[1];
    }

    @Override
    public Double getArea() {
        return width * height;
    }

    @Override
    public Double[] getParams() {
        return new Double[]{width, height};
    }
}
