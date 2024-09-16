package java_basics;

/*
 * Modify the method below to print out all even numbers above zero until the
 * function parameter limit. The numbers are separated by comma and printed
 * without new line.
 *
 * Example output when limit is 9:
 * 2,4,6,8
 */

 public class Quest4 {
     public void oddOut(Short limit) {
         if (limit <= 2) {
             if (limit == 2) {
                 System.out.print("2");
             } else {
                 System.out.println("No even numbers to print.");
             }
         } else {
             for (int i = 2; i < limit; i += 2) {
                 if (i > 2) {
                     System.out.print(",");
                 }
                 System.out.print(i);
             }
         }
     }
 }
