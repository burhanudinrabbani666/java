public class SplitDemo {
    public static void main(String[] args) {
        String fruitsString = "apple,banana,orange,grape";
        String[] fruitsArray = fruitsString.split(",");

        for (Integer i = 0; i < fruitsArray.length; i++) {
            System.out.println(String.format("%d: %s", i, fruitsArray[i]));
        }

    }
}
