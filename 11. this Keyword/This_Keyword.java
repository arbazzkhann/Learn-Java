/*
    - This refers to the current object of the class.
    - It can also call constructor or current class.
    - Mostly used when local variable and instance variable have same name.
*/

class This_Keyword {
    int age;
    String myName;

    This_Keyword(int age, String myName) {
        this.age = age;
        this.myName = myName;
    }

    public static void main(String[] args) {
        This_Keyword thisKeyword = new This_Keyword(22, "Arbaz Khan");
        System.out.println(thisKeyword.age);
    }
}