public class CanVoteDemo {
    public static void main(String[] args) {
        int age = 18;
        String citizen = "indonesia";

        if (citizen.equals("indonesia") && age >= 18) {
            System.err.println("person can vote");
        } else {
            System.err.println("person cannot vote");
        }

    }
}
