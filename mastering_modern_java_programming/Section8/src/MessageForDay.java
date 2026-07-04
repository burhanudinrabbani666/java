public class MessageForDay {
    public static void main(String[] args) {
        String dayOfWeek = "Sunday";

        if (dayOfWeek.equals("Satuday") || dayOfWeek.equals("Sunday")) {
            System.out.println("Horayy this is weekend");

            if (dayOfWeek.equals("Saturday")) {
                System.out.println("Time for relaxing day or maybe some outdoor activities!");
            } else {
                System.out.println("Lazy sunday vibes");
            }
        } else {
            System.out.println("Work Work Work");
        }
    }
}
