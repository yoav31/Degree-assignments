package test1;

public class exc2A {
    public static void main(String[] args) {
        int max = 15, min = 10;
        System.out.println(randomInteger(max, min));
    }

    public static int randomInteger(int max, int min) {
        double temp = Math.random();
        int num = max - min;
        return (int) Math.floor(min+(num*temp));

}
}
