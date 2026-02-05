
package library;

public class Author {
    /**
     * Declaration of the variables.
     */
    private String name;
    private String email;

    /**
     A constructor that accepts the properties of the Author and
     * adapts them to the variables of the class.
     */
    public Author(String name, String email){
        setName(name);
        setEmail(email);
    }

    /**
     * A function that updates the value of the variable
     * as a result of receiving new values from the constructor
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A function that updates the value of the variable
     * as a result of receiving new values from the constructor
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * A function that prints the object as specified in the instructions
     */
    @Override
    public String toString(){
        return "by "+name+" at "+email;
    }
}

