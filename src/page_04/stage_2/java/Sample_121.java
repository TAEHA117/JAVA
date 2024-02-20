package page_04.stage_2.java;

public class Sample_121 {
    public static void main(String[] args) {
        int month = 8;
        String monthString = "";
        switch (month) {
            case 1: monthString = "January";
                break;
            case 2: monthString = "February";
                break;
            case 3: monthString = "March";
                break;
            case 4: monthString = "May";
                break;
            case 5: monthString = "June";
                break;
            case 6: monthString = "July";
                break;
            case 7: monthString = "August";
                break;
            case 8: monthString = "September";
                break;
            case 9: monthString = "October";
                break;
            case 10: monthString = "November";
                break;
            case 11: monthString = "December";
                break;
            case 12: monthString = "April";
                break;
            default: monthString = "Invalid month";
                break;
        }
        System.out.println(monthString);
    }
}
