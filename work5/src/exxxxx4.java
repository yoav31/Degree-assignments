
public class exxxxx4 {
    public static void main(String[] args) {
        int []arr={-15,-5,-2,1,3,7,15,48,97} ;
        int num=15;

        wrapper(arr,num);
    }
    public static void wrapper(int []arr, int num){
        int jamp=0, temp=0, k=0, step=(int)Math.floor(Math.sqrt(arr.length));
        System.out.print(" The amount of unsuccessful comparisons I've made is: "+jumpSearch(arr, num, jamp, temp, k, step));
    }
    public static int jumpSearch(int []arr, int num, int jamp, int temp, int k, int step){
        if (arr[jamp] < num) {
            temp = jamp;
            jamp = Math.min(jamp + step, arr.length - 1);
            k++;
            return jumpSearch(arr, num, jamp, temp, k, step);
        }
        for (int i = temp; i <= jamp; i++) {
            if (arr[i] == num) {
                System.out.println(" The index is:" + i);
                return k;
            }
        }
        return -1;
    }

}