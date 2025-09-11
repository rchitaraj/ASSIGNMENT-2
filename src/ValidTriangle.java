//6. Write a program to check whether three sides can form a valid triangle using the triangle property.//
import java.util.Scanner;
public class ValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter side 1");
        int a = sc.nextInt();
        System.out.println("enter side 2");
        int b = sc.nextInt();
        System.out.println("enter side 3");
        int c = sc.nextInt();
        System.out.println("enter angle 1");
        int a1 = sc.nextInt();
        System.out.println("enter angle 2");
        int a2 = sc.nextInt();
        System.out.println("enter angle 3");
        int a3 = sc.nextInt();
        if(a+b>c || b+c>a || a+c>b && a1+a2+a3==180){
            System.out.println("It is a triangle");
        }else{
            System.out.println("It is not a valid triangle");
        }
    }
}
