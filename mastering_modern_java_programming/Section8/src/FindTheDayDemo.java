public class FindTheDayDemo {
    public static void main(String[] args) {
        String whatIsToday = "Saturday";

        if (whatIsToday.equals("Monday"))
            IO.println("It is Monday");
        else if (whatIsToday.equals("Tuesday"))
            IO.println("It is Tuesday ");
        else if (whatIsToday.equals("Wednesday"))
            IO.println("It is Wednesday");
        else if (whatIsToday.equals("Thursday"))
            IO.println("It is Thursday");
        else if (whatIsToday.equals("Friday"))
            IO.println("It is Friday");
        else if (whatIsToday.equals("Saturday"))
            IO.println("It is Saturday");
        else if (whatIsToday.equals("Sunday"))
            IO.println("It is Sunday");
        else
            IO.println("Invalid input");

    }
}
