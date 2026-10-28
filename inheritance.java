public class inheritance {
    public static void main(String[] args) {
        Son  s  = new Son();
        System.out.println(s.gender);
        s.print();
    }

    static class Father {
        char gender = 'M';

        void print (){
            System.out.println("Father");
        }

    }

    static class Son extends Father {
    }
}
