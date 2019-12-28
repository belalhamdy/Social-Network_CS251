package UserPackage;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class UserAccountView {
    private static Scanner in = new Scanner(System.in);

    public static IUser showLoginRegisterForm() {
        while (true) {
            System.out.println("Would you like to: ");
            System.out.println("1- Log in to existing account");
            System.out.println("2- Register a new account");
            System.out.println("3- Exit");
            int ans = in.nextInt();
            in.nextLine();
            if (ans == 1) {
                IUser candidate = showLoginForm();
                if (candidate != null) return candidate;
            } else if (ans == 2) {
                if (showRegisterForm()) return showLoginForm();
            } else if (ans == 3) {
                return null;
            } else {
                System.out.println("Please choose a valid option.");
            }
        }
    }

    private static boolean showRegisterForm() {
        System.out.println("Welcome Please sign up to start your tour\n");

        try {
            IUser newUser = new User();
            System.out.println("Please enter your data:");
            System.out.println("Name: ");
            newUser.setName(in.nextLine());
            while (true) {
                System.out.println("Username: ");
                newUser.setUsername(in.nextLine());
                IUser candidate = Sys.API.getInstance().getUserByUsername(newUser.getUsername());
                if (candidate == null) break;
                else System.out.println("Username already exists!");
            }

            System.out.println("Password: ");
            newUser.setPassword(in.nextLine());
            System.out.println("Email: ");
            newUser.setEmail(in.nextLine());
            System.out.println("Gender: ");
            newUser.setGender(IUser.GenderType.valueOf(in.nextLine().toLowerCase()));
            System.out.println("Country: ");
            newUser.setCountry(in.nextLine());
            System.out.println("DateOfBirth: ");
            newUser.setDateOfBirth(new SimpleDateFormat("dd/MM/yyyy").parse(in.nextLine()));

            Sys.API.getInstance().registerUser(newUser);
            return true;
        } catch (Exception ex) {
            System.out.println("Something went wrong!");
            ex.printStackTrace();
            return false;
        }
    }

    private static IUser showLoginForm() {
        System.out.println("Hello Please login to your account\n");
        System.out.println("Enter your username: ");
        String username = in.nextLine();
        System.out.println("Enter your password: ");
        String password = in.nextLine();
        IUser candidate = Sys.API.getInstance().getUserByUsername(username);
        if (candidate != null && candidate.checkPassword(password))
            return candidate;
        else {
            System.out.println("Incorrect username/password");
            return null;
        }
    }
}
