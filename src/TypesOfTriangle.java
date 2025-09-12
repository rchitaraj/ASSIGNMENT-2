//7. Write a program to check whether a triangle is Equilateral, Isosceles, or Scalene. //
import java.util.Scanner; {
    public class TypesOfTriangle {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the angle 1");
            int a1 = sc.nextInt();
            System.out.println("enter the angle 2");
            int a2 = sc.nextInt();
            System.out.println("enter the angle 3");
            int a3 = sc.nextInt();
            System.out.println("enter the side 1");
            int a = sc.nextInt();
            System.out.println("enter the side 2");
            int b = sc.nextInt();
            System.out.println("enter the side 3");
            int c = sc.nextInt();
            if (a1 + a2 + a3 == 180) {
                if (a1 == a2 && a1 == a3 && a2 == a3 && a == b && a == c && b == c) {
                    System.out.println("It is an equilateral triangle");
                } else {
                    if ((a + b > c) && (a + c > b) && (b + c > a)) {
                        if (a1 != a2 && a1 != a3 && a2 != a3 && a != b && a != c && b != c) {
                            System.out.println("It is a scalene triangle");
                        } else if (a == b || b == c || a == c) {
                            if (a1 == a2 || a2 == a3 || a1 == a3) {
                                System.out.println("It is an isoceles triangle");
                            } else {
                                System.out.println("It is neither of the three triangles");
                            }
                        }else{
                            System.out.println("it doesn't satisy properties of triangles");
                        }
                    } else {
                        System.out.println("The provided sides doesn't satisy the properties of a triangle");
                    }
                }
            } else {
                System.out.println("doesn't satisy properties of triangle");
            }
        }
    }
}
