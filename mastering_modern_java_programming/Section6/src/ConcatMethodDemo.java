public class ConcatMethodDemo {
    public static void main(String[] args) {

        String firstName = "burhanudin";

        // add new content to string

        // 1. manual append
        firstName = firstName + " " + "rabbani";
        System.out.println(firstName);

        // 2. concat method
        String fullName = firstName.concat(" ").concat("Dragon");
        System.out.println(fullName);

    }

}