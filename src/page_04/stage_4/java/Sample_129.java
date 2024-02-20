package page_04.stage_4.java;

public class Sample_129 {
    public static void main(String[] args) {
//        90,25,67,45,80
//        60점이 넘으면 합격, 그렇지않으면 불합격.
        int[] score = {90,25,67,45,80};
        for(int i=0; i<score.length; i++) {
            if (score[i] >= 60) {
                System.out.println((i+1) + "번 학생은 합격입니다.");
            }else {
                System.out.println((i+1) + "번 학생은 불합격입니다.");
            }
        }
    }
}
