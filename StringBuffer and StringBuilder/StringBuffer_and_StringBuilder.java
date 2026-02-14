/*
    - Those are mutable string.
    - Creates string without new object.
    - belongs to java.lang package
*/


// StringBuffer
// It is thread-safe
class StringBuffer_and_StringBuilder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        System.out.println(sb.capacity());
    

// ---------------------- StringBuilder ------------------------
// Faster than StringBuffer
// It is not synchronized
        StringBuilder sBuilder = new StringBuilder("Java");

        sBuilder.append(" Programming");
        sBuilder.insert(0, "Core ");
        System.out.println(sBuilder);
    }
}