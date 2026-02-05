package test1;

public class exc2B {
    public static void main(String[] args) {
        int[] array = {2, 3, 1, 4, 5};
    System.out.print(isPermutation(array));
    }
    public static  boolean isPermutation(int []array){
        int num= array.length;
        boolean[] b =new boolean[num+1];

        for(int i=1; i<num-1; i++){
            if (array[i]<=0 || array[i]>num)
                return false;
            if (b[array[i]]==true)
                return false;
            b[array[i]]=true;
        }
        return true;
    }
}
