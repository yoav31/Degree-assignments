package lab9;
import java.util.Objects;


/**
 * A generic class representing a Pair of elements.
 *
 * @param <T> the type of the first element in the Pair
 * @param <U> the type of the second element in the Pair
 */
public class Pair<T, U> {
    private T first;
    private U second;

    /**
     * Constructs a Pair object with the specified elements.
     *
     * @param first  the first element of the Pair
     * @param second the second element of the Pair
     */
    public Pair(T first, U second) {
        //TODO
        this.first=first;
        this.second=second;
    }

    /**
     * Returns the first element of the Pair.
     *
     * @return the first element
     */
    public T getFirst() {
        //TODO
        return first;
    }

    /**
     * Sets the first element of the Pair.
     *
     * @param first the new value for the first element
     */
    public void setFirst(T first) {
        //TODO
        this.first=first;
    }

    /**
     * Returns the second element of the Pair.
     *
     * @return the second element
     */
    public U getSecond() {
        //TODO
        return second;
    }

    /**
     * Sets the second element of the Pair.
     *
     * @param second the new value for the second element
     */
    public void setSecond(U second) {
        //TODO
        this.second=second;
    }

    /**
     * Returns a String representation of the Pair.
     *
     * @return a String representation of the Pair
     */
    @Override
    public String toString() {
        //TODO
        return "first:"+first+"  second:"+second;
    }

    /**
     * Checks if this Pair is equal to another object.
     *
     * @param obj the object to compare with this Pair
     * @return true if the object is equal to this Pair, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        //TODO
        if(this==obj)
            return true;
        if(obj==null || getClass() != obj.getClass())
            return false;
        Pair<T, U> pair = (Pair<T, U>) obj;
        return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
    }

    /**
     * Creates a new Pair with swapped elements.
     *
     * @return a new Pair with swapped elements
     */
    public Pair<U, T> swap() {
        //TODO
         return new Pair(this.second, this.first);
    }

    /**
     * Checks if either of the elements in the Pair is null.
     *
     * @return true if either element is null, false otherwise
     */
    public boolean hasNullElement() {
        //TODO
        if(first==null || second==null)
            return true;
        return false;
    }

    /**
     * Combines the elements of this Pair with the elements of another Pair
     * to create a new Pair.
     *
     * @param third the type of the third element in the resulting Pair
     * @return a new Pair with the combined elements
     */
    public Pair<Pair<T, U>, U> combine(U third) {
        //TODO
        return new Pair<>(this, third);
    }

}
