package page_03.stage_11.java;

public class Sample_103 {
    public static void main(String[] args) {
//        String num = "123.456";
//        double d = Double.parseDouble(num);
//        System.out.println(d); // 123.456

        int n1 = 123;
        double d1 = n1; // 정수를 실수로 바꿀 때에는 캐스팅이 필요없다.
        System.out.println(d1); // 123.0출력

        double d2 = 123.456;
        int n2 = (int) d2; // 실수를 정수로 바꿀 때에는 반드시 정수형으로 캐스팅해 주어야 한다.
        System.out.println(n2); // 소수점이 생략된 123 출력
    }
}
