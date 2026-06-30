public class LengthMethod {
    public static void main(String[] args) {
        String firstName = "burhanudin";
        String lastName = "rabbani";
        String fullName = firstName + " " + lastName;

        Integer firstNameLength = firstName.length();
        Integer lastNameLength = lastName.length();
        Integer fullNameLength = fullName.length();

        System.out.println(firstNameLength);
        System.out.println(lastNameLength);
        System.out.println(fullNameLength);

        String emptyString = "";
        System.out.println(emptyString.length()); // 0

    }
}
