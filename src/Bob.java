import java.util.Scanner;

public class Bob {
    public static void main (String[] args) {
        System.out.println("Hello, im Bob!");
        Scanner myScanner = new Scanner(System.in);
        String userContinue = "y";
        while (userContinue.equalsIgnoreCase("y")) {
            if (myScanner.nextLine().endsWith("?")) {
                System.out.println("Bob: Sure");
            } else if (myScanner.nextLine().endsWith("!")) {
                System.out.println("Bob: Woah! Chill out bruh!");
            } else if (myScanner.nextLine().equals("")) {
                System.out.println("Bob: FINE! Be that way!");
            } else {
                System.out.println("Bob: Whatever");
            }
        }
        System.out.print("Continue? (y/n): ");
        userContinue = myScanner.next();
        System.out.println();
    }
}
