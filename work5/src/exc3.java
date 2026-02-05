public class exc3 {
    public static void main(String[] args) {
        int[] arr1 = {-15, -5, -2, 1, 3, 7, 15, 48, 97};
        int num2 = 15;

        System.out.print("the index is: " + ternarySearch(arr1, num2));
    }

    public static int ternarySearch(int[] arr, int num2) {
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
}