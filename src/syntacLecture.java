public class syntacLecture {
    public static void main(String[] args) {
        // Declare a variable without initializing
        int weight;
        String breed;
        //initialize after declaration
        weight = 12;
        breed = "PitBull";
        // Initialize and declare at the same time
        String name = "Grinch";
        int cutenessFactor = 10;
        // Statements: "JVM, do something"
        System.out.println(name + " is a " + breed + ".");
        //Conditional logic
//        if (cutenessFactor > 8){
//            System.out.println(name + " is cute.");
//        } else {
//            System.out.println(name + " needs to work on cuteness.");
//        }

        boolean isGrinchCute = true;
        char oneLetter = 'a';
        byte smallNumber; //bytes go from -128 to 127
        short mediumNumber; // shorts go from -32768 to 32767
        int number; //Integers go c. -2 billion to 2 billion
        long bigNumber; // longs go about -9 quadrillion to 9 quadrillion

        smallNumber = 12;
        System.out.println(smallNumber);
        number = smallNumber;
        System.out.println(number);

        bigNumber = 9000000000000L;

        float imaFloat = 2.34F;
        double imaDouble = 9.01234567890123;
        System.out.println(imaDouble);

    }
}
