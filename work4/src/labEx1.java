
import java.util.*;
public class labEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 + (int) (N * Math.random());
        }
        System.out.print(count(arr));
    }

    public static int count(int[] arr) {
        int maxsum = 0, sum = 0, index=0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > arr.length / 2) {
                sum++;
            } else {
                if (sum > maxsum) {
                    maxsum = sum;

                }
                sum=0;
            }
        }
        System.out.print(index);
        return maxsum;
    }
}