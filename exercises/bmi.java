/* The code contains the weight and height of the person. Add a part of the code that calculates the body mass index and prints the text under the following conditions:

If the body mass index is between 18.5 and 25, print "normaali"
Otherwise, print "huomio" */

public void tulosta(double w, double l){
    double paino = w;
    double pituus = l;

    double bmi = paino / (pituus * pituus);

    if (bmi >= 18.5 && bmi <= 25) {
        System.out.println("normaali");
    } else {
        System.out.println("huomio");
    }
}