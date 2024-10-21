/* You are tasked with creating a logger for an application. The logger should be a singleton to ensure that all parts of the application use the same logger instance and logs will be synchronized.

Create a class Logger:

Make the constructor private to prevent instantiation from other classes.

Create a private static variable of the same class, called INSTANCE.

Provide a public and static method getInstance() that returns the singleton instance. The method should create a new instance only if it doesn't exist.

Implement a method String log(String message) to return the log message with a prefix Logger:. So, it should return log messages like Logger: Test message. */
package designpatterns;

public class Logger {

    private static Logger INSTANCE = null;

    private Logger() {
    }

    public static Logger getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Logger();
        }
        return INSTANCE;
    }

    public String log(String message) {
        return "Logger: " + message;
    }
}
