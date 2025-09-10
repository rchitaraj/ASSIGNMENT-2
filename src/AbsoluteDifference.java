//15. Write a program to check whether the absolute difference between two numbers is less than. //
//10. 16. Write //
import java.util.Scanner;
public class AbsoluteDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x");
        int x = sc.nextInt();
        System.out.println("enter the value of y");
        int y = sc.nextInt();
        int diff = x - y;
        if (x < 0 && y < 0 && x>y || x == 0 && y == 0 || x > 0 && y < 0) {
            if (diff < 10) {
                System.out.println(diff+" is an absolute difference");
            }
        } else if (x < y || x < 0 && y > 0 || x < 0 && y<0 && y>x ) {
            if (diff < 10) {
                int a = (-1) * diff;
                System.out.println(a+ " is an absolute difference");
            }
        }else if(x==y){
            if(diff<10){
                System.out.println(diff+" is an absolute difference");
            }
        } else {
            System.out.println(diff+" is not na absolute difference");
        }
    }
}