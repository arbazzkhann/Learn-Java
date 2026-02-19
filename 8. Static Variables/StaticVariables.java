/*
    - Variable belongs to class not any object.
    - It is shared by all objects of the class.
    - Only one copy of a static variables exists in memory.
    - Access using class name.
    - It's a common varibale.
    - Cannot use this or super keywords.
*/

class StaticVariables {
    String firstName = "Arbaz";
    String lastName = "Khan";
    static String university = "IGNOU";

    public static void main(String[] args) {
        System.out.print(university);
        // System.out.print(firstName + " " + lastName);  //gives error
    }
}