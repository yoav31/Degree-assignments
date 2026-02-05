package lab14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class FixedSizeQueue<T> implements SizeFixable<T> {

    protected ArrayList <T> list;
    private int size;
    public FixedSizeQueue(int size){
        this.size=size;
        this.list=new ArrayList<T>(this.size);
    }
    @Override
    public void add(T element) throws Exception {
        list.add(element);
//        for(int i=0; i< list.size(); i++){
//            if(list.get(i)==null) {
//                list.add(i, element);
//                break;
//            }
//        }
//        throw new Exception("ERROR");

    }

    public ArrayList<T> getList() {
        return list;
    }

    @Override
    public T remove() {
        T remove = list.get(0);
        list.remove(0);
        return remove;
    }

    @Override
    public int getSize() {
        int count=0;
        for(int i=0; i< list.size(); i++){
            if(list.get(i) == null) {
                break;
            }
            count++;
        }
        return count;
    }

    @Override
    public int getQSize() {
        return size;
    }

    @Override
    public void setQSize(int newQSize) throws Exception {
        if( list.size()<newQSize)
            list.subList(0,newQSize);
        else {
            throw new Exception("ERROR");
        }
    }

    @Override
    public String toString() {
        return "FixedSizeQueue{" +
                "list=" + list +
                '}';
    }
}
