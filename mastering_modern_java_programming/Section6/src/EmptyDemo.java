public class EmptyDemo {
    public static void main(String[] args) {
        String myString = "";

        // 1. isEmpty()
        Boolean isEmpty = myString.isEmpty();

        // 2. compare with length
        Boolean isLengthZero = myString.length() == 0;

        // 3. Equals
        Boolean isEqualsEmpty = "".equals(myString);

        // null is not same with empty value
        String nullString = null;
        Boolean isNullEmpty = "".equals(nullString);

        System.out.println(isEmpty);
        System.out.println(isLengthZero);
        System.out.println(isEqualsEmpty);
        System.out.println(isNullEmpty);

        // This is not empty
        String blankString = "             ";
        Boolean isBlankEmpty = blankString.isBlank();
        System.out.println(isBlankEmpty);
    }
}
