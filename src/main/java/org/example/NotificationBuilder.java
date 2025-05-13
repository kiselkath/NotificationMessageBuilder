package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 * 🧪 NotificationBuilder Assignment
 *
 * In real-world systems like notifications, we often need to build dynamic, formatted messages.
 * You'll use StringBuilder and StringBuffer to do that efficiently.
 */
public class NotificationBuilder {

    public static void main(String[] args) {
        // Пример 1
        String message = buildNotificationSingleThreaded("Amalia", "login");
        System.out.println(message);
        // Пример 2
        System.out.println(buildNotificationThreadSafe("Alex", "payment"));
    }

    /**
     * ✅ Task 1: Build a notification using StringBuilder (not thread-safe, but fast).
     *
     * @param recipient the name of the user receiving the message
     * @param event     the type of event (e.g., "payment", "login", etc.)
     * @return formatted notification string
     */
    public static String buildNotificationSingleThreaded(String recipient, String event) {
        // TODO: Create a new StringBuilder instance
        StringBuilder sb = new StringBuilder();

        // TODO: Append "Hi <recipient>, " to the builder
        sb.append("Hi ").append(recipient).append(" ,");

        // TODO: Append "your <event> was successful. "
        sb.append("your ").append(event).append(" was successful. ");

        // TODO: Generate current date and time as a formatted string
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // TODO: Append "Timestamp: <datetime>. "
        sb.append("Timestamp: ").append(formatter.format(now)).append(".");
        // TODO: Return the final string from the builder
        return sb.toString();
    }

    /**
     * ✅ Task 2: Build a thread-safe notification using StringBuffer.
     *
     * @param recipient the name of the user receiving the message
     * @param event     the type of event (e.g., "password reset", "signup", etc.)
     * @return formatted notification string
     */
    public static String buildNotificationThreadSafe(String recipient, String event) {
        // TODO: Create a new StringBuffer instance
        StringBuffer sb = new StringBuffer();

        // TODO: Append "Hello <recipient>, " to the buffer
        sb.append("Hello ").append(recipient).append(", ");

        // TODO: Append "this is to inform you that your <event> has been completed. "
        sb.append("this is to inform you that your ")
                .append(event)
                .append(" has been completed. ");

        // TODO: Generate a timestamp string in a readable format
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd yyyy HH:mm:ss");

        // TODO: Append "Generated at: <timestamp>. "
        sb.append("Generated at: ").append(formatter.format(now)).append(".");

        // TODO: Return the final string from the buffer
        return sb.toString();
    }
}