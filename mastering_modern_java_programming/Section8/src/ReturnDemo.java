public class ReturnDemo {
    public static void main(String[] args) {

        String result = getStudentGrade(90);
        System.out.println(result);

    }

    public static String getStudentGrade(int marks) {

        if (marks >= 40) {
            return "Passed";
        } else {
            return "Failed";
        }
    }
}
