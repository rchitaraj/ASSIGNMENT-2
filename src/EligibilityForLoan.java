import java.util.Scanner;
public class EligibilityForLoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age");
        int age = sc.nextInt();
        if (age >= 21) {
            System.out.println("enter the income");
            int income = sc.nextInt();
            if (income >= 25000) {
                System.out.println("person is eligible for loan");
            } else {
                System.out.println("person is not eligible for loan");
            }
        }else{
            System.out.println("entered age is not valid for loan");
        }
    }
}
