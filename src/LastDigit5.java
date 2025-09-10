// 2. Write a program to check whether the last digit of a number is 5.//
import java.util.Scanner;
public class LastDigit5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int lastdigit = num % 10;
        if (lastdigit == 5) {
            System.out.println("valid");
        } else {
            System.out.println("not valid");
        }
    }
}
