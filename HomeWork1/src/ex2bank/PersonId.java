// Assignment: 2
// Author: Yoav Haviv Vaknin, ID: 208323261
package ex2bank;

public class PersonId {
    /**
     * Declaration of the variables.
     */
    private long ID;
    private String name;
    private String lastname;
    private String address;

    /**
     * A constructor that takes attributes of the account holder and matches them to the fields
     */
    public PersonId(long  ID, String name, String lastname, String address){
        setID(ID);
        setName(name);
        setLastname(lastname);
        setAddress(address);
    }
    /**
     *A function that returns the current value of the variable
     */
    public long getID() {
        return ID;
    }
    /**
     * A function that updates the value of the variable
     * as a result of receiving new values from the constructor
     */
    public void setID(long ID) {
        this.ID = ID;
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
    /**
     *A function that returns the current value of the variable
     */
    public String getAddress() {
        return address;
    }
    /**
     * A function that updates the value of the variable
     * as a result of receiving new values from the constructor
     */
    public void setAddress(String address) {
        this.address = address;
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
        if(!(o instanceof PersonId))
            return false;
        PersonId another=(PersonId)o;
        return ID==another.getID();
    }

    /**
     * Printing the name and surname of the account holder
     */
    public String toString(){
        return "Person id:"+ID+", "+"name:"+name+", "+"address:"+address;
    }
}
