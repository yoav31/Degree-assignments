package library;
/**
 * Assignment:2
 * @author Maor Pinhas id:324170885
 *
 */
public class Encyclopedia extends publication{
    int volume;
    String editor;

    /**
     * creating a new encyclopedia object
     * @param title-presents the title of the encyclopedia
     * @param publisher-presents the publisher of the encyclopedia
     * @param qty-presents the amount of copies of the encyclopedia exist in the library
     * @param editor-presents the editor of the encyclopedia
     * @param volume- presents the number of the encyclopedia in the edition
     */
    public Encyclopedia(String title,String publisher, int qty , String editor, int volume) {
        super(title,publisher,qty);
        setEditor(editor);
        setVolume(volume);
    }

    /**
     *  the method checks and sets the given editor value to the constructor due to the value
     * @param editor-presents the encyclopedia editor that given to the constructor
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
     * the method checks and sets the given volume value to the constructor due to the value
     * @param volume-presents the number of the encyclopedia in the edition that given to the constructor
     *  */
    public void setVolume(int volume) {
        if(volume>0) {
            this.volume=volume;
        }
        else {
            this.volume=0;
        }
    }
    /**
     * override method that prints a limited Encyclopedia details
     */
    @Override
    public String miniString () {
        return this.Public+"-Ency"+"          "+
                "qty:"+this.qty+" "+this.title+" vol. "+this.volume;
    }

    /**
     * override method that prints the encyclopedia's details
     */
    @Override
    public String toString() {
        return super.Public+"-Ency"+"       "+
                super.title+" vol. "+this.volume+"\r\n"+
                "              published by "+super.publisher+" edited by "+this.editor;
    }
}
