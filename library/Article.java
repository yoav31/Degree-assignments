package library;
/**
 * Assignment:2
 * @author Maor Pinhas id:324170885
 *
 */
public class Article extends journal {
    String articleName;
    Author author;
    String URL;


    /**
     * creating a new Article with given parameters
     * @param title-presents the title of the journal
     * @param publisher-presents who published the journal
     * @param qty-presents the amount of the copies of the article that exist in the library
     * @param issueNumber-present the issue number of the journal
     * @param year- presents the year when the article was written
     * @param articleName-presents the article name
     * @param author- presents the author of the article
     * @param URL- presents the URL address of the article
     */
    public Article(String title, String publisher, int qty, int issueNumber, int year, String articleName, Author author, String URL) {
        super(title,publisher,qty,issueNumber,year);
        this.author=author;
        setArticleName(articleName);
        setURL(URL);
    }
    /**
     * the method checks and sets the given articleName to the constructor due to the value
     * @param articleName- presents the article name  that given to the constructor
     */
    public void setArticleName(String articleName) {
        if(articleName.length()>0) {
            this.articleName=articleName;
        }
        else {
            this.articleName="unknown";
        }
    }
    /**
     * the method checks and sets the given URL to the constructor due to the value
     * @param URL- presents the URL address of the article that given to the constructor
     */
    public void setURL(String URL) {
        if(URL.length()>0) {
            this.URL=URL;
        }
        else {
            this.URL="unknown";
        }
    }

    /**
     * override method that prints a limited Article details
     */
    @Override
    public String miniString () {
        return this.Public+"-Artl"+"          "+
                "qty:"+this.qty+" "+this.articleName;
    }
    /**
     * override method that prints the Article details
     */
    @Override
    public String toString() {
        return super.Public+"-Artl"+"       "+
                this.articleName+", by "+this.author.toString()+"\r\n"+
                "              "+super.title+"("+super.issueNumber+")"+"\r\n"+
                "              published by "+super.publisher+"("+super.year+")"+"\r\n"+
                "              "+this.URL;
    }
}
