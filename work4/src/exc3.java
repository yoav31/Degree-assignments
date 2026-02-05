// Assignment: 3
// Author: Yoav Vaknin, ID: 208323261

import java.util.Scanner;
public class exc3 {
public static int sumOfDigits(int num, int sum){
    if (num==0)
        return sum;
    else{
        sum+=num%10;
        num/=10;
        return sumOfDigits(num,sum);
    }
}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        System.out.print(sumOfDigits(num, sum));
    }
}
