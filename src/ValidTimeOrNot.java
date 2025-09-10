import java.util.Scanner;
public class ValidTimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the time in hours");
        int hours = sc.nextInt();
        System.out.println("enter the time in minutes");
        int minutes = sc.nextInt();
        if(hours<24 && minutes<60){
            System.out.println("the entered time is valid");
        }else{
            System.out.println("entered time is not valid");
        }
    }

}
