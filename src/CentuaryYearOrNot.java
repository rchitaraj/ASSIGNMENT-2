//11. Write a program to check whether a given year is a century leap year or not//
import java.util.Scanner;
public class CentuaryYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year");
        int year= sc.nextInt();
        if(year%400==0 && year%100==0){
            System.out.println(year+" The given year is a leap year");
        }else{
            System.out.println(year+" The given year is not a leap year");
        }
    }
}
