package QUESTION_2;

public class Test_2 {
//    3의 배수의 합 구하기
//    while 문을 사용해 1부터 1000까지의 자연수 중 3의 배수의 합을 구해보자.
public static void main(String[] args) {
    int result = 0;
    int i = 1;
    while (i <= 1000) {
        if (i % 3 == 0) {
            result += i;
        }
        i += 1;
    }
    System.out.println(result);
}
}
