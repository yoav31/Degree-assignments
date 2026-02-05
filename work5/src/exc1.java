public class exc1 {
    public static void main(String[] args) {
        String word="is a";
        String []str={"every moment", "of", "searching", "is a" ,"moment", "of encounter"};

        System.out.print(linearSearch(word, str));
    }
    public static int linearSearch(String word, String []str){
        for(int i=0; i<str.length; i++){
            if(str[i]==word) {
                System.out.println(" The amount of unsuccessful comparisons I've made is: " + i);
                return i;
            }
        }
        return -1;
    }
}
