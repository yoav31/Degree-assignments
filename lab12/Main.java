package lab12;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            Path path = Paths.get("./src/clothing.txt");
            clothing clothing = new clothing("shirt", 1, 100);
            clothing clothing1 = new clothing("shoes", 2, 150);
            clothing clothing2 = new clothing("heat", 3, 200);
            clothing clothing3 = new clothing("pens", 4, 250);
            clothing clothing4 = new clothing("pens", 4, 250);
            clothing.addToFile(path);
            clothing1.addToFile(path);
            clothing2.addToFile(path);
            clothing3.addToFile(path);
            ClothesShop clothesShop = new ClothesShop(path);

        }
        catch (Exception e){}
    }
}
