package QUESTION;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Test_6 {
//    리스트를 역순으로 정렬하기
//    다음과 같은 [1,3,5,4,2] 리스트를 [5,4,3,2,1]로 만들어 보자.

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        myList.sort(Comparator.reverseOrder());
        System.out.println(myList);
    }
}
