package test1;

public class exc4 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 1;
        System.out.println(search(a, k));

    }

    public static int search(int[] a, int k) {
        if (a[0] > k)
            return -1;

        int jamp = (int) Math.sqrt(a.length);

        for (int i = 0; i < a.length; i++) {
            if ((a[i] >= k) && ((i - jamp) >= 0)) {
                for (int j = i - jamp; j <= i + jamp; j++) {
                    if (a[j] == k)
                        return j;
                }
            }
        }
        return -1;
    }
}





