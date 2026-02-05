
// Assignment: 4
// Author: Yoav Vaknin, ID: 208323261
import java.util.Scanner;
public class exc4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a ID number: ");
        String ID = input.next();
        char IDarr[] = new char[8];

        for (int i = 0; i < IDarr.length; i++) {
            IDarr[i] = ID.charAt(i);
        }

        input.close();
        CheakNum(IDarr);

    }

    public static void CheakNum(char IDarr[]) {
        int sum, k, i, sum1 = 0;
        for (i = 0; i < IDarr.length; i++) {
            if (i % 2 == 0)
                k = 1;
            else
                k = 2;
            sum = ((int) IDarr[i] - 48) * k;
            if (sum > 10) {
                sum1 += sum % 10;
                sum1 += (sum / 10) % 10;
            } else
                sum1 += sum;
        }
        for (i = 0; i < 9; i++) {
            if ((sum1 + i) % 10 == 0)
                System.out.print("the cheak number in ID is: " + i);
        }
    }
}