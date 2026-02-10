/*
    Type Casting:
        - Explicit conversion
        - Manual conversion
        - big datatype to smaller datatype
*/

class TypeCasting {
    void main(String args[]) {
        int a = 5523;
        byte k = (byte) a;

        System.out.println("k: "+ k);

        /*
        because of converting bigger datatype to smaller datatype,
        like "int" to "byte", java will perform this operaton: 
        (smaller datatype % bigger datatype)
        */ 
        int finalResult = k % a;
        System.out.print("finalResult: " + finalResult);
    }
}