package lab14;

import java.util.Collection;
import java.util.Scanner;

public class MainEX3 {
    public static void main(String [] args) throws Exception {
        Scanner in=new Scanner(System.in);
        FixedSizeQueue list=new FixedSizeQueue(5);

        try {
            list.add(1);
            list.add(2);
            list.add(13);
            list.add(4);
            System.out.println(list);

        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(list.getSize());
        System.out.println(list.getQSize());
        System.out.println(list.remove());
        System.out.println(list.getSize());
        System.out.println(list.getList());

        try {
            list.add(10);
            list.add(20);

        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(list.remove());
        try {
            list.setQSize(3);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            System.out.println("try again");
            int n=in.nextInt();
            list.setQSize(n);
        }
        System.out.println(list.getQSize());
    }
}
