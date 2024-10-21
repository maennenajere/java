/* Next, let's practise the Builder pattern, which is somewhat familiar to us through the examples with method chaining and the class StringBuilder. Further example with Java and explanation of the pattern can be found here.

Write a class Calculator, which provides the four common arithmetic operations (addition, subtraction, multiplication and division) through the Builder pattern. Below is an example illustrating how the class should work, where the result of the "equation" should be ((5+2)*2)-2.5 = 11.5.

Calculator cb = new Calculator(5.0); // Initial value 5.0
Double result = cb.add(2.0).multiply(2.0).subtract(2.5).getResult();
The class should have the following members:

A private member Double result, which has the current result of the operations.

A public constructor that takes the initial value of result as parameter.

Getter for the member result.

Methods add, subtract, multiply, divide, which all take one Double value as parameter, perform the corresponding operation with result and the value, and return the current class instance, as required by the pattern. */
package designpatterns;

public class Calculator {

    private Double result;

    public Calculator(Double initialValue) {
        this.result = initialValue;
    }

    public Double getResult() {
        return result;
    }

    public Calculator add(Double value) {
        this.result += value;
        return this;
    }

    public Calculator subtract(Double value) {
        this.result -= value;
        return this;
    }

    public Calculator multiply(Double value) {
        this.result *= value;
        return this;
    }

    public Calculator divide(Double value) {
        if (value != 0) {
            this.result /= value;
        } else {
            System.out.println("Cannot divide by zero!");
        }
        return this;
    }
}
