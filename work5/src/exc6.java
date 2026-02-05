public class exc6 {
    public static void main(String[] args) {
        int[] arr4 = {21 ,4 ,19 ,7 ,13 ,25 ,15 ,10 ,24};
         bubbleSort(arr4);
    }

    public static void bubbleSort(int[] arr4) {
        int k=0;
        for (int num = 0; num < arr4.length - 1; num++) {
            for(int bbl=0; bbl<arr4.length-1-num; bbl++){
                if(arr4[bbl]>arr4[bbl+1]) {
                    swap(arr4, bbl, bbl + 1);
                    k++;
                }
            }
        }
        System.out.print("The amount of exchanges I made between organs in the array is: " +k);
        }
    public static void swap(int []arr4, int i, int j){
        int temp=arr4[i];
        arr4[i]=arr4[j];
        arr4[j]=temp;
    }
}
