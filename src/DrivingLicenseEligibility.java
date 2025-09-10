//19. Write a program to check whether a person is eligible for a driving license (age ≥ 18 and must pass a vision test).//
import java.util.Scanner;
public class DrivingLicenseEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age");
        int age = sc.nextInt();
        System.out.println("enter the value true or false");
        boolean VisionTest = sc.nextBoolean();
        if (age>=18) {
            if (VisionTest==true) {
                System.out.println("person eligible for driving license");
            }else{
                System.out.println("person not eligible for driving license");
            }
        }else{
            System.out.println("the age is not valid");
        }
    }
}
