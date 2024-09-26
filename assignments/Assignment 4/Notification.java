package exercises;

/* Create an abstract class Notification:

Add a protected attributes String recipient and String message.

Implement a constructor Notification(String recipient, String message) to set the attribute values.

Has abstract method public abstract String formatMessage(). */
abstract public class Notification {

    protected String recipient;
    protected String message;

    public Notification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    abstract public String formatMessage();
}
