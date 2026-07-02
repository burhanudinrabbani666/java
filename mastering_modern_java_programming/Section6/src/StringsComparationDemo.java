public class StringsComparationDemo {
    public static void main(String[] args) {

        String str1 = new String("Hey");
        String str2 = new String("Hello");
        String str3 = new String("Hey");

        // equals method is comparing value
        // not memory place like ==
        Boolean b1 = str1.equals(str2);
        Boolean b2 = str1.equals(str3);

        // this compare memory place
        Boolean b3 = str1 == str3;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        String nameLower = "bani";
        String nameUpper = "BANI";

        Boolean ignoreCase = nameLower.equalsIgnoreCase(nameUpper);
        System.out.println(ignoreCase);

        /*
         * Compares two strings lexicographically. The comparison is based on the
         * Unicode value of each character in the strings. The character sequence
         * represented by this String object is compared lexicographically to the
         * character sequence represented by the argument string. The result is a
         * negative integer if this String object lexicographically precedes the
         * argument string. The result is a positive integer if this String object
         * lexicographically follows the argument string. The result is zero if the
         * strings are equal; compareTo returns 0 exactly when the equals(Object) method
         * would return true.
         */
        String programmingLanguage = "java";

        Integer compareIsOn1 = programmingLanguage.compareTo("java");
        Integer compareIsOn2 = programmingLanguage.compareTo("javascript");

        System.out.println(compareIsOn1);
        System.out.println(compareIsOn2);
    }
}
