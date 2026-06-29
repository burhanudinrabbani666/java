public class ArithmaticOperationsMain {
    public static void main(String[] args) {

        // This is static method
        Integer result = ArithmaticOperations.addition(20, 15);
        System.out.println(result);

        // This is object instance
        ArithmaticOperations newArithmaticOperations = new ArithmaticOperations();
        Integer result2 = newArithmaticOperations.sum(33, 33);
        System.out.println(result2);

    }
}
