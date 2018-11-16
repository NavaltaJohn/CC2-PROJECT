import java.util.Scanner;

public class laroniDiego {

    public static void main(String[] args) {
        
    Scanner pogi = new Scanner(System.in);
        System.out.println("Input a number");
    int y = pogi.nextInt();
    
        while (y<0 || y>1000){
            System.out.println("Invalid");
            System.out.println("Input");
            y = pogi.nextInt();
        }
     
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        
        System.out.println("What is your guess?");
    int x = pogi.nextInt();
    
        while (x<0 || x>0){
            System.out.println("The number you enter is wrong!");
            System.out.println("Input other number");
            x = pogi.nextInt();
        }
         
        while(y!=x){
            if (y%2 == 0){
                System.out.println("Hint:The number is Even");
        }
            else if (y%2 == 0){
                System.out.println("The number is Odd");
            }
            else if (y<x){
                System.out.println("The number you enter is higher");
                    }
            else if (y>x){
                System.out.println("The number you enter is lower");
            }
            else if (y == x){
            System.out.println("Correct!");
        }
            
        }
    }
}
       
        
        
              