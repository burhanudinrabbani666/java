public class Gretting {

    public static void sayHello() {
        System.out.println("Hello World");
    }

    public static int countWord(Iterable<String> words) {
        int count = 0;
        for (String _ : words) {
            count++;
        }
        return count;
    }
}
