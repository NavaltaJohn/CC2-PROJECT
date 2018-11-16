
import java.util.Scanner;

public class MDArrayniDiego {
    public static void main(String[] args){
        
       Scanner pogi = new Scanner(System.in);

            System.out.println("Enter Elements: ");
            System.out.printf("Row 0; Column 0: ");
                    int c = pogi.nextInt();
            System.out.printf("Row 0; Column 1: ");
                    int d = pogi.nextInt();
            System.out.printf("Row 1; Column 0: ");
                    int e = pogi.nextInt();
            System.out.printf("Row 1; Column 1: ");
                    int f = pogi.nextInt();
         
        int [] [] numbers = new int [2] [2];
             numbers [0] [0] = c;       numbers [1] [0] = d;
             numbers [0] [1] = e;       numbers [1] [1] = f;
             
            System.out.println("");
            System.out.println("");
             
        int rows = 2;
        int columns = 2;
        int i,j;
            
             for(i = 0; i < rows; i++){
                 for(j = 0; j < columns; j++){
                     System.out.printf(numbers[i] [j] + "\t");
                 }
                 System.out.println("");
             }
          
    }
}
