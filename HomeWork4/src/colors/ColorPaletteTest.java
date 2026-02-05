// Assignment: 4
// Author: Yoav Haviv Vaknin, ID: 208323261
package colors;

public class ColorPaletteTest {
    public static void main(String[] args) {

        /**
         * Creating the show
         */
        Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.WHITE, Color.BLACK};
        ColorPalette color = new ColorPalette(colors);

        /**
         * Printing RGB values of each color as required by the job
         */
        System.out.println(color.getColorByName("RED" ));
        System.out.println(color.getColorByName("GREEN" ));
        System.out.println(color.getColorByName("BLUE" ));
        System.out.println(color.getColorByName("WHITE" ));
        System.out.println(color.getColorByName("BLACK" ));
    }
}
