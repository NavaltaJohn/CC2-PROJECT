//FINAL, Final Activity

import java.util.Scanner;

public class FinalActivity {

   
    public static void main(String[] args) {
        display();
    }
    static void display(){
        Scanner sc = new Scanner(System.in);
        String operation = operation();
        int []c = new int[index()];
        
        System.out.println("\nEnter Elements:");
        for (int i = 0; i != c.length; i++){
            c[i] = sc.nextInt();
        }
        System.out.println("");
        
        for (int i = 0; i != c.length; i++){
            System.out.print("f(" + c[i] + ")\t");
        }
        System.out.println("");
        
        if (operation.equalsIgnoreCase("fibonacci")){
            System.out.println("\nThe fibonacci is:");
            for (int i = 0; i != c.length; i++){
                System.out.print(fibonacci(c[i]) + "\t");
            }
        } else if (operation.equalsIgnoreCase("factorial")){
            System.out.println("\nThe factorial is:");
            for (int i = 0; i != c.length; i++){
                System.out.print(factorial(c[i]) + "\t");
            }    
        }
    }
    static String operation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to get? Factorial/Fibonacci? :");
        String a = sc.next();
        
        if (!a.equalsIgnoreCase("factorial") && !a.equalsIgnoreCase("fibonacci")){
            return operation();
        }
        return a;
    }
    static int index(){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter size of Index: ");
        int b = sc.nextInt();
        return b;
    }
    static int fibonacci(int n){
        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return (fibonacci(n-1)) + (fibonacci(n-2));
                        }
    }
    static int factorial(int n){
        if (n<=1){
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }
    
}
