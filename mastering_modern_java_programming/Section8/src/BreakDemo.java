public class BreakDemo {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 5)
                break;
            System.out.println(i);
        }

        // Break multiple file
        int[] arrayOfInt = { 43, 455, 4376, 343, 6 };
        int lookingFor = 455;
        boolean isFound = false;

        for (int i = 0; i < arrayOfInt.length; i++) {
            if (arrayOfInt[i] == lookingFor) {
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.println("Horee number is found");
        } else {
            System.out.println("oops number not found");
        }

    }
}
