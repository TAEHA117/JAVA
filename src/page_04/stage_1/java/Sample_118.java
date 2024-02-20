package page_04.stage_1.java;

import java.util.ArrayList;

public class Sample_118 {
    public static void main(String[] args) {
        boolean hasCard = true;
        ArrayList<String> pocket = new ArrayList<>();
        pocket.add("paper");
        pocket.add("cellphone");

        if (pocket.contains("money")) {
            System.out.println("택시를 타고 가라"); // 현재 arraylist안에 money는 담겨있지 않다.
        }else {
             if (hasCard) {
                 System.out.println("택시를 타고 가라"); // 카드는 있다. 그러므로 택시를 타고 간다.
             } else {
                 System.out.println("걸어가라"); // 카드가 있으므로 걸어가지 않는다.
             }
        }
    }
}
