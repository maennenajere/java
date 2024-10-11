/* The method kirjain takes a name and an index as parameters and returns the indexed letter of the name.

Add exception handling to the method as follows:
If the name is null, the method returns a plus sign +
If the index is not found in the name, the method returns minus sign -.

 Use the error types IndexOutOfBoundsException and NullPointerException. */


public char kirjain(String nimi, int indeksi) {
    if (nimi == null) {
        return '+'; 
    }

    try {
        return nimi.charAt(indeksi);  
    } catch (IndexOutOfBoundsException e) {
        return '-'; 
    }
}
