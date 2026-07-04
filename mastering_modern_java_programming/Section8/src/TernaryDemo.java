public class TernaryDemo {
    public static void main(String[] args) {
        int x = 10, y;
        y = x > 5 ? 20 : 30;

        System.out.println(y);
        sum(x, x > 5 ? 20 : 30);

        System.out.println(rankCalculator(70));

    }

    public static void sum(int x, int y) {
        System.out.println(x + y);
    }

    public static String rankCalculator(int score) {
        // Write your code below
        return (score < 60) ? "Beginner"
                : (score < 70) ? "Intermediate" : (score < 80) ? "Expert" : (score < 90) ? "Master" : "Grandmaster";
    }

}
