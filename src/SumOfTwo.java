// 3. Write a program to check whether the sum of two numbers is greater than 100 or not. //
import java.util.Scanner;
public class SumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        System.out.println("enter the number");
        int b = sc.nextInt();
        int sum =a+b;
        if (sum>100){
            System.out.println("the sum is greater than 100");
        }else{
            System.out.println("the sum is not greater than 100");
        }
    }
}
