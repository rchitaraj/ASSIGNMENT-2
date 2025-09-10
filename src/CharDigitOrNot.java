import java.util.Scanner;
public class CharDigitOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character");
        char ch = sc.next().charAt(0);
        if (ch >= '1' && ch <= '9') {
            if (ch % 2 == 0) {
                System.out.println("it is an even digit");
            } else {
                System.out.println("it is a odd digit");
            }
        } else {
            System.out.println("entered character is not a digit");
        }
    }
}

