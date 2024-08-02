package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Cli {
    private static boolean Statys = true;
    private static int Stat;
    public static String neme;

    public static void Greet() {

        Scanner Name = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        neme = Name.nextLine();
        System.out.println("Hello" + " " + neme);

    }
//-----------------------------------------------------------------------------------------------------------------------


    public static void EEven() {
        Cli.Greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 1; i <= 3; i++) {
            Statys = true;
            boolean correct = Even();
            if (!correct) {
                break;
            }
            if (i == 3 && correct) {
                System.out.println("Congratulations, " + neme + "!");
            }
        }
    }

    public static boolean Even() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        while (Statys) {
            System.out.print("Question: ");
            int number = random.nextInt(99) + 1;
            System.out.println(number);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();
            String yes = "yes";
            String no = "no";

            if (number % 2 == 0 && answer.equalsIgnoreCase(yes)) {
                System.out.println("Correct!");
                return true;
            } else if (number % 2 != 0 && answer.equalsIgnoreCase(no)) {
                System.out.println("Correct!");
                return true;
            } else {
                if (number % 2 == 0 && answer.equalsIgnoreCase(no)) {
                    System.out.println("'" + no + "' is the wrong answer ;(. Correct answer was '" + yes + "'.\nLet's try again, " + neme + "!");
                    return false;
                } else if (number % 2 != 0 && answer.equalsIgnoreCase(yes)) {
                    System.out.println("'" + yes + "' is the wrong answer ;(. Correct answer was '" + no + "'.\nLet's try again, " + neme + "!");
                    return false;
                }
            }
        }
        return false;
    }

    //-----------------------------------------------------------------------------------------------------------------------
    static int correctAnswers = 0;


    public static void Calc() {
        Cli.Greet();
        Random random = new Random();
        Runnable[] operations = new Runnable[]{Cli::Multipl, Cli::Addition, Cli::subtraction};
        boolean[] called = {false, false, false};
        System.out.println("What is the result of the expression?");

        for (int i = 0; i < operations.length; i++) {
            if (!Statys) break;
            int index;
            do {
                index = random.nextInt(operations.length);
            } while (called[index]);
            called[index] = true;
            operations[index].run();
            if (i == 2 && Statys) {
                System.out.println("Congratulations, " + neme + "!");
            }
        }

    }


    public static void Multipl() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int Number = random.nextInt(19) + 1;
        int Number2 = random.nextInt(19) + 1;
        int answer = Number * Number2;
        System.out.print("Question: " + Number + "*" + Number2 + "\nYour answer: ");
        int num = scanner.nextInt();
        if (num == answer) {
            System.out.println("Correct!");
            int temp = 0;
            temp++;
            if (temp == 3) {
                System.out.println("Congratulations, " + neme + "!");

            }

        } else {
            System.out.println("\"'" + num + "' is the wrong answer ;(. Correct answer was '" + answer + "'.\nLet's try again, " + neme + "!");
            Statys = false;
            return;
        }
    }

    public static void Addition() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int Number3 = random.nextInt(19) + 1;
        int Number4 = random.nextInt(19) + 1;
        int answer3 = Number3 + Number4;
        System.out.print("Question: " + Number3 + "+" + Number4 + "\nYour answer: ");

        int num3 = scanner.nextInt();
        if (num3 == answer3) {
            System.out.println("Correct!");
            int temp = 0;
            temp++;
            if (temp == 2) {
                System.out.println("Congratulations, " + neme + "!");

            }
        } else {
            System.out.println("\"'" + num3 + "' is the wrong answer ;(. Correct answer was '" + answer3 + "'.\nLet's try again, " + neme + "!");
            Statys = false;
            return;
        }
    }

    public static void subtraction() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int Number5 = random.nextInt(19) + 1;
        int Number6 = random.nextInt(19) + 1;

        int answer4 = Number5 - Number6;
        System.out.print("Question: " + Number5 + "-" + Number6 + "\nYour answer: ");
        int num4 = scanner.nextInt();
        if (num4 == answer4) {
            System.out.println("Correct!");

        } else {
            System.out.println("\"'" + num4 + "' is the wrong answer ;(. Correct answer was '" + answer4 + "'.\nLet's try again, " + neme + "!");
            Statys = false;
            return;
        }
    }
    //-----------------------------------------------------------------------------------------------------------------------

    public static void GCD() {
        Random random = new Random();
        Cli.Greet();
        for (int i = 0; i < 3; i++) {
            if (Statys) {
                int number1 = random.nextInt(100) + 1;
                int number2 = random.nextInt(100) + 1;

                int correctAnswer = gcd(number1, number2);

                Scanner scanner = new Scanner(System.in);

                System.out.print("Question: " + number1 + "  " + number2 + "\nYour answer: ");

                int userAnswer = scanner.nextInt();

                if (userAnswer == correctAnswer) {
                    System.out.println("Correct!");
                    int temp = 0;
                    temp++;
                    if (i == 2 && Statys) {
                        System.out.println("Congratulations, " + neme + "!");

                    }

                } else {
                    System.out.println("'" + userAnswer + "' is the wrong answer ;(. The correct answer was '" + correctAnswer + "'.");
                    Statys = false;
                }
            }
        }
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    //-----------------------------------------------------------------------------------------------------------------------
    public static void Progression() {
        Cli.Greet();
        for (int i = 1; i <= 3; i++) {
            Statys = true;
            boolean correct = PProgression();
            if (!correct) {
                break;
            }
            if (i == 3 && correct) {
                System.out.println("Congratulations, " + neme + "!");
            }
        }
    }

    public static boolean PProgression() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int temp = random.nextInt(99) + 1;
        int NUM = random.nextInt(16) + 1;
        int chance = random.nextInt(9) + 1;
        int Prog = temp;

        while (Statys) {
            System.out.print("Question: ");
            for (int i = 0; i < 10; i++) {
                if (i != 0) {
                    Prog += NUM;
                }
                if (i == chance) {
                    Stat = Prog;
                    String ITY = "..";
                    System.out.print(ITY + ",");
                } else {
                    System.out.print(Prog + ",");
                }
            }
            System.out.println();
            System.out.print("Your answer: ");
            int men = scanner.nextInt();

            if (men == Stat) {
                System.out.println("Correct!");

                return true;
            } else {
                System.out.println("'" + men + "' is the wrong answer ;(. The correct answer was '" + Stat + "'.");
                return false;
            }
        }
        return false;
    }public static void PPrime() {
        Cli.Greet();
        for (int i = 1; i <= 3; i++) {
            Statys = true;
            boolean correct = Prime();
            if (!correct) {
                break;
            }
            if (i == 3 && correct) {
                System.out.println("Congratulations, " + neme + "!");
            }
        }
    }

    public static boolean Prime() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        while (Statys) {
            int num = random.nextInt(20) + 1;
            System.out.println("Question: " + num);
            System.out.print("Your answer: ");
            String aa = scanner.nextLine();
            String no = "no";
            if (num % 2 != 0 && aa.equalsIgnoreCase("yes")) {
                System.out.println("Correct!");
                return true;
            }
            if (num % 2 == 0 && aa.equalsIgnoreCase("no")) {
                System.out.println("Correct!");
          return true;
            } else if (num % 2 != 0 && aa.equalsIgnoreCase("no")) {
                System.out.println("'" + aa + "' is the wrong answer ;(. Correct answer was '" + "yes" + "'.\nLet's try again, " + neme + "!");
                return false;

            } else if (num % 2 == 0 && aa.equalsIgnoreCase("yes")) {
                System.out.println("'" + aa + "' is the wrong answer ;(. Correct answer was '" + "no" + "'.\nLet's try again, " + neme + "!");
                return false;
            }
        }
        return false;
    }
}


















