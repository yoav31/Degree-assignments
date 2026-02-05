// Assignment: 1
// Author: Yoav Haviv Vaknin, ID: 208323261
package ex1pizza;

public class PizzaOrder {
    /**
     * Declaration of the variables.
     */
    private String name;
    private String lastname;
    private static int MAXPIZZA=3;
    private Pizza[] pz ;
    private int pzIndex;

    /**
     * A builder who receives the first and last name of a customer
     */
    public PizzaOrder (String name, String lastname){
        setName(name);
        setLastname(lastname);
        this.pz = new Pizza[MAXPIZZA];
        this.pzIndex=0;
    }
    /**
     * A constructor that accepts the properties of the pizza and
     * adapts them to the variables of the class.And checks whether the
     * quantity of pizzas to order is greater than 3.
     * If less than 3 we will add the pizzas to the array of pizzas.
     */
    public void addPizza(int size, boolean OliveTopping, boolean CheeseTopping, boolean OnionTopping){
        if(this.pzIndex<3) {
            this.pz[pzIndex] =new Pizza(size,OliveTopping, CheeseTopping,OnionTopping);
            this.pzIndex++;
        }
        else
            System.out.println("you can't buy more then 3 pizzas");
    }

    /**
     * A function prints a bill for the customer.
     */
    public void tab(){
        System.out.println(this.name+" "+this.lastname);
        for(int i=0; i<MAXPIZZA; i++) {
            if (this.pz[i] != null) {
                System.out.println(this.pz[i].toString()+":"+" Pizza costs "+this.pz[i].calcCost());
            }
        }
             System.out.println("================================");
        System.out.println("total sum- "+this.calcTotal());

    }

    /**
     * Calculation of the amount of the order
     */
    public int calcTotal(){
        int sum=0;
        for(int i=0; i<MAXPIZZA; i++) {
            if (this.pz[i] != null) {
                sum += this.pz[i].calcCost();
            }
        }
        return sum;

    }
    /**
     *A Boolean function that checks whether the objects are equal.
     * First of all, it checks whether this object is itself,
     * then it checks whether the object is of the pizza type,
     * and if so, then it checks whether its variables are equal
     */
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof PizzaOrder))
            return false;
        PizzaOrder another=(PizzaOrder) o;
        if(this.name != another.name)
            return false;
        if(this.lastname != another.lastname)
            return false;
        return true;
    }
    /**
     *A function that returns the current value of the variable
     */
    public String getName() {
        return name;
    }
    /**
     * A function that updates the value of the variable
     * as a result of receiving new values from the constructor
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *A function that returns the current value of the variable
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * A function that updates the value of the variable
     * as a result of receiving new values from the constructor
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}
