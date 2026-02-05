// Assignment: 1
// Author: Yoav Haviv Vaknin, ID: 208323261
package ex1pizza;

public class Pizza {
    /**
     * Declaration of the variables.
     */
    private int size;
    private boolean OliveTopping;
    private boolean CheeseTopping;
    private boolean OnionTopping;

    /**
     * A constructor that accepts the properties of the pizza and
     * adapts them to the variables of the class.
     */
    public Pizza(int size, boolean OliveTopping, boolean CheeseTopping, boolean OnionTopping) {
        setSize( size);
        setOliveTopping(OliveTopping);
        setCheeseTopping(CheeseTopping);
        setOnionTopping(OnionTopping);
    }

    /**
     * Copy constructor
     */
    public Pizza(Pizza another) {
        this.size=another.getSize();
        this.OliveTopping=another.getOliveTopping();
        this.CheeseTopping=another.getCheeseTopping();
        this.OnionTopping=another.getOnionTopping();
    }

    /**
     * A default constructor initializes the pizza variables
     */
    public Pizza(){
        this.size=0;
        this.OliveTopping = false;
        this.CheeseTopping = false;
        this.OnionTopping = false;

    }

    /**
     *A function that returns the current value of the variable
     */
    public int getSize(){
        return this.size;
    }

    /**
     * A function that updates the value of the variable
     * as a result of receiving new values from the constructor
     */
    public void setSize(int size){
        this.size=size;
    }

    /**
     * A function that returns the current value of the variable
     */
    public boolean getOliveTopping(){
        return this.OliveTopping;
    }

    /**
     * A function that updates the value of the variable
     * as a result of receiving new values from the constructor
     */
    public void setOliveTopping(boolean OliveTopping){
        this.OliveTopping=OliveTopping;
    }

    /**
     *A function that returns the current value of the variable
     */
    public boolean getCheeseTopping(){
        return this.CheeseTopping;
    }
    /**
     * A function that updates the value of the variable
     * as a result of receiving new values from the constructor
     */
    public void setCheeseTopping(boolean CheeseTopping){
        this.CheeseTopping=CheeseTopping;
    }

    /**
     * A function that returns the current value of the variable
     */
    public boolean getOnionTopping(){
        return OnionTopping;
    }
    /**
     * A function that updates the value of the variable
     * as a result of receiving new values from the constructor
     */
    public void setOnionTopping(boolean OnionTopping){
        this.OnionTopping=OnionTopping;
    }
    /**
     * A function that calculates the price of the pizza by weighting size and toppings
     */
    public int calcCost(){
        int price=0;
        if(this.size==0) {
            price = 35;
            if (this.OliveTopping)
                price += 6;
            if (this.CheeseTopping)
                price += 6;
            if (this.OnionTopping)
                price += 6;
        }
        if(this.size==1) {
            price = 45;
            if (this.OliveTopping)
                price += 7;
            if (this.CheeseTopping)
                price += 7;
            if (this.OnionTopping)
                price += 7;
        }
        if(this.size==2) {
            price = 60;
            if (this.OliveTopping)
                price += 9;
            if (this.CheeseTopping)
                price += 9;
            if (this.OnionTopping)
                price += 9;
        }
        return price;
    }

    /**
     *A Boolean function that checks whether the objects are equal.
     * First of all, it checks whether this object is itself,
     * then it checks whether the object is of the pizza type,
     * and if so, then it checks whether its variables are equal
     */
    public boolean equals(Object o){
        if(this==o)
            return true;
        if(!(o instanceof Pizza))
            return false;
        Pizza another=(Pizza) o;

        if(this.size != another.size)
            return false;

        if(this.OliveTopping != another.OliveTopping)
            return false;

        if(this.CheeseTopping != another.CheeseTopping)
            return false;
        if(this.OnionTopping != another.OnionTopping)
            return false;
        return true;


    }

    /**
     *A print function that describes which pizza was ordered and which toppings
     */
    @Override
    public String toString(){
        String strsize="", olive="", onion="", cheese="", str;
        switch (size){
            case 0:
                strsize="Small";
                break;
            case 1:
                strsize="Medium";
                break;
            case 2:
                strsize="Large";
                break;
        }
        if(OnionTopping || CheeseTopping || OliveTopping) {
            if (OnionTopping)
                onion = "OnionTopping";
            if (CheeseTopping)
                cheese = "CheeseTopping";
            if (OliveTopping)
                olive = "OliveTopping";
            return "Pizza size -"+strsize+" "+olive+" "+cheese+" "+onion;
        }
        else{
            str="(with no toppings)";
        }
        return "Pizza size-"+strsize+" "+str;
    }

}



