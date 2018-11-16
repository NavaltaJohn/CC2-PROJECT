import java.util.Scanner;

    public class calculatorniDiego {
        public static void main(String [] args) {
            Scanner pogi = new Scanner (System.in);
            
            System.out.println("Enter First Value");
                double a = pogi.nextDouble();
                
            System.out.println("Enter Second Value");
                double b = pogi.nextDouble();
                
            System.out.println("Enter Arithmetic Operation");
                String operator = pogi.next();
        
                
                    switch (operator) {
                        case("+"):
                        case("add"):
                            System.out.println("sum:"+ (a+b));
                            break;
                            
                        case("-"):
                        case("subtract"):
                            System.out.println("difference:"+ (a-b));
                            break;
                            
                        case("*"):
                        case("multiply"):
                            System.out.println("product:"+ (a*b));
                            break;
                           
                        case("/"):
                        case("divide"):
                            System.out.println("qoutient:"+ (a/b));
                            break;
                         
                            case("%"):
                        case("modulo"):
                            System.out.println("mod:"+ (a%b));
                            break;
                    }
        } 
    }
