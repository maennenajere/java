/* Add code that prints without line break the numbers 0 - ceiling
so that number 2 is not printed.
For example, if the ceiling is 4, 0134 is printed */

public void tulosta(int x) {
    int katto = x;

    for (int i = 0; i <= katto; i++) {
        if (i != 2) {
            System.out.print(i);
        }
    }
}