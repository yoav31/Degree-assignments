// Assignment: 6
// Author: Yoav Vaknin, ID: 208323261
import java.util.Scanner;
public class exc6 {
    public static void main(String[] args) {

        StringMatrix();
    }

    public static void StringMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your number of rows in array: ");
        int i = input.nextInt();
        System.out.print("enter your number of column in array: ");
        int j = input.nextInt();
        char[][] ch =  new char[i][j];

        System.out.print("fill your array: ");
        for (int r = 0; r < ch.length; r++) {
            for (int c = 0; c < j; c++) {
                  ch[r][c] = input.next().charAt(0);
            }
        }
        System.out.print("enter your word that you want to find: ");
        String str = input.next();

        column(str, ch, j, i);
    }

    public static void column(String str, char ch[][], int j, int i) {
        int sum=0 ;
        for (int r = 0; r < i; r++) {
            for (int c = 0; c < j; c++) {

              aa:  if (ch[r][c] == str.charAt(0)) {
                    for (int s = 0; s < str.length(); s++) {
                        for (int k = r; k < i; k++) {
                            if (ch[k][c] == str.charAt(s)) {
                                sum++;
                            }
                            else {
                                sum = 0;
                                break aa;
                            }
                        }
                    }
                }
                if(sum==str.length()){
                    System.out.print("(" + r + "," + c + ")");
                    System.out.print("(" + (r+str.length()) + "," + c + ")");
                }
            }
        }
        rows(str, ch, j, i);
    }

    public static void rows(String str, char ch[][], int j, int i) {
        int sum=0 ;

        for (int r = 0; r < i; r++) {
            for (int c = 0; c < j; c++) {

               aa: if (ch[r][c] == str.charAt(0)) {
                    for (int s = 0; s < str.length(); s++) {
                        for (int k = c; k < j; k++) {
                            if (ch[r][k] == str.charAt(s)) {
                                sum++;
                            }
                            else{
                                sum=0;
                                break aa;
                            }

                        }
                    }
                }
                if(sum==str.length()){
                    System.out.print("(" + r + "," + c + ")");
                    System.out.print("(" + r + "," + (c+str.length()) + ")");
                }
            }
        }
        diagonal1(str, ch, j, i);
    }

    public static void diagonal1(String str, char ch[][], int j, int i) {
        int sum=0;
        for (int r = 0; r < i; r++) {

          aa:  if (ch[r][r] == str.charAt(0)) {
                for (int s = 0; s < str.length(); s++) {
                    for (int k = r; k < j; k++) {
                        if (ch[k][k] == str.charAt(s)) {
                           sum++;
                        }
                        else{
                            sum=0;
                            break aa;
                        }
                    }
                }
            }
            if(sum==str.length()){
                System.out.print("(" + r + "," + r + ")");
                System.out.print("(" + (r+str.length())+ "," + (r+str.length()) + ")");
            }
        }
        diagonal2(str, ch, j, i);
    }

    public static void diagonal2(String str, char ch[][], int j, int i) {
        int sum=0;

        for (int r = 0; r < i; r++) {
            for (int c = 0; c < j; c++) {

          aa:      if (ch[r][(j - 1) - c] == str.charAt(0)) {
                    for (int s = 0; s < str.length(); s++) {
                        for (int k = r; k < j; k++) {
                            for (int h = c; h < j; h++) {
                                if (ch[k][j - h] == str.charAt(s)) {
                                   sum++;
                                }
                                else{
                                    sum=0;
                                    break aa;
                                }
                            }
                        }
                    }
                }
                if(sum==str.length()){
                    System.out.print("(" + r + "," + r + ")");
                    System.out.print("(" + (r+str.length())+ "," + (r+str.length()) + ")");
                }
            }
        }
    }
}
