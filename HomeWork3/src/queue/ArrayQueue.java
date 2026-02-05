// Assignment: 3
// Author: Yoav Haviv Vaknin, ID: 208323261
package queue;

public class ArrayQueue implements Queue {

    /**
     * Declaration of the variables.
     */
    private Object[] queue;
    private int size;


    /**
     *A constructor that accepts the parameter and matches it to a class variable.
     */
    public ArrayQueue(int capacity) {
        this.queue = new Object[capacity];
        setSize(0);
    }

    /**
     *A function that returns the current value of the variable
     */
    public Object[] getQueue() {
        return queue;
    }

    /**
     * A function that updates the value of the variable
     * as a result of receiving new values from the constructor
     */
    public void setQueue(Object[] queue) {
        this.queue = queue;
    }

    /**
     *A function that returns the current value of the variable
     */
    public int getSize() {
        return size;
    }

    /**
     * A function that updates the value of the variable
     * as a result of receiving new values from the constructor
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     *A function that adds an element to the end of the queue
     * and returns true/false if there is enough room for the element.
     */
    @Override
    public boolean enqueue(Object element) {
        if (this.size < this.queue.length) {
            this.queue[this.size] = element;
            this.size++;
            return true;
        }
        return false;
    }

    /**
     * function that removes an element from the head of the queue and updates the queue positions.
     */
    @Override
    public Object dequeue() {
        if (this.queue[0] == null)
            return null;
        Object answer=this.queue[0];
        for (int j = 0; j < queue.length; j++) {
            if (j + 1 < queue.length){
                Object temp=this.queue[j+1];
                this.queue[j] = temp;
    }
}
        setSize(getSize()-1);
        return answer;
    }

    /**
     *A function that returns the element at the top of the queue.
     */
    @Override
    public Object peek() {
        return this.queue[0];
    }

    /**
     *A function that returns the number of elements currently in the queue.
     */
    @Override
    public int size() {
        int count=0;
        for(int j=0; j<this.queue.length; j++){
            if(this.queue[j] != null)
                count++;
        }
        return count;
    }

    /**
     *A function that returns true if the queue is empty, otherwise returns false.
     */
    @Override
    public boolean isEmpty() {
        if(size ==0)
            return true;
        return false;
    }

    /**
     *A function that returns true if the queue is full, otherwise returns false.
     */
    @Override
    public boolean isFull() {
        if(this.queue[queue.length-1] !=null)
            return true;
        return false;
    }

}
