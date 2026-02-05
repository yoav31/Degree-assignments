// Assignment: 9
// Author: Yoav Vaknin, ID: 208323261

import java.util.Scanner;

public class exc9 {

        public static void tribonacci ( int num4) {
            int []arr4={0,0,1,0}  ;
            int p=2;
            System.out.print("the number in Fibonacci series:");
            System.out.print(  " " + recursive(num4, arr4,p));

        }
        public static int recursive(int num4, int []arr4, int p){
            if (p>=num4)
                return arr4[3];
                arr4[3]=arr4[0]+arr4[1]+arr4[2];
                arr4[0]=arr4[1];
                arr4[1]=arr4[2];
                arr4[2]=arr4[3];
            return recursive(num4,arr4,p+1);

        }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your number: ");
        int num4 = 10;
        tribonacci ( num4);

    }
}

