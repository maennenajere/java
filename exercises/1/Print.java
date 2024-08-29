/* Calculate the product of the variables of luku1 and luku2
Multiply the result of the previous calculation by two
Add 1 to the previous result.
Print the result to the console.  */

public class Print {
    public void print(int x, int y) {
        int luku1 = x;
        int luku2 = y;

        int tulo = luku1 * luku2;
        tulo = tulo * 2 + 1;

        System.out.println(tulo);
    }
}