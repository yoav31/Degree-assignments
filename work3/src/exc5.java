// Assignment: 5
// Author: Yoav Vaknin, ID: 208323261
import java.util.Scanner;
public class exc5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String str = input.next();
        CharClassification(str);
    }

    public static void CharClassification(String str) {
        char[] ch=str.toCharArray();
        int arr[]={0,0,0,0};

        for (int i = 0; i < ch.length; i++) {
            if (((int) ch[i] >= 65) && ((int) ch[i] <= 90)) {
                arr[0]++;
                continue;
            }
            if (((int) ch[i] >= 97) && ((int) ch[i] <= 122)) {
                arr[1]++;
                continue;
            }
            if (((int) ch[i] >= 48) && ((int) ch[i] <= 57)) {
                arr[2]++;
                continue;
            }
            arr[3]++;
        }
        System.out.println("the number in cell one is: "+arr[0]);
        System.out.println("the number in cell two is: "+arr[1]);
        System.out.println("the number in cell three is: "+arr[2]);
        System.out.println("the number in cell four is: "+arr[3]);
}
}
