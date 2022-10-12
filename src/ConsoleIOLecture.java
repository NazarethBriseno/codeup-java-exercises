import java.util.Scanner;

public class ConsoleIOLecture {
    public static void main (String[] args){
//        String cohort = "Weywot";
//        System.out.printf("Hello, %s", cohort);
//        System.out.println("Will this be on a separate line?");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String userInput = scanner.nextLine();
        System.out.printf("Your sentence was %s.%n", userInput);
        System.out.println("Enter a number:");
        int userNumber = scanner.nextInt();
        System.out.printf("Your number was: %d", userNumber);



    }
}
