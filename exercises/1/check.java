/* Modify the code to print the text "pos" if num is positive, "neg" if num is negative and "zero" if num is zero */

public void tarkista(int numero){

    int num = numero;

    if (num > 0) {
        System.out.println("pos");
    } else if (num < 0) {
        System.out.println("neg");
    } else {
        System.out.println("zero");
    }
}