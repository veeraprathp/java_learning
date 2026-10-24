public class switch_case {
    public static void main(String[] args) {
        char attendance = 'o';
        switch (attendance) {
            case 'o':
                System.out.println("Attendance is true");
                break;
            case 'x':
                System.out.println("Attendance is false");
                break;
            default:
                System.out.println("Invalid attendance value");
                break;
        }
    }
}
