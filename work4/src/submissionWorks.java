// Assignment: 4
// Author: Yoav Vaknin, ID: 208323261
public class submissionWorks {
    public static void main(String[] args) {
        //exc1
        int sum1 = 0;
        int temp = 125421;
        System.out.println("2 appears "+count2(temp, sum1)+" times.");

        //exc2
        String temp2 = "yt7ty";
        char[] ch = new char[temp2.length()];
        for (int i = 0; i < temp2.length(); i++) {
            ch[i] = temp2.charAt(i);
        }
        System.out.println(temp2+" "+isPalindrome(ch)+" Palindrome");

        //exc3
        int sum2 = 0;
        int num1 = 1287;
        System.out.println("The sum of digits in "+num1+" is "+sumOfDigits(num1, sum2));

        //exc4
        int sum3=0, k=0;
        int[] arr ={1,2,3,4};
        System.out.println("sum of elements in array is even- "+sumIsEven(arr ,sum3, k ));

        //exc5
        int num2=4;
        int PowSum=1;
        System.out.println("answer:"+power(num2, PowSum));

        //exc6
        int[] arr2 = {1, 3, 2, 4};
        int sum4 = 0 ,j=0;
        System.out.println("the sum of od numbers:"+sumOfOddNumbers(arr2, sum4,j));

        //exc7
        int[] arr3 = {3, 8, 15, 97, 6};
        int i = arr3.length, sum5=9;
        if (subsetSum(arr3, sum5, i)==true)
            System.out.println("there is subset in array with sum!");
        else
            System.out.println("there not is subset in array with sum!");

        //exc8
        int num3 = 10;
        System.out.print("the numbers in tribonacci series: ");
        for(int t=0; t<num3; t++) {
            System.out.print( tribonacciElement(t)+" ");
        }
        System.out.println();

        //exc9
        int num4 =10;
        System.out.print("the number in Fibonacci series: ");
        for(int y=0; y<num4; y++) {
            System.out.print( tribonacci(y)+" ");
        }
    }

    //Q1
    public static int count2(int temp, int sum1) {
        if (temp == 0)
            return sum1;
        else {
            if (temp % 10 == 2) {
                sum1++;
            }
            temp /= 10;
            return count2(temp, sum1);
        }
    }


    //Q2
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


    //Q3
    public static int sumOfDigits(int num1, int sum2) {
        if (num1 == 0)
            return sum2;
        else {
            sum2 += num1 % 10;
            num1 /= 10;
            return sumOfDigits(num1, sum2);
        }
    }


    //Q4
    public static boolean sumIsEven(int []arr , int sum3, int k){
        recursive1(arr, sum3,k);
        return  ((recursive1(arr, sum3,k)%2==0));
    }
    public static int recursive1( int []arr , int sum3, int k){
        if(k> arr.length-1)
            return sum3;
        else {
            sum3 += arr[k];
            k++;
        }
        return recursive1(arr, sum3,k);

    }


    //Q5
    public static int power(int num2, int PowSum){
        if (num2==0)
            return PowSum;
        else{
            PowSum*=2;
            num2-=1;
        }
        return power(num2, PowSum);
    }


    //Q6
    public static int sumOfOddNumbers(int arr2[], int sum4, int j) {
        return recursive2(arr2, sum4,j);
    }
    public static int recursive2(int arr2[], int sum4, int j){
        if (j == arr2.length )
            return sum4;
        if (arr2[j] % 2 != 0)
            sum4 += arr2[j];
        j++;
        return recursive2(arr2, sum4, j);
    }


    //Q7
    public static boolean subsetSum(int[] arr3, int sum5, int i) {
        return recursive3(arr3, sum5, i);
    }
    public static boolean recursive3(int[]arr3,int sum5,int i){
        if (sum5 == 0)
            return true;
        if (i == 0)
            return false;
        if (arr3[i - 1] > sum5)
            return recursive3(arr3, sum5, i - 1);

        return recursive3(arr3, sum5, i - 1) || recursive3(arr3, sum5 - arr3[i - 1], i - 1);
    }

    //Q8
    public static int tribonacciElement(int t) {
        if ( t == 0 || t == 1)
            return 0;
        if (t == 2)
            return 1;
        if (t == 3)
            return 1;
        else
            return tribonacciElement(t - 1) + tribonacciElement(t - 2)+ tribonacciElement(t - 3);
    }

    //Q9
    public static int tribonacci ( int y) {
        int []arr4={0,0,1,0}  ;
        int p=2;
        return recursive4(y, arr4,p);
    }
    public static int recursive4(int y, int []arr4, int p){
        if (p>y)
            return arr4[3];
        if(p==y)
            return arr4[2];
        arr4[3]=arr4[0]+arr4[1]+arr4[2];
        arr4[0]=arr4[1];
        arr4[1]=arr4[2];
        arr4[2]=arr4[3];
        return recursive4 (y, arr4,p+1);

    }


}