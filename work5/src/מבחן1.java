public class מבחן1 {
    public static void main(String[] args) {
        int []arr={100,6,2,10,8,12,10,66,1};
        int n= arr.length;
        System.out.println(max(arr, n));
        String str="abcd";
        System.out.println(word(str));

    }
    public static int max(int []arr, int n){
        n-=1;
        if (n<0)
            return 0;
        return Math.max(max(arr, n), arr[n]);
    }

    public static String word(String str){
        String word="";
        for(int i=str.length()-1; i>=0; i--){
            word+=str.charAt(i);
        }
        return word;
    }
}
