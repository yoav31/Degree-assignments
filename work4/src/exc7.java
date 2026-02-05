// Assignment: 7
// Author: Yoav Vaknin, ID: 208323261
import java.util.Scanner;
public class exc7 {
    public static boolean subsetSum(int[] arr3, int sum5, int i) {
       return recursive(arr3, sum5, i);
    }
    public static boolean recursive(int[]arr3,int sum5,int i){
        if (sum5 == 0)
            return true;
        if (i == 0)
            return false;
        if (arr3[i - 1] > sum5)
            return recursive(arr3, sum5, i - 1);

        return recursive(arr3, sum5, i - 1) || recursive(arr3, sum5 - arr3[i - 1], i - 1);
     }


        public static void main(String[] args ){
            int[] arr3 = {3, 8, 15, 97, 6};
            int sum5 = 9;
            int i = arr3.length;
            if (subsetSum(arr3, sum5,  i)==true)
                System.out.print("there is subset in array with sum!");
            else
                System.out.print("there not is subset in array with sum!");


        }
    }

