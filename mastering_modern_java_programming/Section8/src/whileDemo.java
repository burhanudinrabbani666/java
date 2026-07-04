public class whileDemo {
    public static void main(String[] args) {

        byte babyTemperature = 40;
        while (babyTemperature > 36) {
            System.out.println("baby drink extrajoss 💪");
            babyTemperature--;
        }

        System.out.println(String.format("""
                Baby temp now is normal %d.
                Thanks extrajoss 🔥
                """, babyTemperature));

    }
}
