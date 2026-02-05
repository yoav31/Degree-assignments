package lab8;

public class MyQueue implements Queue {

    private int size;

    private MyNode HeadNode;
    private MyNode TailNode;

    public MyQueue(){
        this.size=0;

    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setHeadNode(MyNode headNode) {
        HeadNode = headNode;
    }

    public void setTailNode(MyNode tailNode) {
        TailNode = tailNode;
    }

    @Override
    public boolean isEmpty(){
        if(size==0)
            return true;
        return false;
    }
    public void enqueue(MyNode node){
        if(size==0){
            this.HeadNode=node;
            this.TailNode=node;
            size++;
        }
        else {
            this.TailNode.setNext(node);
            setTailNode(node);
            size++;
        }
    }
    public MyNode dequeue(){
        MyNode temp=this.HeadNode;
        this.HeadNode=this.HeadNode.getNext();
        size--;
        return  temp;
    }

    public void printQueue() {
        MyNode temp=this.HeadNode;
        while (temp.next !=null){
            System.out.println(temp + "--------->" +temp.next);
            temp=temp.next;
        }
    }

}
