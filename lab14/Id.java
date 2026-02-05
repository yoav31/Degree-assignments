package lab14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public record Id(String name, String id)  {

    public Id(String name, String id) {
        this.name = name;
        if (Integer.parseInt(id) < 1000 || Integer.parseInt(id) > 9999)
            throw new RuntimeException("ERROR");
        this.id = id;
    }


    public static List readIdDataFromFile(String fileName) throws IOException {
        List<Id> ex1List = new ArrayList<>();
        Path path = Paths.get(fileName);
        List<String> list = Files.readAllLines(path);
        Scanner scanner = new Scanner(path);

        for (String line : list) {
            String[] str = line.split(" ");
            try {
                ex1List.add(new Id(str[1], str[0]));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        scanner.close();
        for (int i = 0; i < ex1List.size(); i++)
            System.out.println(ex1List.get(i));
        return ex1List;
    }

    }
