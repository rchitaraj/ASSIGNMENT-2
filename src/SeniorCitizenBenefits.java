// 4. Write a program to check whether a person is eligible for senior citizen benefits (age ≥ 60). //
import java.util.Scanner;
public class SeniorCitizenBenefits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age");
        int age = sc.nextInt();
        if(age>=60){
            System.out.println("person is eligible for senior citizen benefits");
        }else{
            System.out.println("person is not eligible for senior citizen benefits");
        }
    }
}
