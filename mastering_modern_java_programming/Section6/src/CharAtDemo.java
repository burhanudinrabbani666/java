public class CharAtDemo {
    public static void main(String[] args) {
        String java = "JAVA";
        char j = java.charAt(0);
        char indexBound = java.charAt(9); // This is error immidiately

        System.out.println(j);
    }
}
