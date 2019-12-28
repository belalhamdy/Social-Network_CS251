package Sys;

import java.util.Scanner;

public class PaymentsView {
    private static Scanner in = new Scanner(System.in);

    public static boolean showPaymentWindow(){
        System.out.println("(This should launch the appropriate delegate to PayPal's API)");
        System.out.println("(For testing purposes assume that everything was handled correctly)");
        System.out.println("Do you want to confirm your payment?\n1- Confirm\n2- Cancel");
        int ans = in.nextInt();
        in.nextLine();
        if (ans == 1) return true;
        else return false;

    }
}
