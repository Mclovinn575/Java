import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        




        System.out.println("Rows:");
        int rows = input.nextInt();

        System.out.println("Columns:");
        int columns = input.nextInt();


        char[][] matrix = new char[rows][columns];



        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = 'x';
                
            }
        }


        System.out.println(matrix);







    }
}
