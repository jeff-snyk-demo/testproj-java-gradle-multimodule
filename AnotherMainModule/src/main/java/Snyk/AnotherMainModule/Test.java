package Snyk.AnotherMainModule;

import Snyk.AnotherModule.TestClass;

public class Test {
    public static void main(String[] args) {
        System.out.println("hello from Snyk.AnotherMainModule!");

        TestClass c = new TestClass();
        System.out.println(c.getMessage());
    }
}
