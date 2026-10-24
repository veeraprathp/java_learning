// public class array {
//     public static void main(String[] args) {
//         int[] rollno = new int[5];
//         rollno[0] = 1;
//         System.out.println(rollno[0]);
//     }
// }


public class matrix{
    public static void main(String[] args) {
       int [][] matrix = new int[3][3];
       int count = 1;
       for (int i = 0 ; i<3 ; i++)
       {
           for (int j = 0 ; j<3 ; j++)
           {
               matrix[i][j] = count;
               count++;
               System.out.print(matrix[i][j] + " ");
           }
       }
    }
}
