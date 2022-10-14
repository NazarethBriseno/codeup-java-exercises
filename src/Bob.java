import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        String userChoice = "y";
        while (userChoice.equalsIgnoreCase("y")){
            System.out.println("Hello! I'm Bob!");
            Scanner myScanner = new Scanner(System.in);
            if (myScanner.nextLine().endsWith("?")) {
                System.out.println("Bob: Sure");
            } else if (myScanner.nextLine().endsWith("!")) {
                System.out.println("Bob: Woah! Chill out bruh!");
            } else if (myScanner.nextLine().equals("")) {
                System.out.println("Bob: FINE! Be that way!");
            } else {
                System.out.println("Bob: Whatever");
            }
            System.out.println("Bob: Would you like to continue talking to me? [y/n]");
            userChoice = myScanner.next();

        }



    }
}
