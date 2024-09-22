package exercises;

import java.util.Vector;

/* Let's continue our exploration with the Fibonacci sequence.
The class Fibonacci has:

private member Vector<Integer>, a collection storing the sequence.

Constructor with Integer parameter. It will initialize the Fibonacci sequence into the private Vector collection.
If this parameter is 8, you will need to calculate and store the first 8 Fibonacci numbers into the collection. 
It is tested that the collection actually has this sequence.

Getter for the private collection, i.e. method getNumbers().

Method addNext() which will calculate and add the next Fibonacci number into the collection and return it.

Method isFibonacci(Integer num) which will check if the given number is a Fibonacci number.
Additionally, this method will add the missing Fibonacci sequence until the num into the collection.

Method compareSequence(Vector<Integer> seq) that will check (true / false) if the given sequence is a Fibonacci sequence. Again,
similarly this method will add the missing sequence between to the collection. 
Last number in the updated sequence is the largest Fibonacci number equal or smaller than the largest number in seq. */
public class Fibonacci {

    private Vector<Integer> sequence;

    public Fibonacci(Integer n) {
        sequence = new Vector<>();
        if (n > 0) {
            sequence.add(0);
        }
        if (n > 1) {
            sequence.add(1);
        }
        for (int i = 2; i < n; i++) {
            sequence.add(sequence.get(i - 1) + sequence.get(i - 2));
        }
    }

    public Vector<Integer> getNumbers() {
        return sequence;
    }

    public Integer addNext() {
        int next = sequence.get(sequence.size() - 1) + sequence.get(sequence.size() - 2);
        sequence.add(next);
        return next;
    }

    public boolean isFibonacci(Integer num) {
        while (sequence.get(sequence.size() - 1) < num) {
            addNext();
        }
        return sequence.contains(num);
    }

    public boolean compareSequence(Vector<Integer> seq) {
        int max = seq.get(seq.size() - 1);
        while (sequence.get(sequence.size() - 1) < max) {
            addNext();
        }
        return sequence.containsAll(seq);
    }
}
