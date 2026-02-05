package library;

/**
 * Assignment:2
 * @author Maor Pinhas id:324170885
 *
 */
public class Book extends publication {
    Author author;
    String editor;
    int year;

    /**
     * creating a new book object
     * @param title-presents the title of the book
     * @param publisher-presents the publisher of the book
     * @param qty- presents the  amount of copies of the book in the library
     * @param author- presents the author of the book
     * @param editor- presents the editor of the book
     * @param year-presents the year when the book written
     */
    public Book(String title, String publisher, int qty, Author author, String editor, int year) {
        super(title,publisher,qty);
        this.author=author;
        setEditor(editor);
        setYear(year);
    }

    /**
     * the method checks and sets the given editor value to the constructor due to the value
     * @param editor- presents the book editor that given to the constructor
     */
    public void setEditor(String editor) {
        if(editor.length()>0) {
            this.editor=editor;
        }
        else {
            this.editor="unknown";
        }
    }

    /**
     * the method checks and sets the given year value to the constructor due to the value
     * @param year- presents the year when the book was written that given to the constructor
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
     *override method that prints a limited Book details
     */
    @Override
    public String miniString () {
        return this.Public+"-Book"+"          "+
                "qty:"+this.qty+" "+this.title;
    }

    /**
     * override method that prints the book's details
     */
    @Override
    public String toString() {
        return super.Public+"-Book"+"       "+
                super.title+" by "+this.author.toString()+
                "\r\n"+"              published by "+super.publisher+" edited by "+this.editor
                +"("+this.year+")";
    }

}
