import java.util.Scanner;
public class Age {

    public static void main(String[] args) {
        int age;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age: ");
        if (sc.hasNextInt()){
            age = sc.nextInt();
            
            if (age < 0){
                System.out.println("no negative age");
            } else if (age <= 2){
                System.out.println("Baby");
            } else if (age <= 5) {
                System.out.println("Toddler");
            } else if (age <= 12) {
                System.out.println("Kid");
            } else if (age <= 18) {
                System.out.println("Teen");
            } else if (age <= 59) {
                System.out.println("Adult");
            }
        } else {
            System.out.println("invalid input");
        }
    }

}