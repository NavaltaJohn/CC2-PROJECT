import java.util.Scanner;

public class collegeniDiego {
    public static void main(String [] args) {
        System.out.println("What College Department are you in?");
        Scanner pogi = new Scanner(System.in);
            String a = pogi.nextLine();
            
         
        switch (a) {
            case "CAS":
                System.out.println("What College Program are you taking?");
                String b = pogi.nextLine();
                if (b.equals("BAE")){
                    System.out.println("Your from the College of Arts and Science Major in " +b);
                }if (b.equals("BAPS")){
                    System.out.println("Your from the College of Arts and Science Major in " +b);
                }if (b.equals("BAC")){
                    System.out.println("Your from the College of Arts and Science Major in " +b);
                }if (b.equals("BSP")){
                    System.out.println("Your from the College of Arts and Science Major in " +b);
                }break;
            case "COA":
                System.out.println("What College Program are you taking?");
                String c = pogi.nextLine();
                if (c.equals("BSA")){
                    System.out.println("Your from the College of Arts and Science Major in " +c);
                }
                if (c.equals("BSAT")){
                    System.out.println("Your from the College of Arts and Science Major in " +c);
                }
                if (c.equals("BSMA")){
                    System.out.println("Your from the College of Arts and Science Major in " +c);
                }
                if (c.equals ("BSFA")){
                    System.out.println("Your from the College of Arts and Science Major in " +c);
                }
                break;
            case "CITCS":
                System.out.println("What College Program are you taking?");
                String d = pogi.nextLine();
                if (d.equals("BSIT")){
                    System.out.println("Your from the College of Information and Technology Major in " +d);
                }   if (d.equals("BSCS")){
                    System.out.println("Your from the College of Information and Technology Major in " +d);
                }
                if (d.equals("BSDA")){
                    System.out.println("Your from the College of Information and Technology Major in " +d);
                }
                break;
            case "CEA":
                System.out.println("What College Program are you taking?");
                String e = pogi.nextLine();
                if (e.equals("BSA")){
                    System.out.println("Your from the College of Engineering and Architecture Major in " +e);
                }
                if (e.equals("BSCE")){
                    System.out.println("Your from the College of Engineering and Architecture Major in Major in " +e);
                }
                if (e.equals("BSEE")){
                    System.out.println("Your from the College of Engineering and Architecture Major in " +e);
                }
                
                else if (a.equals("CCJE")){
                    System.out.println("What College are you taking?");
                    String f = pogi.nextLine();
                    
                    if (f.equals("BSC")){
                        System.out.println("Your from the College of Criminal Justice Education  Major in " +f);
                    }
                }
                
                else if (a.equals("CBA")){
                    System.out.println("What College Program are you taking?");
                    String g = pogi.nextLine();
                    
                    if (g.equals("BSBA")){
                        System.out.println("Your from the College of Business Administration Major in " +e);
                    }
                }
                break;
            default:
                break;
        }
    
 }