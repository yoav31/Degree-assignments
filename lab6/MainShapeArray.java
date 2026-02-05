package lab6;

public class MainShapeArray {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[20];
        getShapes(shapes);
        printArray(shapes);
        printBiggest(shapes);
    }

    public static void getShapes(Shape[] shapes) {
        System.out.println("Array of shapes:");
        System.out.println("*******************");
        for (int i = 0; i < 20; i++) {
            int randomInt = randomInteger(0, 2);
            double randomD1 = randomDouble(0, 10);
            double randomD2 = randomDouble(0, 10);
            switch (randomInt) {
                case 0:
                    shapes[i] = new Circle(randomD1 / 2);
                    break;
                case 1:
                    shapes[i] = new Rectangle(randomD1, randomD2) {
                        @Override
                        public double getSide() {
                            return 0;
                        }
                    };
                    break;
                case 2:
                    shapes[i] = new Square(randomD1);
            }
        }
    }

    public static int randomInteger(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static double randomDouble(int min, int max) {
        return Math.random() * (max - min);
    }

    public static void printArray(Shape[] shapes){
        for(Shape index : shapes){
            System.out.println(index);
        }
    }
    public static void printBiggest(Shape[] shapes){
        Shape temp=new Circle();
        Shape temp1= new Rectangle() {
            @Override
            public double getSide() {
                return 0;
            }
        };
        Shape temp2=new Square() {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimeter() {
                return 0;
            }
        };
        for(Shape index : shapes){
            if(index.getClass()==Circle.class){
                if(temp.getArea()<index.getArea())
                    temp=index;
            }
            if(index.getClass()==Rectangle.class){
                if(temp1.getArea()<index.getArea())
                    temp1=index;
            }
            if(index.getClass()==Square.class){
                if(temp.getArea()<index.getArea())
                    temp=index;
            }
            if(index.getClass()==Square.class){
                if(temp2.getArea()<index.getArea())
                    temp2=index;
            }
        }
        System.out.println("\nLargest Circle: ");
        System.out.println(temp.toString());
        System.out.println(temp1.toString());
        System.out.println(temp2.toString());
    }


}
