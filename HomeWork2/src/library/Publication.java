
package library;
public class Publication {

    /**
     * Declaration of the variables.
     */
    private String title;
    private String publisher;
    private int qty;
    final int number;
    private static int countnumber=10;

    /**
     A constructor that accepts the properties of the publication and
     * adapts them to the variables of the class.
     */
    public Publication(String title, String publisher, int qty){
        setTitle(title);
        setPublisher(publisher);
        setQty(qty);
        this.number=countnumber;
        countnumber++;


    }

    /**
     * A function that updates the value of the variable
     * as a result of receiving new values from the constructor
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * A function that updates the value of the variable
     * as a result of receiving new values from the constructor
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * A function that updates the value of the variable
     * as a result of receiving new values from the constructor
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     *A function that returns the current value of the variable
     */
    public String getTitle() {
        return title;
    }

    /**
     *A function that returns the current value of the variable
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     *A function that returns the current value of the variable
     */
    public int getQty() {
        return qty;
    }
}

