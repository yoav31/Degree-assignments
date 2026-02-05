public class exc5 {
    public static void main(String[] args){
        int []arr3={21 ,4 ,19 ,7 ,13 ,25 ,15 ,10 ,24};
        insertionSort(arr3);
    }
    public static void insertionSort(int []arr3) {
        int k=0;
        for (int i = 1; i < arr3.length; i++) {
            k+=insert(arr3, i, k);;
        }
        System.out.print("The amount of exchanges I made between organs in the array is: "+k);
    }

    public static int insert(int[] arr3, int j, int k) {
        k=0;
        int value = arr3[j];
        while (j > 0 && arr3[j - 1] < value) {
            k++;
            arr3[j] = arr3[j - 1];
            j=j-1;
        }
        arr3[j]=value;
        return k;
        }

}
