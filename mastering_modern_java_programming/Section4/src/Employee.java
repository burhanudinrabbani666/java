public class Employee {

    /**
     * ---------------------------------------------------------------
     * VARIABLE
     * ---------------------------------------------------------------
     */
    String firstName;
    String lastName;
    byte age;
    char gender;

    /**
     * ---------------------------------------------------------------
     * CONSTRUCTOR
     * ---------------------------------------------------------------
     */
    public Employee(String firstName, String lastName, byte age, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;

        System.out.println("Object is created. Hello " + this.firstName);
    }

    // Default constructor chaining.
    public Employee() {
        this("Jhon", "Doe", (byte) 30, 'M');

        System.out.println("Object is created by default");
    }

    /**
     * ---------------------------------------------------------------
     * METHOD
     * ---------------------------------------------------------------
     */
    public byte getAge() {
        return this.age;
    }

    public char getGender() {
        return this.gender;
    }

}
