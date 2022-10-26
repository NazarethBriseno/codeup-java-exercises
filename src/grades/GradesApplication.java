package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

import static java.util.Map.entry;

public class GradesApplication {
    public static void main(String[] args) {
        Student student1 = new Student("Ryan");
        student1.addGrade(60, 80);
        student1.addGrade(75, 89);
        Student student2 = new Student("Jenna");
        student2.addGrade(0, 95);
        student2.addGrade(99, 100);
        Student student3 = new Student("Levi");
        student3.addGrade(75, 78);
        student3.addGrade(80, 82);
        Student student4 = new Student("Alexis");
        student4.addGrade(60, 70);
        student4.addGrade(75, 72);

        HashMap<String, Student> studentHashMap = new HashMap<>();

        Map<String, Student> studentUserNames = Map.ofEntries(
                entry("ryanZLives", student1),
                entry("Jenna234", student2),
                entry("CallMeLevi", student3),
                entry("Coolexx", student4)
        );
        studentHashMap.putAll(studentUserNames);
        Object ryanHash = studentHashMap.get("ryanZLives").getGradeAverage();
        Object ryanHashName = studentHashMap.get("ryanZLives").getName();
        Object jennaHash = studentHashMap.get("Jenna234").getGradeAverage();
        Object jennaHashName = studentHashMap.get("Jenna234").getName();
        Object leviHash = studentHashMap.get("CallMeLevi").getGradeAverage();
        Object leviHashName = studentHashMap.get("CallMeLevi").getName();
        Object alexHash = studentHashMap.get("Coolexx").getGradeAverage();
        Object alexHashName = studentHashMap.get("Coolexx").getName();

        Scanner scanner = new Scanner(System.in);
        String goAgain = "y";  // Created this so when the user answer yes it continues
        while (goAgain.equalsIgnoreCase("y") || goAgain.equalsIgnoreCase("yes")) {  // while the user enter yes go again
            System.out.println("What student would you like to see more information on?");
            System.out.println("Here are the GitHub User Names of our Students: ");
            System.out.println("| ryanZLives | | Jenna234 | | CallMeLevi | | Coolexx |");
            String userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase("ryanzlives")) {
                System.out.println("Name: " + ryanHashName);
                System.out.println("GitHub username is ryanZLives");
                System.out.println("Ryan's grade average is: " + ryanHash);
            } else if (userAnswer.equalsIgnoreCase("jenna234")){
                System.out.println("Name: " + jennaHashName);
                System.out.println("GitHub username is Jenna234");
                System.out.println("Jenna's grade average is " + jennaHash);
            } else if (userAnswer.equalsIgnoreCase("callmelevi")) {
                System.out.println("Name: " + leviHashName);
                System.out.println("GitHub username is CallMeLevi");
                System.out.println("Levi's grade average is " + leviHash);
            } else if(userAnswer.equalsIgnoreCase("coolexx")){
                System.out.println("Name: " + alexHashName);
                System.out.println("GitHub username is Coolexx");
                System.out.println("Alex's grade average is " + alexHash);
            } else {
                System.out.println("Sorry we dont have that student");
            }

            System.out.println("Do you want to look up another student? Enter yes/no");
            goAgain = scanner.next();
            scanner.nextLine();
        }// end of while loop
        System.out.println("Goodbye!");


    }//End of main




    }



