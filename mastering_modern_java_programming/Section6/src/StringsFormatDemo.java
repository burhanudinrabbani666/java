public class StringsFormatDemo {
    public static void main(String[] args) {

        String message = "Hello %s! you have %d message.";
        String messageForMother = String.format(message, "mama", 3);
        String messageForPrabowo = String.format(message, "wok", 100);

        System.out.println(messageForMother);
        System.out.println(messageForPrabowo);

        String promo = "The price only $%.2f";
        String teaPromo = String.format(promo, 12.22);
        System.out.println(teaPromo);
    }
}
