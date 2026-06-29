public class EmployeeMain {
    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.firstName = "burhanudin";
        employee1.lastName = "rabbani";
        employee1.age = 23;
        employee1.gender = 'M'; // String "", char ''

        System.out.println(employee1.getAge());
        System.err.println(employee1.getGender());

    }
}
