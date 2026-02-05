// Assignment: 5
// Author: Yoav Vaknin, ID: 208323261
import java.util.Scanner;
public class exc5 {
    public static int power(int num, int PowSum){
        if (num==0)
            return PowSum;
        else{
            PowSum*=2;
            num-=1;
        }
       return power(num, PowSum);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        int PowSum=1;
        System.out.print("answer:"+power(num, PowSum));
    }
}
