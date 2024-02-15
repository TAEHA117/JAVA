package page_03.stage_2;

public class Sample_56 {
    public static void main(String[] args) {
        int base = 180;
        int height = 185;
        boolean isTall = height > base;

        System.out.println(isTall); // true

        if (isTall) {
            System.out.println("키가 큽니다.");
            // 참이기 떄문에 키가 큽니다를 출력한다.
        }

        int i = 3;
        boolean isOdd = i % 2 == 1;
        System.out.println(isOdd); // true출력
    }
}
