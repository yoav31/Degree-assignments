package lab14;

import java.io.IOException;

public class MainEX1 {
    public static void main(String[] args) throws IOException {
        Id ex1=new Id("gtrg","1111");
        ex1.readIdDataFromFile("./src/file.txt");
    }
}
