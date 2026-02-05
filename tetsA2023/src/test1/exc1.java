package test1;

public class exc1 {
    public static void main(String[] args) {


        int[] a = {1, 2, 3, 4, 5};
        int[] b = {10, 20};
        swap(a, b);
        System.out.println(a.length);

    }
    public static void swap(int[] a, int[] b)
    {
        int[] tmp = a;
        a = b;
        b = tmp;
    }


}