/* Add the following functionality to the method poikkeus

The method attempts to convert the number of a String variable to a number.
If the conversion fails, the method returns "no"; if the conversion succeeds, the method returns "yes" */


public String poikkeus(String luku) {
    try {
        Integer.parseInt(luku);  
        return "yes";             
    } catch (NumberFormatException e) {
        return "no";              
    }
}
