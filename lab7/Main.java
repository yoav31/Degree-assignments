package lab7;

public class Main {
    public static void main(String[] args) {
        Moveable[] moveables = new Moveable[3];

        moveables[0] = new Ball(0, 0, 10);
        moveables[1] = new Car();
        moveables[2] = new Player("John");
        System.out.println("\n################CREATE################");
        PrintObjects(moveables);
        System.out.println("\n################START################");
        StratingObjects(moveables);
        PrintObjects(moveables);
        System.out.println("################END################");

    }

    public static void PrintObjects(Moveable[] moveables) {
        for (Moveable o : moveables) {
            System.out.println(o);
        }
    }

    public static void StratingObjects(Moveable[] moveables) {
        int temp = (int) (Math.random() * 10);
        while (temp > 0) {
            for (int i = 0; i < moveables.length; i++) {
                moveables[i].moveLeft();
            }
            temp--;
        }
        temp = (int) (Math.random() * 10);
        while (temp > 0) {
            for (int i = 0; i < moveables.length; i++) {
                moveables[i].moveRight();
            }
            temp--;
        }
        temp = (int) (Math.random() * 10);
        while (temp > 0) {
            for (int i = 0; i < moveables.length; i++) {
                if (moveables[i].getClass() == Ball.class)
                    ((Ball) moveables[i]).moveRight();
            }
            temp--;
        }
        temp = (int) (Math.random() * 10);
        while (temp >= 0) {
            for (int i = 0; i < moveables.length; i++) {
                if (moveables[i].getClass() == Ball.class)
                    ((Ball) moveables[i]).moveUp();
            }
            temp--;
        }
    }
}
