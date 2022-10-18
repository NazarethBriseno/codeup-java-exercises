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
        return scanner.nextLine().equalsIgnoreCase("y") || scanner.nextLine().equalsIgnoreCase("yes");
    }
    public int getInt(int number1, int number2){
        System.out.printf("Input a number between %s and %s", number1, number2);
        int userInput = scanner.nextInt();
        if (userInput >= number1 && userInput <= number2){
            return userInput;
        } else {
            return getInt(number1, number2);
        }
    }



    public Input(){
        scanner = new Scanner(System.in);
    }
}
