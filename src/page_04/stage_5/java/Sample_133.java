package page_04.stage_5.java;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample_133 {
    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("one","two","three"));
        for (String number: numbers) {
            System.out.println(number);
        }
    }
}
