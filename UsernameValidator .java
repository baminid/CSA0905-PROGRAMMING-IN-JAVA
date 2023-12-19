import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a username
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        // Validate the username
        if (isValidUsername(username)) {
            System.out.println("Username is valid!");
        } else {
            System.out.println("Invalid username. Please follow the specified rules.");
        }

        // Close the Scanner
        scanner.close();
    }

    // Function to validate the username based on rules
    private static boolean isValidUsername(String username) {
        // Check if the username is not null and meets certain criteria
        // For example, we check if it has a minimum length of 5 characters and contains only letters and digits
        if (username != null && username.length() >= 5 && username.matches("[a-zA-Z0-9]+")) {
            return true;
        } else {
            return false;
        }
    }
}
