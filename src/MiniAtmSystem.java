//17. Write a program to implement a mini ATM system using a switch (options: Check Balance, Deposit, Withdraw, Exit). 18. Write a program to input marks of 5 subjects and print the division//
import java.util.Scanner;
public class MiniAtmSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the operation you want to perfrom");
        int operations = sc.nextInt();
        switch (operations) {
            case 1:
                System.out.println("Check Balance");
                break;
            case 2:
                System.out.println("Deposit");
                break;
            case 3:
                System.out.println("Deposit");
                break;
            case 4:
                System.out.println("Withdraw");
                break;
            default:
                System.out.println("exit");
        }
    }
}
