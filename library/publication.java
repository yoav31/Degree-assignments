package library;
/**
 * Assignment:2
 * @author Maor Pinhas  id;324170885
 *
 */
public class publication {
    protected String title;
    protected String publisher;
    protected int qty;
    static int publicationCounter=10;
    final int Public;

    /**
     * creating a publication with given parameters
     * @param title- presents the title of the document
     * @param publisher-presents the name of the publisher
     * @param qty-presents the amount of copies of the document that exist in the library
     */
    public publication(String title, String publisher, int qty) {
        setTitle(title);
        setPublisher(publisher);
        setQty(qty);
        this.Public=publicationCounter;
        publicationCounter++;
    }

    /**
     * the method checks and sets the given title value to the constructor due to the value
     * @param title-presents the title of the document that given to the constructor
     */
    public void setTitle(String title) {
        if(title.length()>0) {
            this.title=title;
        }
        else {
            this.title="invalid title";
        }
    }

    /**
     * the method checks and sets the given publisher to the constructor due to the value
     * @param publisher-presents the publisher of the publication
     */
    public void setPublisher(String publisher) {
        if(publisher.length()>0) {
            this.publisher=publisher;
        }
        else {
            this.publisher="unknown";
        }
    }

    /**
     * the method checks and sets the given qty to the constructor due to the value
     * @param qty-presents the amount of copies of the publication that exist in the library
     */
    public void setQty(int qty) {
        if(qty<0) {
            this.qty=0;
        }
        else {
            this.qty=qty;
        }
    }

    /**
     * the method prints a limited publication details
     * @return limited publication details
     */
    public String miniString () {
        return this.Public+"-Artl"+"          "+
                "qty:"+this.qty+" "+this.title;
    }

    /**
     * override method that prints the publication details
     */
    @Override
    public String toString() {
        return this.Public+"-pub"+"        "+
                this.title+" published by "+this.publisher;
    }

    /**
     * override method that compares between two publication objects
     */
    @Override
    public boolean equals(Object o) {
        if(this==o) {
            return true;
        }
        if (!(o instanceof publication)) {
            return false;
        }
        publication publication1 = (publication) o;
        return publication1.title==this.title && publication1.publisher==this.publisher && publication1.qty==this.qty ;
    }



}

