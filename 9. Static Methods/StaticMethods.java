/*
    - Belongs to class not to any objects.
    - It can access sttaic variables directly.
    - It cannot directly access non-static (instance) variables.
*/

class StaticMethods {
    String firstName;
    String lastName;
    static String country = "India";

    StaticMethods(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void name() {
        System.out.println("FullName: " + firstName + " " + lastName);
    }

    static void myStaticObject() {
        System.out.print(country);
    }

    public static void main() {
        StaticMethods staticMethods = new StaticMethods("Arbaz", "Khan");
        staticMethods.name();   // calling with class's object
        
        myStaticObject();   // calling without class's object
    }
}