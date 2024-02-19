package page_03.stage_4.java;

public class Sample_68 {
    public static void main(String[] args) {
//        System.out.println(String.format("%.4f",3.42134234)); // 3.4213 출력

        System.out.println(String.format("%10.4f",3.42134234)); // 3.4213
//      전체 길이 10개 -> 4개의 공백

        System.out.println(String.format("I eat %d apples.",3)); // I eat 3 apples.

        System.out.printf("I eat %d apples.",3); // I eat 3 apples.
    }
}
