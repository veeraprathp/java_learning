public class app_form {
    String name;
    int rollno;

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
    }
    
    public void setName(String str , int num) {
        name = str;
        rollno = num;
        
    } 

     
    
}


class main {
    public static void main(String[] args) {
        app_form student1 = new app_form();
        student1.name = "John Doe";
        student1.rollno = 12345;
        student1.display();

        app_form student2 = new app_form();
        student2.name = "Jane Smith";   
        student2.rollno = 67890;
        student2.display();
    }
}