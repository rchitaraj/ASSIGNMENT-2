// 5. Write a program to check whether a number is a three-digit number divisible by 7. //
import java.util.Scanner;
public class DivisibiltyBy7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int lastdigit = num % 10;
        int remaining = num / 10;
        int doubled = lastdigit * 2;
        int sub = remaining - doubled;
        if (sub % 7 == 0 || sub == 0) {
            System.out.println("the number is divisble by 7");
        } else {
            System.out.println(" the number is not divible by 7");
        }
    }
}
