// Assignment: 2
// Author: Yoav Vaknin, ID: 208323261
import java.util.Scanner;
public class exc2 {
    public static boolean isPalindrome(char[] ch) {
        if ((ch.length % 2) == 0)
            return false;
        else {
            for (int i = ch.length - 1; i >= 0; i--) {
                if (ch[i] != ch[ch.length - 1 - i])
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String temp = input.next();
        char[] ch = new char[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            ch[i] = temp.charAt(i);
        }
        System.out.print(isPalindrome(ch));
    }
}
