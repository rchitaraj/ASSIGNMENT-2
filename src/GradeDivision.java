//18. Write a program to input marks of 5 subjects and print the division (First/Second/Third/Fail) using nested if-else.//
import java.util.Scanner;
public class GradeDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of subject 1");
        float  subject1= sc.nextInt();
        System.out.println("enter the marks of subject 2");
        float subject2= sc.nextInt();
        System.out.println("enter the marks of subject 3");
        float  subject3= sc.nextInt();
        System.out.println("enter the marks of subject 4");
        float  subject4= sc.nextInt();
        System.out.println("enter the marks of subject 5");
        float  subject5= sc.nextInt();
        float percentage= ((subject1 +subject2 +subject3 +subject4 +subject5)/500)*100;
        if ( percentage>=70 && percentage <= 100) {
            System.out.println("you are first divsion");
        }else if (percentage>=60  && percentage<70) {
            System.out.println("you are second division");
        }else if (percentage>=40 && percentage <60) {
            System.out.println("you are third division");
        }else if (percentage<40) {
            System.out.println("you fail");
        }else{
            System.out.println("invalid input");
        }

    }
}
