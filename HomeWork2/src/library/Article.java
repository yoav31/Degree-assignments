// Assignment: 2
// Author: Yoav Haviv Vaknin, ID: 208323261
package library;

import java.util.Objects;

public class Article extends Journal {
    /**
     * Declaration of the variables.
     */
    private String title2;
    Author author;
    private String URL;

    /**
     A constructor that accepts the properties of the article and
     * adapts them to the variables of the class.
     */
    public Article(String title, String publisher, int qty, int issueNumber, int year, String title2, Author author, String URL) {
        super(title, publisher, qty, issueNumber, year);
        setTitle2(title2);
        setAuthors(author);
        setURL(URL);

    }

    /**
     *A function that returns the current value of the variable
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * A function that updates the value of the variable
     * as a result of receiving new values from the constructor
     */
    public void setAuthors(Author author) {
        this.author = author;
    }

    /**
     *A function that returns the current value of the variable
     */
    public String getURL() {
        return URL;
    }

    /**
     * A function that updates the value of the variable
     * as a result of receiving new values from the constructor
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     *A function that returns the current value of the variable
     */
    public String getTitle2() {
        return title2;
    }

    /**
     * A function that updates the value of the variable
     * as a result of receiving new values from the constructor
     */
    public void setTitle2(String title2) {
        this.title2 = title2;
    }

    /**
     * A function that prints the object as specified in the instructions
     */
    @Override
    public String toString(){
        return number+"-Arcl     "+title2+", by "+author+"\n"+
                getTitle()+"("+getIssueNumber()+")\n"+
                "published by "+getPublisher()+"("+getYear()+")";
    }

    /**
     * A function that prints the name of the object, quantity and the name of the article
     */
    @Override
    public String qty_information(){
        return this.number+"-Artl     "+"qty:"+this.getQty()+" "+this.getTitle();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(title2, article.title2) && Objects.equals(author, article.author) && Objects.equals(URL, article.URL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title2, author, URL);
    }
}
