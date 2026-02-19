/*
    - Wrapping data (variables) and methods together into one single unit (class).
    - Hiding internal data from outside use.
    - Encapsulation = Data hiding + Controlled access


    # How encapsulation works:
        1. Make variable private.
        2. Create getter method (to read value).
        3. Create setter method (to update value).
*/

class Encapsulation {
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "Arbaz Khan";
        System.out.println(h.name);

        h.setAge(22);
        System.out.println(h.getAge());
    }
}

class Human {
    private int age;
    String name;

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return this.age;
    }
}