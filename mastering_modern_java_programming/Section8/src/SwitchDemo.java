public class SwitchDemo {
    public static void main(String[] args) {

        String fruitName = "banana";

        switch (fruitName) {
            // multiaple cases
            case "banana":
            case "apple":
                System.out.println("$1.0 Charged");
                break;

            case "grape":
            case "pineapple":
                System.out.println("$2.0 Charged");
                break;

            // single case
            case "manggo":
                System.out.println("$3.0 Charged");
                break;

            default:
                System.out.println("Fruit pice not found!");
                break;
        }

    }
}
