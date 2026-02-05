// Assignment: 1
// Author: Yoav Vaknin, ID: 208323261
import java.util.Scanner;
public class exc1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int sum1=0;
        System.out.print("Enter your number: ");
        int temp= input.nextInt();
        System.out.println(count2(temp,sum1));
    }
    public static int count2( int temp, int sum1){
        if(temp==0)
            return sum1;
        else {
            if (temp % 10 == 2) {
                sum1++;
            }
            temp/=10;
            return count2(temp, sum1);
        }
    }



}
