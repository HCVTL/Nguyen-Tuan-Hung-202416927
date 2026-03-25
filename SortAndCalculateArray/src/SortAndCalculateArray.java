import java.util.Scanner;
import java.util.Arrays;
public class SortAndCalculateArray {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

          int n = keyboard.nextInt();
          int [] arr = new int[n];
          for (int i = 0; i < n; i++) {
              arr[i] = keyboard.nextInt();
          }

          Arrays.sort(arr);

          System.out.println("Sorted array: " + Arrays.toString(arr));

          int sum = 0;
          double avg = 0;
          for (int i = 0; i < n; i++) {
              sum += arr[i];
          }

          avg = (double)sum / n;

          System.out.println("Sum: " + sum);
          System.out.println("Average: " + avg);


    }
}