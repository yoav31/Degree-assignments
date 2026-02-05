// Assignment: 3
// Author: Yoav Haviv Vaknin, ID: 208323261
package queue;

/**
 * An example to run as in the example on the worksheet
 */
public class Main {
    public static void main(String[] args){

        ArrayQueue nn=new ArrayQueue(6);
       // System.out.println(nn.getSize());
        nn.enqueue(7);
        nn.enqueue(12);
        nn.enqueue(8);
        nn.enqueue(102);
        nn.enqueue(12);
        System.out.println(nn.dequeue());
        System.out.println( nn.peek());
        System.out.println(nn.dequeue());
        System.out.println(nn.size());
        System.out.println(nn.isFull());
        System.out.println(nn.isEmpty());

    }

}
