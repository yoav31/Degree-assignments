
package library;

import java.util.Objects;

public class Book extends Publication{
    /**
     * Declaration of the variables.
     */
    Author author;
    private String editor;
    private int year;

    /**
     A constructor that accepts the properties of the book and
     * adapts them to the variables of the class.
     */
    public Book(String title, String publisher, int qty ,Author author, String editor, int year){
        super(title,publisher,qty);
        setAuthor(author);
        setEditor(editor);
        setYear(year);


    }

    /**
     * A function that updates the value of the variable
     * as a result of receiving new values from the constructor
     */
    public void setEditor(String editor) {
        this.editor = editor;
    }

    /**
     * A function that updates the value of the variable
     * as a result of receiving new values from the constructor
     */
    public void setAuthor(Author author) {
        this.author = author;
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
    public Author getAuthor() {
        return author;
    }

    /**
     *A function that returns the current value of the variable
     */
    public String getEditor() {
        return editor;
    }

    /**
     *A function that returns the current value of the variable
     */
    public int getYear() {
        return year;
    }

    /**
     * A function that prints the object as specified in the instructions
     */
    @Override
    public String toString(){
        return this.number+"-Book     "+"'"+this.getTitle()+"'"+" "+getAuthor()+
                "\npublished by "+super.getPublisher()+". edited by "+getEditor()+" "+"("+getYear()+")";
    }

    /**
     * A function that prints the name of the object, quantity and the name of the book
     */
    public String qty_information(){
        return this.number+"-Book     "+"qty:"+this.getQty()+" "+this.getTitle();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && (this.author==book.author) && Objects.equals(editor, book.editor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, editor, year);
    }
}

