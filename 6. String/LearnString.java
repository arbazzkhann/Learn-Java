import java.lang.*;

public class LearnString {
    public static void main(String[] args) {
        String myName = new String("Arbaz Khan");
        System.out.println("myName: " + myName);

        String directName = "Arbaz";
        System.out.println("directName: " + directName);

        System.out.println(myName instanceof String);
        System.out.println(directName.getClass());   //checking its class
    }
}

/*
Important Methods of String:
    1. length()
    2. charAt(index)
    3. toUpperCase()
    4. toLowerCase()
    5. equals()
    6. equalsIgnoreCase()
    7. indexOf()
    8. substring(start)  /  substring(start, end)
    9. replace()
    10. trim()
*/
