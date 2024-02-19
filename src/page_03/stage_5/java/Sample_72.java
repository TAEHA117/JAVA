package page_03.stage_5.java;

public class Sample_72 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("jump to java");
        sb.insert(0, "hello");
        System.out.println(sb.toString()); // hello jump to java
    }
}
