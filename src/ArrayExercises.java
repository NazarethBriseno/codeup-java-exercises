import java.util.Arrays;

public class ArrayExercises {


    public static void main (String[] args){
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        Person david = new Person("David", 23, "Construction");
        Person ariana = new Person("Ariana", 27, "Singing");
        Person jose = new Person("Jose", 23, "Plumbing");
        Person[] personArray = {david, ariana, jose};

        for (Person person : personArray) {
            System.out.println(person.getName() + " is in " + person.getJob());
        }




    }
}
