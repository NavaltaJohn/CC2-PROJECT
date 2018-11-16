
import java.util.Scanner;



public class AreasniDiego {

    public static void main(String[] args) {
    Scanner pogi = new Scanner(System.in);
    
            System.out.println("Enter Radious(Circle): ");
            double a = pogi.nextDouble();
            System.out.println("Enter Base (Triangle): ");
            double b = pogi.nextDouble();
            System.out.println("Enter Height(Triangle): ");
            double c = pogi.nextDouble();
            System.out.println("Enter Sides(Square): ");
            double d = pogi.nextDouble();
            
            double circle = Math.PI*Math.pow(a,2);
            double triangle = b*c/2;
            double square = Math.pow(d,2);
            
            System.out.println("Area of Circle in Radious is: " + circle);
            System.out.println("Area of Triangle is: " + triangle);
            System.out.println("Area of Square is: " + square);
    }
    
}
