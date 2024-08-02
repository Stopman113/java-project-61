package hexlet.code;

import javax.naming.Name;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Cli Cli = new Cli();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int num = scanner.nextInt();
        if (num == 1) {
            Cli.Greet();
        }
        if (num == 2) {
            Cli.EEven();

        }
        if(num ==3) {
            Cli.Calc();
        }
        if(num ==4) {
            Cli.GCD();

        }
        if(num ==5) {
            Cli.Progression();

        }
        if(num ==6) {
            Cli.PPrime();

        }

    }
}
