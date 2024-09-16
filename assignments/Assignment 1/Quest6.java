package java_basics;

/*
 * Modify the method below to greet all visitors by printing out to console
 * the string "Hello n!" for each of them, where n is the number of visitor,
 * starting from 1.
 */

public class Quest6 {
    public Integer fibonacci(Integer n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}