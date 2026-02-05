// Assignment: 5
// Author: Yoav Vaknin, ID: 208323261
public class hw5 {
    public static void main(String[] args) {

        //exc1
        String word="is a";
        String []str={"every moment", "of", "searching", "is a" ,"moment", "of encounter"};

        System.out.println("index: "+linearSearch(word, str));

        //exc2
        int []arr={-15,-5,-2,1,3,7,15,48,97} ;
        int num=15;
        wrapper(arr,num);

        //exc3
        int[] arr1 = {-15, -5, -2, 1, 3, 7, 15, 48, 97};
        int num2 = 15;
        System.out.println("the index is: " + ternarySearch(arr1, num2));

        //exc4
        char[] arr2 = {'t', 't', 'p', 'm', 'l', 'k', 'e', 'e', 'a'};
        char word1 = 'e';
        System.out.println("The amount of unsuccessful equalizations I've made is: " + interpolationSearch(arr2, word1));

        //exc5
        int []arr3={21 ,4 ,19 ,7 ,13 ,25 ,15 ,10 ,24};
        insertionSort(arr3);

        //exc6
        int[] arr4 = {21 ,4 ,19 ,7 ,13 ,25 ,15 ,10 ,24};
        bubbleSort(arr4);
    }

    public static int linearSearch(String word, String []str){      //exc1
        for(int i=0; i<str.length; i++){
            if(str[i]==word) {
                System.out.println(" The amount of unsuccessful comparisons I've made is: " + i);
                return i;
            }
        }
        return -1;
    }
    public static void wrapper(int []arr, int num){         //exc2
        int jamp=(int)Math.floor(Math.sqrt(arr.length)) , temp=0, k=0;
        System.out.println(" The amount of unsuccessful comparisons I've made is: "+jumpSearch(arr, num, jamp, temp, k, jamp));
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

    public static int ternarySearch(int[] arr, int num2) {  //exc3
        int l = 0, r = arr.length - 1;
        int m = l + (r - l) / 3;
        if (arr[m] >= num2) {
            for (int i = 0; i <= m; i++) {
                if (arr[i] == num2)
                    return i;
            }
        }
        if (arr[2 * m] >= num2) {
            for (int i = m + 1; i <= 2 * m; i++) {
                if (arr[i] == num2)
                    return i;
            }
        }
        if (arr[3 * m] >= num2) {
            for (int i = 2 * m + 1; i <= 3 * m; i++) {
                if (arr[i] == num2)
                    return i;
            }
        }
        return -1;
    }

    public static int interpolationSearch(char[] arr, char word) {    //exc4
        int low = 0, high = arr.length - 1, k = 0;
        while (low <= high) {

            int probe = low + ((high - low) * (((int) word - (int) arr[low])) / ((int) arr[high] - (int) arr[low]));

            if (arr[probe] == word) {
                System.out.println("the index is: " + probe);
                return k;
            } else if ((int) arr[probe] < (int) word)
                low = probe + 1;
            else
                high = probe - 1;
            k++;
        }
        return k;
    }

    public static void insertionSort(int []arr3) {   //exc5
        int k=0;
        for (int i = 1; i < arr3.length; i++) {
            k+=insert(arr3, i, k);;
        }
        System.out.println("The amount of exchanges I made between organs in the array is: "+k);
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
