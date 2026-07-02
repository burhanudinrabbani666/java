public class Replacing {
    public static void main(String[] args) {
        // all replace method is case sensitive
        // replace
        String helloWorld = "hello, world";
        String replacedHelloWorld = helloWorld.replace("o", "*");
        System.out.println(helloWorld);
        System.out.println(replacedHelloWorld);

        // replaceAll
        String helloWorld2 = "hello, world hahahaha";
        String replacedHelloWorld2 = helloWorld2.replaceAll("a|i|u|e|o", "*");
        System.out.println(helloWorld2);
        System.out.println(replacedHelloWorld2);

        // replaceFirst
        String helloWorld3 = "apple banana orange apple";
        String replacedHelloWorld3 = helloWorld3.replaceFirst("apple", "indomie");
        System.out.println(helloWorld3);
        System.out.println(replacedHelloWorld3);

    }
}