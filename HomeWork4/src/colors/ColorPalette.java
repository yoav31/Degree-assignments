// Assignment: 4
// Author: Yoav Haviv Vaknin, ID: 208323261
package colors;

public class ColorPalette {
    /**
     * Declaration of the field
     */
    private Color[] colors;

    /**
     *A constructor that receives the variables from the show and matches it to the field
     */
    public ColorPalette( Color[] colors){
        this.colors=colors;

    }

    /**
     *A function takes a word and matches it to one of the enum constants
     */
    public Color getColorByName(String C){
        for (Color c : colors) {
            if (c.name().equals(C)) {
                return c;
            }
        }
        return null;
    }

}
