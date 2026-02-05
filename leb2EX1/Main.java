package leb2EX1;

public class Main {

        public static void main(String[] args){
            double[] width={2,3,4,5,6};
            double[] height={3,4,5,6,7};

            for (int i=0; i<5; i++) {
                rectangle1 ShowData = new rectangle1(height[i], width[i]);
                System.out.println(ShowData);
                System.out.println("area: "+ShowData.area());
                System.out.println("perimeter: "+ShowData.getHeight()*2+ShowData.getWidth()*2);
                System.out.println("diagoal: "+ShowData.diagonal());
            }
        }
}