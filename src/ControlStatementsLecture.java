import java.util.Scanner;

public class ControlStatementsLecture {
    public static void main (String[] args) {
//        int x = 6;
//        if (x == 5){
//            System.out.println("x is 5");
//        } else if (x > 5 && x < 15){
//            System.out.println("x is between 5 and 15!");
//        }
//        String customerChoice;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What flavor do you want?");
//        customerChoice = scanner.next();
//
//        switch (customerChoice) {
//            case "vanilla" -> System.out.println("One vanilla coming right up");
//            case "chocolate" -> System.out.println("chocolate coming right up");
//            case "strawberry" -> System.out.println("strawberry coming right up");
//            default -> System.out.println("We don't have that");
//        }

        //===========================WHILE LOOPS=====================================
//        int i = 1;
//        System.out.println("The loop hasn't started yet. The value of i is " + i);
//        while (i < 10){
//            System.out.println("Now im in the loop. i has not incremented yet and its value is " + i);
//            i++;
//        }
//        System.out.println("Loops just ended. The value of i is: " + i);
//    }
//
        //================================FOR LOOPS==========================================
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
