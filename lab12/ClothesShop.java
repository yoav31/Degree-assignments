package lab12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ClothesShop {
    private String nameShope;
    private clothing[] clothing;

    public ClothesShop(String nameShope, lab12.clothing[] clothing) {
        this.nameShope = nameShope;
        this.clothing = clothing;
    }

    public ClothesShop(Path path) throws IOException {
        try {
            ArrayList<ClothesShop> clothingShopeList = new ArrayList<>();
            ArrayList<String> lines = new ArrayList<>(Files.readAllLines(path));
            Scanner myReader = new Scanner(path);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] str = data.split(" ");
                try {
                String nameShope$ = str[0];
                clothing = new clothing[]{new clothing(str[2], Integer.parseInt(str[3]), Integer.parseInt(str[4]))};

                    clothingShopeList.add(new ClothesShop(nameShope$, clothing));
                } catch (Exception e) {
                    throw e;
                }
            }
            myReader.close();
        }catch(Exception e){
                throw e;
            }
    }

    @Override
    public String toString() {
        return "ClothesShop{" +
                "nameShope='" + nameShope + '\'' +
                ", clothing=" + Arrays.toString(clothing) +
                '}';
    }

    public void saveInFile(Path path) throws Exception {
        Files.writeString(path, this.toString(), StandardOpenOption.APPEND);
    }
}

