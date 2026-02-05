package lab8;


    public class MyNode {
        protected int data;
        protected MyNode next;

        /**
         * Constructors for objects of class MyNode
         */

        public MyNode(int data, MyNode next){
            this.data = data;
            this.next = next;
        }
        MyNode(int data){
            this.data = data;
            this.next = next;
        }
        /**   * get's/set’s     */
        int getData(){
            return data;  		}

        void setData(int data){
            this.data = data; 	}

        MyNode getNext(){
            return next;      	}

        void setNext(MyNode next){
            this.next = next; 	}

        @Override
        public String toString(){
            return "data = "+data;
        }

    }


