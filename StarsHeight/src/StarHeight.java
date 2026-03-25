import java.util.Scanner;
public class StarHeight {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int n = keyboard.nextInt();
        int cnt = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= cnt; j++) {
                System.out.print("*");
            }
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            System.out.print('\n');
            cnt += 2;
        }
    }
}