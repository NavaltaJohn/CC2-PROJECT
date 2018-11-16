// final activity 1
import java.util.*;

public class Fibonnaci{

    static int fibonnacii (int x){
            if (x==0||x==1) //
                return x; //if the number is eqaul to 1 the fibonnaci will return 
            else
                return fibonnacii(x - 1) + fibonnacii(x - 2); //if the number is greater than 1 the fibonnaci will return on this condition
    }
   public static void main(String[] args){ 
       System.out.print("Enter a number: ");
       int a = new Scanner(System.in).nextInt();
       // int a is for the user to input a number
       for (int i = 0; i<= a; i++){
           System.out.print("f("+i+")"+ "\t");
       }
       System.out.println("");
       for (int b = 0; b <= a; b++){ //code for java for loop
           for (int i = 0; i <= b; i++){
               System.out.print(fibonnacii(i)+ "\t"); //to print the code
           }
            System.out.println(""); //to break the loop
       }
   }

}
