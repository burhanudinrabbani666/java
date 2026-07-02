public class PalindromeDemo {
    public static void main(String[] args) {
        String input = "racecar";
        StringBuilder inputReverse = new StringBuilder(input);
        inputReverse.reverse();

        System.out.println(input.equals(inputReverse.toString()));
    }
}
