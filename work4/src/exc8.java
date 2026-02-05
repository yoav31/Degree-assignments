// Assignment: 8
// Author: Yoav Vaknin, ID: 208323261

import java.util.Scanner;

public class exc8 {
    public static int tribonacciElement(int t) {
        if ( t == 0 || t == 1)
            return 0;
        if (t == 2)
            return 1;
        if (t == 3)
            return 1;
        else
        return tribonacciElement(t - 1) + tribonacciElement(t - 2)+ tribonacciElement(t - 3);
    }

        public static void main (String[]args){
            Scanner input = new Scanner(System.in);
            System.out.print("enter your number: ");
            int num3 = 10;
            System.out.print("the numbers in tribonacci series: ");
            for(int t=0; t<num3; t++) {
                System.out.print( tribonacciElement(t)+" ");
            }
        }

    }