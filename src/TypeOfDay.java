import java.util.Scanner;
public class TypeOfDay {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("enter the day");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("monday is a weekday");
                break;
            case 2:
                System.out.println("tuesday is a weekday");
                break;
            case 3:
                System.out.println("wednesday is a weekday");
                break;
            case 4:
                System.out.println("thursday is a weekday");
                break;
            case 5:
                System.out.println("friday is a weekday");
                break;
            case 6:
                System.out.println("saturday is a weekend");
                break;
            case 7:
                System.out.println("sunday is a weekend");
                break;
            default:
                System.out.println("exit");
        }
    }
}
