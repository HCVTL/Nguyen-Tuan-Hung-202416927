import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter size of matrix");
        System.out.print("n = ");
        int n = keyboard.nextInt();
        System.out.print("m = ");
        int m = keyboard.nextInt();

        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];

        System.out.println("Enter first matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = keyboard.nextInt();
            }
        }

        System.out.println("Enter second matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr2[i][j] = keyboard.nextInt();
            }
        }

        System.out.println("Result matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr1[i][j] + arr2[i][j] + " ");
            }
            System.out.println();
        }

    }
}