package page_03.stage_4.java;

public class Sample_60 {
    public static void main(String[] args) {

        String a = "hello";
        String b = "java";
        String c = "hello";
        System.out.println(a.equals(b)); // false 출력
        System.out.println(a.equals(c)); // true 출력

/*        String a = "hello";
        String b = new String("hello");
        System.out.println(a.equals(b)); // true
        System.out.println(a == b); // false*/
    }
}
