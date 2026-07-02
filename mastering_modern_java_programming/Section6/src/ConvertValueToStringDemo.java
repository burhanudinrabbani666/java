public class ConvertValueToStringDemo {
    public static void main(String[] args) {
        Integer intValue = 42;
        Double doubleValue = 3.14;
        Boolean booleanValue = true;

        String str1 = String.valueOf(intValue);
        String str2 = String.valueOf(doubleValue);
        String str3 = String.valueOf(booleanValue);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

    }
}
