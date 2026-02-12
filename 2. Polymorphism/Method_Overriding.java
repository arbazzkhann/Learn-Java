class Method_Overriding {
    public static void main(String[] args) {

        Method_Overriding obj = new ChildClass();
        obj.OverridingMethod();
    }

    void OverridingMethod() {
        System.out.println("I am parent class's method.");
    }
}

class ChildClass extends Method_Overriding {
    void OverridingMethod() {
        System.out.println("I am child class's method.");
    }
}
