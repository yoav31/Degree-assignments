package SampleExam;

public interface SortedList<T extends Comparable<T>> {
    void add(T element);
    void remove(T element);
    T get(int index);
}
