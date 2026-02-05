// Assignment: 4
// Author: Yoav Haviv Vaknin, ID: 208323261
package set;
public class SimpleSet <E> implements Set <E> {

    /**
     * Declaration of the fields
     */
    private int capacity;
    private E[] elements;
    private int size;

    /**
     *A constructor that receive the instance variables and matches them to the fields
     */
    public SimpleSet(int capacity){
        this.capacity=capacity;
        this.size=0;
        this.elements= (E[]) new Object[capacity];
    }
    /**
     *A constructor that receive the instance variables and matches them to the fields
     */
    public SimpleSet(){
        this.capacity=5;
        this.size=0;
        this.elements= (E[]) new Object[capacity];

    }

    /**
     *A function that returns the current value of the field
     */
    public E[] getElements() {
        return elements;
    }

    /**
     *A function that adds instance to the elenmets field
     */
    @Override
    public void add(E e) {
            if(contains(e))
               return;
            if (this.size < this.capacity) {
                this.elements[this.size] = e;
                this.size++;
                return;
            }
            if (this.size >= this.capacity){
                this.capacity+=5;
                E temp[] = this.elements;
                this.elements=(E []) new Object[this.capacity];

                for(int i=0; i<size; i++){
                    this.elements[i] = temp[i];
                }
                this.elements[this.size] = e;
                this.size ++;

            }
    }

    /**
     *A function that removed instance from the elenmets field
     */
    @Override
    public boolean remove(E e) {
        int index=0;
        for (int i=0; i< this.elements.length; i++){
            if(this.elements[i]==e){
                this.elements[i]=null;
                 E []temp= (E[]) this.elements[this.size];

                 for(int j=0; j<temp.length; j++) {   // העתקת המערך חדש באופן מסודר בלי null
                     if(temp[j] !=null) {
                         this.elements[index] = temp[j];
                         index++;
                     }
                 }
            }
                 return true;
            }
        return false;
    }

    /**
     *A function to check whether any element is found in the elements array
     */
    @Override
    public boolean contains(E e) {
        for (int i=0; i< this.elements.length; i++) {
            if (this.elements[i] == e )
                return true;
        }
        return false;
    }

    /**
     *A function that returns the number of full cells
     */
    @Override
    public int size() {
        int sum=0;
        for (int i=0; i< this.elements.length; i++) {
            if (this.elements[i] != null)
                sum++;
        }
        return sum;
    }

    /**
     *Function to check if the array is empty
     */
    @Override
    public boolean isEmpty() {
        for (int i=0; i< this.elements.length; i++) {
            if (this.elements[i] != null)
                return false;
        }
        return true;
    }

    /**
     *Print function according to the work requirement
     */
    @Override
    public String toString() {
        String str="";
        for(int i=0; i<this.elements.length; i++){
            if(this.elements[i] != null)
                str+=this.elements[i]+" " ;
        }
        return str;

    }
}
