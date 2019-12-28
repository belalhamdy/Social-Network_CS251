package UserPackage;

import Sys.API;
import Sys.PaymentsView;

import java.util.Scanner;

public class UserView {
    private static Scanner in = new Scanner(System.in);

    IUser loggedin;

    public UserView(IUser loggedin) {
        this.loggedin = loggedin;
    }

    public void showActionsMenu(){
        System.out.println("Hello " + loggedin.getName());
        while(true){
            System.out.println("What would you like to do?");
            System.out.println("1 - Edit Profile (not implemented)");
            System.out.println("2 - Upgrade Subscription");
            System.out.println("3 - Add user as friend");
            System.out.println("4 - logout");

            int ans = in.nextInt();
            in.nextLine();
            if (ans == 1){
                System.out.println("NOT IMPLEMENTED");
            }else if (ans == 2){
                if (loggedin.getUserType() == IUser.UserType.premiumuser){
                    System.out.println(loggedin.getName() + " is already premium!");
                }else{
                    boolean payment = PaymentsView.showPaymentWindow();
                    if (payment){
                        loggedin.setUserType(IUser.UserType.premiumuser);
                        System.out.println(loggedin.getName() + " upgraded!");
                    }
                    else
                        System.out.println("Payment cancelled!");
                }
            }else if (ans == 3){
                System.out.println("Enter username: ");
                String username = in.nextLine();
                IUser friend = API.getInstance().getUserByUsername(username);
                if (friend == null){
                    System.out.println("Cannot find user with the specified username");
                }else{
                    loggedin.addFriend(friend);
                    System.out.println(username + " added as a friend, they can now see your posts!");
                    System.out.println("To be able to see their posts, make sure they add you to their friendlist!");
                }
            }else if (ans == 4){
                return;
            }
        }

    }
}
