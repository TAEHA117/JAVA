package page_03.stage_4.java;

public class Sample_63 {
    public static void main(String[] args) {
        String a = "a:b:c:d";
        String[] result = a.split(":"); // result는 {"a", "b", "c", "d"}

        System.out.println(a);

        System.out.println(String.format("I eat %d apples.", 3)); // " I eat 3 apples." 출력.
    }
}
