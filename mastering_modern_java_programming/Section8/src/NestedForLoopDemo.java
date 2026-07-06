public class NestedForLoopDemo {
    public static void main(String[] args) {
        int number = 10;
        for (int i = 0; i < number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
        }

        // create startCases
        int rows = 10;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
