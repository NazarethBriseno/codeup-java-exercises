package util;

import java.util.Arrays;

public class InputTest {
    public static void main (String[] args){
        Input input = new Input();
        System.out.println(input.getString());
        System.out.println(input.yesNo());
        System.out.println(input.getInt(4, 8));

    }
}
