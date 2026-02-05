// Assignment: 3
// Author: Yoav Vaknin, ID: 208323261
import java.util.Scanner;
public class exc3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, j;

        System.out.print("Enter your n×n matrix :");
        i = input.nextInt();
        j = i;
        int[][] arr = new int[i][j];
        int num = i, sum = 0, sum2 = 0, count = 0;

        System.out.print(" Enter your matrix :");
        for (int k = 0; k < arr.length; k++) {
            for (int h = 0; h < arr.length; h++) {
                arr[k][h] = input.nextInt();
            }
        }
        input.close();
        MagicSquare(arr);
    }


    public static void MagicSquare(int arr[][]) {
        Scanner input = new Scanner(System.in);
        int num = arr.length, sum = 0, sum2 = 0, count = 0;

        for (int k = 0; k < arr.length; k++) {
            for (int h = 0; h < arr.length; h++) {
                sum = arr[k][h];
                sum2 += sum;
            }
            if (sum == (((num * (num * num + 1))) / 2)) {
                count++;
            } else {
                System.out.println("It's not a magic squere!");
                return;
            }
            sum = 0;
            sum2 = 0;
            if (count == num * num) {
                System.out.println("It's a magic squere!");
            }


        }
    }
}