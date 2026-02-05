package leb2EX1;

public class rectangle1 {

        private double height;
        private double width;

        public rectangle1(double h, double w ){
            setheight(h);
            setWidth(w);
        }

        public double getHeight() {

            return this.height;
        }

        public void setheight(double height) {
            this.height = height;

        }
        public double getWidth() {

            return width;
        }

        public void setWidth(double width) {

            this.width = width;
        }

        public double area(){

            return this.height *this.width;
        }
        public double diagonal(){
            return Math.sqrt(Math.pow(this.height,2)+Math.pow(this.width,2));
        }

        @Override
        public String toString() {
            return "lebs2EX1.rectangle1{" +
                    "high=" + height +
                    ", width=" + width +
                    '}';
        }
    }

