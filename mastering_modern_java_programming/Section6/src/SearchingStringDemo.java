public class SearchingStringDemo {
    public static void main(String[] args) {
        String originalString = "Hello, world";

        // indexOf
        Integer indexOfHello = originalString.indexOf("world");
        System.out.println(indexOfHello);

        // contains method
        Boolean isContainsHello = originalString.contains("world");
        System.out.println(isContainsHello);

        // startWith and endWith method
        Boolean isStartWith = originalString.startsWith("hehe");
        Boolean isEndWith = originalString.endsWith("world");
        System.out.println(isStartWith);
        System.out.println(isEndWith);

        // matches with regex
        Boolean isMatched = originalString.matches("wo");
        System.out.println(isMatched);
    }
}
