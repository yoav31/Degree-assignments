package library;

/**
 * Assignment:2
 * @author Maor Pinhas id:324170885
 *
 */
public class journal extends publication {
    protected int issueNumber;
    protected int year;

    /**
     * creating a new journal object
     * @param title-presents the title of the journal
     * @param publisher-presents the publisher of the journal
     * @param qty-presents the amount of copies of the journal exists in the library
     * @param issueNumber-present the issue number of the journal
     * @param year-presents the year when the journal was written
     */
    public journal(String title, String publisher, int qty, int issueNumber, int year) {
        super(title,publisher,qty);
        setIssueNumber(issueNumber);
        setYear(year);
    }

    /**
     * the method checks and sets the given issueNumber value to the constructor due to the value
     * @param issueNumber- present the issue number of the journal that given to the constructor
     */
    public void setIssueNumber(int issueNumber) {
        if(issueNumber<0) {
            this.issueNumber=0;
        }
        else {
            this.issueNumber=issueNumber;
        }
    }

    /**
     * the method checks and sets the given year value to the constructor due to the value
     * @param year-presents the year when the journal was written that given to the constructor
     */
    public void setYear(int year) {
        if(year>=1900 && year<=2023) {
            this.year=year;
        }
        else {
            this.year=1;
        }
    }
    /**
     *override method that prints a limited journal details
     */
    @Override
    public String miniString () {
        return this.Public+"-Jrnl"+"          "+
                "qty:"+this.qty+" "+this.title;
    }

    /**
     * override method that prints the journal;s details
     */
    @Override
    public String toString() {
        return super.Public+"-Jrnl"+"       "+
                super.title+"("+this.issueNumber+")"+"\r\n"+
                "              published by "+super.publisher+"("+this.year+")";
    }
}

