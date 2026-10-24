public class constructor {
    int rollno;

    int marks;


    constructor (int num, int marks) {
        rollno = num;
        marks = marks;
    }
}


class Construct{
    public static void main(String[] args) {
        constructor student1 = new constructor(12345, 90);
        System.out.println("Roll No: " + student1.rollno);
        System.out.println("Marks: " + student1.marks);
    }
}