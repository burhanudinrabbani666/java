package marvel.app;

import marvel.base.StaticBindingA;
import marvel.base.StaticBindingB;

public class StaticDynamicBindingDemo {

    public static void main(String[] args) {
        StaticBindingA a = new StaticBindingA();
        StaticBindingB b = new StaticBindingB();

        a.show();
        b.show();

        StaticBindingA obj = new StaticBindingB();
        obj.show();
    }
}
