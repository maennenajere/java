package exercises;

/* Create a class SMSNotification that extends Notification and implements Sendable:

Implement constructor SMSNotification(String recipient, String message) that calls superclass constructor. Recipient should be phone number in the form 0123456789.

Override the formatMessage() method to format the message for email. Example output is +358-123456789: Good morning, where you have both the phone number (as recipient) and message. Note that you must remove the first zero from the phone number, before adding the country code of Finland (+358) to the output.

Implement the send() method to simulate sending the email, which returns Sent SMS +358-123456789: Good morning. */
public class SMSNotification extends Notification implements Sendable {

    public SMSNotification(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public String formatMessage() {
        String formattedRecipient = "+358-" + recipient.substring(1);
        return formattedRecipient + ": " + message;
    }

    @Override
    public String send() {
        return "Sent SMS " + formatMessage();
    }
}
