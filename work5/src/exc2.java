import java.lang.Math;
public class exc2 {
    public static void main(String[] args) {
        int []arr={-15,-5,-2,1,3,7,15,48,97} ;
        int num=15;

        wrapper(arr,num);
    }
    public static void wrapper(int []arr, int num){
       int jamp=(int)Math.floor(Math.sqrt(arr.length)) , temp=0, k=0;
        System.out.print(" The amount of unsuccessful comparisons I've made is: "+jumpSearch(arr, num, jamp, temp, k, jamp));
    }
    public static int jumpSearch(int []arr, int num, int jamp, int temp, int k, int step){
        if (jamp>=arr.length)
            return -1;
        k++;
        if (arr[temp]<=num && num<=arr[jamp]) {
            for (int i = temp; i <= jamp; i++) {
                if (arr[i] == num) {
                    System.out.println(" The index is:" + i);
                    return k;
                }
            }
        }
            return jumpSearch(arr, num, jamp+step, temp+step, k, step);
        }
    }

