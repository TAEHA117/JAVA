package page_04.java;

import java.util.ArrayList;

public class Sample_119 {
    public static void main(String[] args) {
        boolean hasCard = true;
        ArrayList<String> pocket = new ArrayList<>();
        pocket.add("paper");
        pocket.add("cellphone");

        if (pocket.contains("money")) { // money 없음
            System.out.println("택시를 타고 가라");
        }else if(hasCard) {
            System.out.println("택시를 타고 가라"); // 현재 카드는 있음 -> 그러므로 택시를 타고 간다
        } else {
            System.out.println("걸어가라");
        }
    }
}
