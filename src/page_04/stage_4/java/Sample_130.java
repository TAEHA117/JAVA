package page_04.stage_4.java;

public class Sample_130 {
    public static void main(String[] args) {
        int[] score = {90,25,67,45,80};
        for(int i=0; i<score.length; i++) {
            if (score[i] < 60) {
                continue; // 조건문으로 돌아간다.
            }
            System.out.println((i+1) + "번 학생 축하합니다. 합격입니다.");
        }
    }
}
