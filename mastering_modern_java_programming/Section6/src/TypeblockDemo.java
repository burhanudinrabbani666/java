public class TypeblockDemo {
    public static void main(String[] args) {
        String introdution = """
                Hi my name is %s,
                Im %d years old.
                """;

        String baniIntro = String.format(introdution, "bani", 23);
        System.out.println(baniIntro);
    }
}
