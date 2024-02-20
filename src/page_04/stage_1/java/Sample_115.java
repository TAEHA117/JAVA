package page_04.stage_1.java;

public class Sample_115 {
    public static void main(String[] args) {
        int x = 3;
        int y = 2;
        System.out.println(x > y); // true

        System.out.println(x < y); // false

        System.out.println(x == y); // false

        System.out.println(x != y); // true

//        "만약 3000원 이상의 돈을 가지고 있으면 택시를 타고, 그렇지 않으면 걸어가라."

//        int money = 2000;
//        if (money >= 3000) {
//            System.out.println("택시를 타고 가라");
//        }else {
//            System.out.println("걸어가라"); // else 문에 있는 걸어가라 출력
//        }

        int money = 2000;
        boolean hasCard = true;

        if (money>=3000 || hasCard) {
            System.out.println("택시를 타고 가라"); // or연산자로 인해 hasCard의 조건은 true이므로 택시를 타고 가라 출력
        }else {
            System.out.println("걸어 가라");
        }


    }
}
