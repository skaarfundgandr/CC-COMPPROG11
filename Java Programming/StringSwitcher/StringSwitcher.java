import java.util.Scanner;

public class StringSwitcher{
    public static void main (String[] args) {
        String phrase;
        char response;
    
        Scanner scan = new Scanner(System.in);
        
        do{
            String message = "Phrase is: ";
            System.out.print("Enter Acronym: ");
            phrase = scan.next().toUpperCase();
            switch (phrase){
                case "LOL":
                    message = message + "Laugh Out Loud";
                    break;
                case "LMAO":
                    message = message + "Laughing My Ass Off";
                    break;
                case "MFW":
                    message = message + "My Face When";
                    break;
                case "FR":
                    message = message + "For Real";
                    break;     
                case "BFF":
                    message = message + "Best Friends Forever";
                    break;
                case "IDK":
                    message = message + "I don't know";
                    break;
                case "SO":
                    message = message + "Significant Other";
                    break;
                case "TX":
                case "THKS":     
                case "THX":                                                  
                    message = message + "Thanks";
                    break;
                default:
                    message = message + "unknown";
            }
            System.out.println (message);
            System.out.println("Enter again?");
            response = scan.next().charAt(0);
        }while (Character.toUpperCase(response) == 'Y');   
    }
}