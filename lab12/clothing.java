package lab12;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class clothing {
    private String item;
    private int mkt;
    private int price;

    public clothing(String item, int mkt, int price) {
        this.item = item;
        this.mkt = mkt;
        this.price = price;
    }

    public clothing(Path path) throws Exception {
        ArrayList<clothing> clothingArrayList = new ArrayList<>();
        List<String> lines = Files.readAllLines(path);
        Scanner myReader = new Scanner(path);
        while (myReader.hasNextLine()) {
            try {
                String data = myReader.nextLine();
                String[] str = data.split(" ");
                String item$ = str[0];
                int mkt$ = Integer.parseInt(str[1]);
                int price$ = Integer.parseInt(str[2]);
                clothingArrayList.add(new clothing(item$, mkt$, price$));
            } catch (Exception e) {
                throw e;
            }
        }
    }

    @Override
    public String toString() {
        return "clothing{" +
                "item='" + item + '\'' +
                ", mkt=" + mkt +
                ", price=" + price +
                '}';
    }

    public void addToFile(Path path) throws Exception {
        Files.writeString(path, this.toString(), StandardOpenOption.APPEND);
    }
}