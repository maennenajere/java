package exercises;

import java.util.HashSet;


/* Lets focus on the three set operations union, intersection and difference, to the two given member sets in the class.

Now a class SetOperations has:

Add private members HashSet<Integer> set1 and HashSet<Integer> set2.

Implement the constructor SetOperations(HashSet<Integer> s1, HashSet<Integer> s2), which will initialize the two member sets set1 and set2.

Implement the method public HashSet<Integer> union(), which returns the union of the member sets.

Implement the method public HashSet<Integer> intersection(), which returns the union of the member sets.

Implement the method public HashSet<Integer> difference(), which returns the difference of the member sets.

Hints:

Use the class HashSet instead the interface Set.

If you are not familiar with Set Theory, you should study the basic set operations briefly in the Internet. */
public class SetOperations {

    private HashSet<Integer> set1;
    private HashSet<Integer> set2;

    public SetOperations(HashSet<Integer> s1, HashSet<Integer> s2) {
        set1 = s1;
        set2 = s2;
    }

    public HashSet<Integer> union() {
        HashSet<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public HashSet<Integer> intersection() {
        HashSet<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }

    public HashSet<Integer> difference() {
        HashSet<Integer> differenceSet = new HashSet<>(set1);
        differenceSet.removeAll(set2);
        return differenceSet;
    }

}
