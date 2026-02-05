// Assignment: 7
// Author: Yoav Vaknin, ID: 208323261
import java.util.Scanner;
public class exc7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your number of words in matrix: ");
        int i = input.nextInt(); // int size
        String[] strArr = new String[i]; //chnage to strArr
        System.out.print("enter your words in array: ");
        for (int j = 0; j < i; j++) {
            strArr[j] = input.next();
        }

        functionA(strArr);
    }

    public static void functionA(String strArr[]) { //chnge to real function name
        Scanner input = new Scanner(System.in);
        System.out.print("enter your word (str): ");
        String str = input.next();
        int num = 0;

        for (int i = 0; i < strArr.length; i++) {
            if ((str.compareTo(strArr[i])) > 0)
                num++;
        }

        System.out.println("the number of word before str:" +num);
        functionB(strArr,str);
    }
    public static void functionB(String strArr[], String str){
        for (int i = 0; i < strArr.length; i++) {
            if ((str.compareTo(strArr[i])) > 0)
                System.out.println("the word before str:" +strArr[i]);
  }

}
}
