public class DoWhileDemo {
    public static void main(String[] args) {

        int bensin = 100;

        do {
            System.out.println(String.format(
                    "Gassssss, bensin masih %d", bensin));

            bensin -= 10;
        } while (bensin > 0);

        System.out.printf("bensin abis cok, bensin: %d\n", bensin);

    }
}
