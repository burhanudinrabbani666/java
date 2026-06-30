public class Intern {
    public static void main(String[] args) {
        String hello = "hello";

        /*
         * The intern() method attempts to move the newly created "hello" value into the
         * string pool but discovered that such a literal exists there already,
         * so it reused the literal from the string pool
         */
        String obj1 = new String("hello").intern();

        // return true, because value is same place in memory heap
        System.out.println(hello == obj1);
    }
}
