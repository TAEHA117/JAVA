package page_04.stage_3.java;

public class Sample_124 {
    public static void main(String[] args) {
        int treeHit = 0;
        while (treeHit < 10) {
            treeHit++; // +=1로도 표현 가능
            System.out.println("나무를" + treeHit + "번 찍었습니다.");
            if (treeHit == 10) {
                System.out.println("나무 넘어갑니다.");
            }
        }
    }
}
