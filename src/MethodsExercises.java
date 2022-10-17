
import java.util.Scanner;

public class MethodsExercises {
    public static void main (String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        int number1 = myScanner.nextInt();
        int number2 = myScanner.nextInt();
        System.out.println("Those two numbers added together are " + addition(number1, number2));
        System.out.println("Your second number subtracted from your first number is: " + subtraction(number1, number2));
        System.out.println("Your numbers multiplied together are " + multiplication(number1, number2));
        System.out.println("Your first number divided by your second number is " + division(number1, number2));
        System.out.println("Your number divided by your second number will leave you with a remainder of: " + modulus(number1, number2));
        factorialQuestion();


    }

    public static int addition(int number1, int number2) {
        return number1 + number2;
    }
    public static int subtraction(int number1, int number2){
        return number1 - number2;
    }
    public static int multiplication(int number1, int number2){
        return number1 * number2;
    }
    public static int division(int number1, int number2){
        return number2 / number1;
    }
    public static int modulus(int number1, int number2){
        if(number2 == 0){
            return number1;
        } else {
            return number1 % number2;
        }
    }
    public static int enterNumber() {
        System.out.println("Enter a number between 1 and 10: ");
        Scanner enterNumberScanner = new Scanner(System.in);
        int userNumber = enterNumberScanner.nextInt();
        if(userNumber > 0 && userNumber <= 10){
            return userNumber;
        } else {
            return enterNumber();

        }
    }
    public static long calculateFactorial(int userNumber){
        long result = 1;
        for(int i = 1; i <= userNumber; i++){
            result = result * i;
        }
        return result;
    }
    public static String getFactorialSentence(int result){
        String holder = result + "! = 1";
        for(int i = 2; i <= result; i++){

            holder += " X " + i;
        }
        return holder += " = " + calculateFactorial(result);
    }
    public static String factorialQuestion(){
        String userChoice = "y";
        while (userChoice.equals("y")){
            System.out.println("Enter a number 1 through 10 to get the factorial: ");
            Scanner scanner = new Scanner(System.in);
            int userNumber = scanner.nextInt();
            String factorialResults = getFactorialSentence(userNumber);
            System.out.println(factorialResults);
            System.out.println("Would you like to do another? y/n");
            userChoice = scanner.next();
        }
            return "Goodbye";
    }



}
