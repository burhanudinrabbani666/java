public class TrimDemo {
    public static void main(String[] args) {
        String java1 = "java ".trim();
        String java2 = "  java ".trim();
        String java3 = "\n \t java  \n \r".trim();

        System.out.println(java1);
        System.out.println(java2);
        System.out.println(java3);

    }
}
