public class SwitchDemo {
    public static void main(String[] args) {

        String fruitName = "banana";

        // switch case
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

        // switch expression
        String output = switch (fruitName) {
            case "banana", "apple" -> "$1.0 Charged";
            case "grapes" -> "$2.0 Charged";
            case "pineapple" -> "$2.5 Charged";
            case "mango" -> "$3.0 Charged";
            default -> "input your valid fruit name";
        };

        System.out.println(output + " expression");

    }
}
