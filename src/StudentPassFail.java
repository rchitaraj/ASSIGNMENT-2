//8.Write a program to input marks of 5 subjects and check whether the student has passed overall (average ≥ 40).//

import java.util.Scanner;
public class StudentPassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks for subject 1");
        int subject1 = sc.nextInt();
        System.out.println("enter the marks for subject 2");
        int subject2 = sc.nextInt();
        System.out.println("enter the marks for subject 3");
        int subject3 = sc.nextInt();
        System.out.println("enter the marks for subject 4");
        int subject4 = sc.nextInt();
        System.out.println("enter the marks for subject 5");
        int subject5 = sc.nextInt();
        float average =(subject1+subject2+subject3+subject4+subject5)/5;
        if (average>=70 && average<=100){
            System.out.println("student passed");
        }else if(average>=50 && average<70){
            System.out.println("student passed");
        }else if (average>=40 && average<50){
            System.out.println("student passed");
        }else{
            System.out.println("student fail");
        }
    }
}
