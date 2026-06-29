public class EmployeeMain {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Burhanudin", "Rabbani", (byte) (23), 'M');
        Employee employee2 = new Employee();

        System.out.println(employee1.getAge());
        System.err.println(employee1.getGender());

        System.out.println(employee2.getAge());
        System.err.println(employee2.getGender());

    }
}
