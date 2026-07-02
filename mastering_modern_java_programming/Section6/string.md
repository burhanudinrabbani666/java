# Strings

```java
        // String pool
        String firstName = "burhanudin";

        // Heap memory
        String lastName = new String("rabbani");
```

**String pool** is a special area of heap memory that stores a pool of unique string literals in Java. When you create a string literal in your Java code, the JVM checks if the string already exists in the string pool. If it does, then the existing string is returned from the pool instead of creating a new string object. This is called string interning

If we create a String object using the `new operator`, a new object will be created in memory every time, even if the string value is the same. In contrast, if the string is created using literals, the same memory location is used in the String pool.
