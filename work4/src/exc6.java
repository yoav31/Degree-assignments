// Assignment: 6
// Author: Yoav Vaknin, ID: 208323261

import java.util.Scanner;

public class exc6 {
    public static int sumOfOddNumbers(int arr2[], int sum4, int j) {
        return recursive(arr2, sum4,j);
        //System.out.println("the sum of od numbers:"+recursive(arr2, sum4,j));
    }
    public static int recursive(int arr2[], int sum4, int j){
        if (j == arr2.length )
            return sum4;
        if (arr2[j] % 2 != 0)
            sum4 += arr2[j];
        j++;
        return recursive(arr2, sum4, j);
    }


    public static void main(String[] args) {
        int[] arr2 = {1, 3, 2, 4};
        int sum4 = 0 ,j=0;
        System.out.println("the sum of od numbers:"+sumOfOddNumbers(arr2, sum4,j));
    }
}
