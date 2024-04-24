package org.example.homework7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    private static final String EMAIL_PATTERN =
            "^[A-Za-z0-9+_.-]+@([A-Za-z0-9.-]+\\.[A-Za-z]{2,}(\\.[A-Za-z]{2,})?)$";
    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);

    public static boolean isValidEmail(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public static void main(String[] args) {
        String[] testEmails = {
                "john.doe@example.com",
                "jane.doe@company.co.uk",
                "invalid-email",
                "user@domain",
                "user@domain."
        };

        for (String email : testEmails) {
            boolean isValid = isValidEmail(email);
            System.out.println(email + " is " + (isValid ? "valid" : "invalid"));
        }
    }
}
