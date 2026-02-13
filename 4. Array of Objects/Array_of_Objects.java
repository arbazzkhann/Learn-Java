class Students {
    String name;
    int rollno;
    int marks;
}

class Array_of_Objects {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "Shahrukh";
        s1.rollno = 1;
        s1.marks = 70;

        Students s2 = new Students();
        s2.name = "Roshan";
        s2.rollno = 2;
        s2.marks = 88;

        Students s3 = new Students();
        s3.name = "Kartik";
        s3.rollno = 3;
        s3.marks = 72;

        //Array of objects
        Students s[] = new Students[3];
        s[0] = s1;
        s[1] = s2;
        s[2] = s3;

        for(int i=0; i<s.length; i++) {
            System.out.println("Name: " + s[i].name);
        }
    }
}