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
