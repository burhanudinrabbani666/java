public class ParsingDemo {
    public static void main(String[] args) {
        String strInt = "456";
        Integer num = Integer.parseInt(strInt);

        String strDouble = "3.14";
        Double num1 = Double.parseDouble(strDouble);

        String strFloat = "2.1234";
        Float num2 = Float.parseFloat(strFloat);

        String strLong = "123456789";
        Long num3 = Long.parseLong(strLong);

        String strBoolean = "true";
        Boolean bool = Boolean.parseBoolean(strBoolean);

        String strBooleanInvalid = "bani";
        Boolean boolInvalid = Boolean.parseBoolean(strBooleanInvalid); // becoming false

        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        System.out.println(bool);
        System.out.println(boolInvalid);

    }
}
