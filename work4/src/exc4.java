// Assignment: 4
// Author: Yoav Vaknin, ID: 208323261
import java.util.Scanner;
public class exc4 {
public static boolean sumIsEven(int []arr , int sum, int i){
    recursive(arr, sum,i);
    return  ((recursive(arr, sum,i)%2==0));
        }
public static int recursive( int []arr , int sum, int i){
    if(i> arr.length-1)
        return sum;
else {
        sum += arr[i];
        i++;
    }
   return recursive(arr, sum,i);

}


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number of cells in your array:");
        int k= input.nextInt();
        int sum=0, i=0;
        int[] arr = new int[k];
        System.out.print("fill your array: ");
        for(i=0; i< k; i++) {
             arr[i] = input.nextInt();
        }
        i=0;
        System.out.print(sumIsEven(arr ,sum, i ));

}
}
