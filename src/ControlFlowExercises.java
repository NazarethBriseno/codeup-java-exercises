public class ControlFlowExercises {
    public static void main(String[] args){
//        int i = 5;
//        while (i <= 15){
//            System.out.println(i++);
//        }
//        do {
//            System.out.println(i);
//            i+= 2;
//        } while (i <= 100);
//        int i = 100;
//        do {
//            System.out.println(i);
//            i-= 5;
//        } while (i >= 0);

//        int i = 2;
//        do {
//
//            i = i * i;
//            System.out.println(i);
//        } while (i <= 50000);
        for(int i = 0; i <= 100; i++){
            if(i % 3 ==0 && i % 5 == 0){
                System.out.println("FizzBuzz!");
            } else if(i % 3 == 0){
                System.out.println("Fizz");
            } else if(i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }



    }
}
