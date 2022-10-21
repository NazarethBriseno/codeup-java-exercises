import java.util.Arrays;

public class ArrayExercises {
//    public static Person[] addPerson(Person newPerson, Person[] PeopleArray){
//        Person[] newPeopleArray;
//        newPeopleArray = new Person[PeopleArray.length + 1];
//        for(int i =0; i < PeopleArray.length; i++){
//            newPeopleArray[i] = PeopleArray[i];
//        }
//        newPeopleArray[newPeopleArray.length - 1];
//        return newPeopleArray;
//    }

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
