import java.util.Scanner;
public class CoordinateSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the x coordinate");
        int x = sc.nextInt();
        System.out.println("enter the y coordinate");
        int y = sc.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("point lies in first coordinate");
        } else if (x < 0 && y > 0) {
            System.out.println("point lies in second coordinate");
        } else if (x < 0 && y < 0) {
            System.out.println("point lies in third ccordinate ");
        } else if (x > 0 && y < 0) {
            System.out.println(" point lies in fourth coordinate");
        } else {
            System.out.println("not valid value");
        }
    }
}
