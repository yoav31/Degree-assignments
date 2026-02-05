// Assignment: 2
// Author: Yoav Haviv Vaknin, ID: 208323261
package library;

public class Journal extends Publication {
    /**
     * Declaration of the variables.
     */
    private int issueNumber;
    private int year;

    /**
     A constructor that accepts the properties of the journal and
     * adapts them to the variables of the class.
     */
    public Journal(String title, String publisher, int qty, int issueNumber, int year){
        super(title,publisher,qty);
        setIssueNumber(issueNumber);
        setYear(year);
    }

    /**
     *A function that returns the current value of the variable
     */
    public int getYear() {
        return year;
    }

    /**
     * A function that updates the value of the variable
     * as a result of receiving new values from the constructor
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     *A function that returns the current value of the variable
     */
    public int getIssueNumber() {
        return issueNumber;
    }

    /**
     * A function that updates the value of the variable
     * as a result of receiving new values from the constructor
     */
    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    /**
     *A function that returns the current value of the variable
     */
    @Override
    public String toString(){
        return this.number+"-Jrnl     "+getTitle()+" ("+getIssueNumber()+")\n"
                +"published by "+super.getPublisher()+" ("+getYear()+")";
    }

    /**
     * A function that prints the name of the object, quantity and the name of the journal
     */
    public String qty_information(){
        return this.number+"-Jrnl     "+"qty:"+this.getQty()+" "+this.getTitle();
    }
}
