import java.util.Collections;
import java.util.List;

public class JoinDemo {
    public static void main(String[] args) {
        String fullName = String.join(" ", "burhanudin", "rabbani");
        System.out.println(fullName);

        List<String> emptyString = Collections.emptyList();
        String result = String.join(" ", emptyString);
        System.out.println(result);

    }
}
