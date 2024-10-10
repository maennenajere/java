/* Create a class Dialog with window width and height. Additionally, the class has a string variable type.
a. Add a constructor to the Dialog class that takes the window width and height as parameters and sets the type to "default", and another constructor that also takes the type as a parameter.
b. Subclasses can directly modify the height and width, so set appropriate visibility for them. Subclasses are WindowsDialog and MacDialog.
c. WindowsDialog: A constructor that takes the width and height. Also automatically sets the type to "Win" (using the superclass constructor).
d. MacDialog: A constructor that takes the width and height. Also automatically sets the type to "Mac".
e. Add a method to the Dialog class that returns a string description of the window.
f. Add a method getTruePixels to the subclasses that returns the number of pixels (width * height) so that Windows adds 10px to the window height in the calculation and Mac 5px.
g. Test the structure's functionality in the main program. */

public class Dialog {
    protected int width;
    protected int height;
    private String type;

    public Dialog(int width, int height) {
        this.width = width;
        this.height = height;
        this.type = "default";
    }

    public Dialog(int width, int height, String type) {
        this.width = width;
        this.height = height;
        this.type = type;
    }

    public String getDescription() {
        return "Dialog Type: " + type + ", Width: " + width + ", Height: " + height;
    }
}

public WindowsDialog(int width, int height) {
    super(width, height, "Win");
}

public MacDialog (int width, int height) {
    super(width, height, "Mac");
}

public int getTruePixels() {
    return width * (height + 10);
}

