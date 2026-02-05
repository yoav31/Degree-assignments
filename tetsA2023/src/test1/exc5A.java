package test1;

public class exc5A {
    public static void main(String[] args) {
        int []array={4, 5, 0, 4, 4, 1, 0, 1, 3, 1, 3, 0, 4, 0, 0, 0, 0, 4, 0, 4, 4};
        int k=5;
         int []arr=countSort(array,k);
        int length= array.length;
        sortAcordingToCount(arr, length);
    }
    public static int [] countSort(int []array, int k){
        int []arr=new int[k+1];
        int sum=0;

        for (int i=0; i<k+1; i++){
            for (int j=0; j< array.length; j++){
                if(i==array[j])
                    sum++;
            }
            arr[i]=sum;
            sum=0;
        }
        return arr;
    }
    public static int [] sortAcordingToCount(int []arr, int length) {
        int[] array = new int[length];
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                array[num] = i;
                num++;
            }
        }
        return array;
    }
}
