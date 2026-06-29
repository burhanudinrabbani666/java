public class MethodInvocationDemo {
    public static void main(String[] args) {
        MethodInvocationDemo demoObj = new MethodInvocationDemo();
        demoObj.method1();
    }

    public void method1() {
        Integer number = 10;
        System.out.println("method 1");
        System.out.println(number);

        String output = method2();
        System.out.println(output);
    }

    public String method2() {
        String output = "Hello world";
        System.out.println("method 2");

        method3("Hi");

        return output;
    }

    public void method3(String input) {
        System.out.println(input);
        System.out.println("method 3");

        method4(10);
    }

    public void method4(Integer num) {
        System.out.println(num);
        System.out.println("method 4");
    }

}
