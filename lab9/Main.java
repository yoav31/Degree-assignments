package lab9;

public class Main {
    public static void main(String[] args){
        Pair<String, Object> pair=new Pair<>("Yoav", null);
        System.out.println(pair);
        Pair<Integer, String> pair1=new Pair<>(26,"b");
        System.out.println(pair1);
        System.out.println(pair.swap());
        System.out.println(pair.equals(pair1));
        System.out.println(pair.combine("temp"));
        System.out.println(pair.hasNullElement());

    }
}
