// Assignment: 1
// Author: Yoav Haviv Vaknin, ID: 208323261
package ex1pizza;

public class PizzaOrderMain {
    public static void main(String[] args) {
/**
 * Creating objects and passing the attributes to the constructor
 */
        PizzaOrder order1= new PizzaOrder("Haim" ,"Cohen");
        PizzaOrder order2=new PizzaOrder("Eyal", "Shani");
/**
 * Creating objects of the pizzas
 */
        order1.addPizza(0,false,true,true);
        order1.addPizza(1,false,true,false);
        order2.addPizza(2, true, true, true);
        order2.addPizza(2, true, true, true);
        order2.addPizza(2, true, true, true);

        /**
         *Print an invoice on the orders
         */
        order1.tab();
        System.out.println();
        order2.tab();

        /**
         *Equality check between objects
         */
        if(order1.equals(order2))
            System.out.println("The orders are equal!!!");
        else
            System.out.println("The orders are NOT equal!!!");
    }
}
