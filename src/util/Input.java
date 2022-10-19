package util;

import java.util.Scanner;

public class Input {


    private Scanner scanner;

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getString(){
        System.out.println("Enter your input: ");
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Yes/No?");
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }
    public int getInt(int min, int max){
        System.out.printf("Input a number between %s and %s", min, max);
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max){
            return userInput;
        } else {
            return getInt(min, max);
        }
    }




    public Input(){
        scanner = new Scanner(System.in);
    }
}
