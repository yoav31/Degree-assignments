// Assignment: 1
// Author: Yoav Vaknin, ID: 208323261
import java.util.Scanner;
public class exc1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        while (true) {
            System.out.println("enter a odd positive number:");
            n = input.nextInt();
            if (n > 0 && n % 2 != 0) {
                break;
            } else {
                System.out.println("eror try again");
            }
        }

        num(n);
    }

    public static void num(int n) {
        int i, k;
        for (i = 0; i <= (n / 2); i++) {
            for (k = 0; k < n; k++) {
                if (k + i < n / 2) {
                    System.out.print(" ");
                }
                else if (k <= n / 2 + i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (i = 1; i <= (n / 2); i++) {
            for (k = 0; k < n; k++) {
                if (i > k)
                    System.out.print(" ");
                 else if (k < n - i)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}