//9. Write a program to find the second largest number among three numbers using conditional Statements//

import java.util.Scanner;
public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the a");
        int a = sc.nextInt();
        System.out.println("enter the b");
        int b = sc.nextInt();
        System.out.println("enter the c");
        int c = sc.nextInt();
        if (a > b) {
            if (a < c) {
                System.out.println("a is second largest");
            } else if (b > c) {
                System.out.println("b is second largest");
            } else {
                System.out.println("c is second largest");
            }
        } else {
            if (a > c) {
                System.out.println("a is second greater");
            } else {
                if (b < c) {
                    System.out.println("b is second greater");
                } else {
                    System.out.println("c is second greater");
                }
            }
        }
    }
}
