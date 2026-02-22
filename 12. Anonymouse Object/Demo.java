/*
    - Used only once
    - Object without reference variable
    - Saves memory
    - Created using -> new ClassName()
    - Doesn't have name
    - Object is destroyed after use
    - Didn't stored in stack
*/

class A {
    public A() {
        System.out.println("A's constructor");
    }

    public void show() {
        System.out.println("in A show");
    }
}

public class Demo {
    public static void main(String a[]) {
        new A().show();  // Anonymous Object
    }
}