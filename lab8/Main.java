package lab8;

public class Main {
    public static void main(String[] args){
        MyQueue queue=new MyQueue();
        MyNode myNode=new MyNode(6);
        queue.enqueue(myNode);
        MyNode myNode1=new MyNode(8);
        queue.enqueue(myNode1);
        MyNode myNode2=new MyNode(10);
        queue.enqueue(myNode2);
        MyNode myNode3=new MyNode(14);
        queue.enqueue(myNode3);
        queue.printQueue();



    }
}
