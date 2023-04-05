public class ConditionEx02 {
    public static void main(String[] args) {
        // int score = 79;
        // String grade = "";
        // if (score >= 90) {
        // grade = "A";
        // } else if (score <= 89 && score >= 80) {
        // grade = "B";
        // } else if (score <= 79 && score >= 70) {
        // grade = "C";
        // } else if (score <= 69 && score >= 60) {
        // grade = "D";
        // } else {
        // grade = "F";
        // }
        int score = 79 / 10;
        String grade = "";
        switch (score) {
            case 10:
            case 9:
                grade = "a";
                break;
            case 8:
                grade = "b";
                break;
            case 7:
                grade = "c";
                break;
            case 6:
                grade = "d";
                break;
        }
        System.out.println(score + "성적은 " + grade);
    }

}
