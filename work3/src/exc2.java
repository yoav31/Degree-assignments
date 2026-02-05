
import java.util.Scanner;
public class exc2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter first number :");
        int num=input.nextInt();
        isPalindrome(num);

        System.out.print("Enter second number :");
        int num2=input.nextInt();
        isPrime(num2);

        System.out.print("Enter third number :");
        int num3=input.nextInt();
        System.out.print("Enter fourth  number :");
        int num4=input.nextInt();

        Palindromenumbers(num3,num4);
    }
    public static void isPalindrome(int num){
        int reserve=0,  reminder , originalnum=num ;

        while (num!=0){

            reminder=num%10;
            reserve= reserve*10+reminder;
            num/=10;
        }
        if(originalnum==reserve){
            System.out.print(originalnum+" is palindrome number!");
            System.out.println();
        }
        else{
            System.out.print(originalnum+" is not palindrome number!");
            System.out.println();
        }
    }
    public static void isPrime(int num){
        int sum=0;
        for(int i=1 ;i<=num; i++ ) {
            if(num%i==0) {
                sum++;
            }
        }
        if(sum==2) {
            System.out.print(num+" is prime number!");
            System.out.println();
        }
        else {
            System.out.print(num+" is not prime number!");
            System.out.println();
        }
    }

    public static void Palindromenumbers(int num3 , int num4) {
        int reserve=0,  reminder , originalnum ;
        for (int i=num3; i<=num4; i++ ) {
            originalnum = i;
            int iTemp = i;

            while (iTemp != 0) {
                reminder = iTemp % 10;
                reserve = reserve * 10 + reminder;
                iTemp /= 10;
            }
            if (originalnum == reserve) {
                System.out.print(originalnum + " ");
            }
            reserve = 0;

        }
        }

}
