// Assignment: 2
// Author: Yoav Haviv Vaknin, ID: 208323261
package library;

import java.util.Objects;

public class Encyclopedia extends Publication{
    /**
     * Declaration of the variables.
     */
    private int volume;
    private String editor;

    /**
     A constructor that accepts the properties of the encyclopedia and
     * adapts them to the variables of the class.
     */
    public Encyclopedia(String title,String publisher, int qty , String editor, int volume){
        super(title,publisher,qty);
        setEditor(editor);
        setVolume(volume);

    }

    public Encyclopedia(Encyclopedia other) {
        super(other.getTitle(),other.getPublisher(),other.getQty());
        this.editor=other.getEditor();
        this.volume=other.getVolume();

    }

    public Encyclopedia(String title, String publisher, int qty) {
        super(title, publisher, qty);
    }

    /**
     *A function that returns the current value of the variable
     */
    public int getVolume() {
        return volume;
    }

    /**
     * A function that updates the value of the variable
     * as a result of receiving new values from the constructor
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     *A function that returns the current value of the variable
     */
    public String getEditor() {
        return editor;
    }

    /**
     * A function that updates the value of the variable
     * as a result of receiving new values from the constructor
     */
    public void setEditor(String editor) {
        this.editor = editor;
    }

    /**
     * A function that prints the object as specified in the instructions
     */
    @Override
    public String toString(){
        return this.number+"-Ency      "+getTitle()+" vol. "+getVolume()+"\n"
          +"published by "+super.getPublisher()+". edited by "+getEditor();
    }

    /**
     * A function that prints the name of the object, quantity and the name of the encyclopedia
     */
    public String qty_information(){
        return this.number+"-Ency     "+"qty:"+this.getQty()+" "+this.getTitle();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Encyclopedia that = (Encyclopedia) o;
        return volume == that.volume && Objects.equals(this.editor, that.editor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume, editor);
    }
}
