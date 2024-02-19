package page_03.stage_10.java;

public class Sample_98 {
    enum CoffeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };

//    public static void main(String[] args) {
//        System.out.println(CoffeType.AMERICANO); // AMERICANO 출력
//        System.out.println(CoffeType.ICE_AMERICANO); // ICE_AMERICANO 출력
//        System.out.println(CoffeType.CAFE_LATTE); // CAFE_LATTE 출력
public static void main(String[] args) {
        for(CoffeType type: CoffeType.values()) {
            System.out.println(type); // 순서대로 아메리카노, 아이스 아메리카노, 카페라떼 출력
        }
    }
}

