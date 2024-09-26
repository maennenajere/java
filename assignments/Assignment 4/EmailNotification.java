package exercises;

/* Create a class EmailNotification that extends Notification and implements Sendable:

Implement constructor EmailNotification(String recipient, String message) that calls superclass constructor.

Override the formatMessage() method to format the message for email. Example output is john.doe@example.com: Welcome to the system!, where you have both the email address (as recipient) and message.

Implement the send() method to simulate sending the email, which returns Sent email to john.doe@example.com: Welcome to the system! */
public class EmailNotification extends Notification implements Sendable {

    public EmailNotification(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public String formatMessage() {
        return recipient + ": " + message;
    }

    @Override
    public String send() {
        return "Sent email " + formatMessage();
    }
}
