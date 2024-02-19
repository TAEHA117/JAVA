package QUESTION;

public class Test_5 {
//    문자열 바꾸기
//    다음과 같은 문자열 a:b:c:d가 있다. replcaeAll메서드를 사용하여 a#b#c#d로 바꿔서 출력해보자.
public static void main(String[] args) {
    String a = "a:b:c:d";
    String b = a.replaceAll(":","#");
    System.out.println(b);
}
}
