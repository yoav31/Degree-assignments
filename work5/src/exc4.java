import java.util.ArrayList;
public class exc4 {
    public static void main(String[] args) {
        char[] arr2 = {'t', 't', 'p', 'm', 'l', 'k', 'e', 'e', 'a'};
        char word = 'e';
        System.out.print("The amount of unsuccessful equalizations I've made is: " + earchinterpolation(arr2, word));
    }

    public static int earchinterpolation(char[] arr, char word) {
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
}
