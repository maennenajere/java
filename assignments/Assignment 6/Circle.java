/* Write class Circle that implements interface Shape, and additionally:

Member variable Double radius.

Constructor with the parameter Double[] params.

The constructor must check that for circle, there is exactly one parameter in the array, i.e. the radius of the circle in params[0].
If there are more or less items in the array, it throws IllegalArgumentException with message Number of parameters wrong for circle, needs radius.
Do not catch this exception in the method, since we want to test it. */
package designpatterns;

public class Circle implements Shape {

    private Double radius; // Jäsenmuuttuja säteelle

    public Circle(Double[] params) {
        if (params.length != 1) {
            throw new IllegalArgumentException("Number of parameters wrong for circle, needs radius");
        }
        this.radius = params[0];
    }

    @Override
    public Double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public Double[] getParams() {
        return new Double[]{radius};
    }
}
