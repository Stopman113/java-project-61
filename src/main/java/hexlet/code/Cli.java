package hexlet.code;
import java.util.Scanner;

public class Cli
{
 public static void   Cli (){
        Scanner Name = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? " );
    String  neme = Name.nextLine();
        System.out.println("Hello" +" "+ neme);

    }
}
