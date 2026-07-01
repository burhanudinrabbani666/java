public class SubstringDemo {
    public static void main(String[] args) {
        String fullName = "burhanudin rabbani";

        String firstName = fullName.substring(0, 10);
        String firstName2 = fullName.substring(0, fullName.indexOf(" "));

        String lastName = fullName.substring(11);

        System.out.println(firstName);
        System.out.println(firstName2);
        System.out.println(lastName);
    }
}
