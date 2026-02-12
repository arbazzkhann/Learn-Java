public class Method_Overloading {

    public static void main(String args[]) {
        myOverridedMethod();
        myOverridedMethod(22);
        myOverridedMethod("Arbaz");
        myOverridedMethod("Farhan", 10);
    }

    static void myOverridedMethod() {
        System.out.println("Hello i am normal method :)");
    }
    static void myOverridedMethod(int age) {
        System.out.println("Your age is: " + age);
    }
    static void myOverridedMethod(String name) {
        System.out.println("Your age is: " + name);
    }
    static void myOverridedMethod(String name, int age) {
        System.out.println("Hello, I am " + name + " and i am " + age + " years old.");
    }
}