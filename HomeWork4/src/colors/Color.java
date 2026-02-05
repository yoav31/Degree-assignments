// Assignment: 4
// Author: Yoav Haviv Vaknin, ID: 208323261
package colors;


public enum Color {
    /**
     *enum constants
     */
    RED (255, 0, 0),
    GREEN (0, 255, 0),
    BLUE (0, 0, 255),
    WHITE (255, 255, 255),
    BLACK (0, 0, 0),
    ;

    /**
     * Declaration of the fields
     */
    private int R;
    private int G;
    private int B;

    /**
     *A constructor that receives the enum variables and matches it to the fields
     */
    Color(int R, int G, int B) {
        this.R=R;
        this.G=G;
        this.B=B;
    }

    /**
     *Print function according to the work requirement
     */
    @Override
    public String toString() {
        return "   R:" + this.R + " G:" +  this.G + " B:" + this.B;
    }
}
