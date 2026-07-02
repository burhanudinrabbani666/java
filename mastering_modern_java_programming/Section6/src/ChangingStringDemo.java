import java.util.Locale;

public class ChangingStringDemo {
    public static void main(String[] args) {
        String name = "burhanudin";

        String uppercaseName = name.toUpperCase();
        String lowercaseName = name.toLowerCase();

        String lowercaseNameLocale = name.toLowerCase(Locale.GERMAN);

        System.out.println(uppercaseName);
        System.out.println(lowercaseName);
        System.err.println(lowercaseNameLocale);
    }
}
