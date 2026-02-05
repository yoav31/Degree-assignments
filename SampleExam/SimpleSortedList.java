package SampleExam;

import java.util.LinkedList;

public class SimpleSortedList<T extends Comparable<T>> implements SortedList <T> {
    private LinkedList<T> list;
    public SimpleSortedList(){
        this.list=new LinkedList<>();
    }

    public void add(T element){
        int index=0;
        while (index<list.size() && element.compareTo(list.get(index))>=0){
            index++;
        }
        list.add(index,element);
        }

        public void remove(T element){
            list.remove(element);
        }
        public T get(int index){
        return (T) list.get(index);
        }
}
