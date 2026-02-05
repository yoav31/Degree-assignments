package library;

/**
 * Assignment:2
 * @author Maor Pinhas id:324170885
 *
 */
public class Author {
    String Name;
    String email;

    /**
     * creating an author object
     * @param Name-presents the name of the author
     * @param email-presents the email of the author
     */
    public Author(String Name, String email) {
        setName(Name);
        setEmail(email);
    }

    /**
     * the method checks and sets the given name value to the constructor due to the value
     * @param name-presents the author's name that given to the constructor
     */
    public void setName(String name) {
        if(name.length()>0) {
            this.Name=name;
        }
        else {
            this.Name="invalid Name";
        }
    }

    /**
     * the method checks and sets the given email value to the constructor due to the value
     * @param email- presents the author's email that given to the constructor
     */
    public void setEmail(String email) {
        if(email.length()>0) {
            this.email=email;
        }
        else {
            this.email="invalid email";
        }
    }

    /**
     * override method that prints the author's details
     */
    @Override
    public String toString() {
        return this.Name+" at "+this.email;
    }

    /**
     *override method that compares between two objects of authors
     */

    @Override
    public boolean equals(Object o) {
        if(this==o) {
            return true;
        }
        if (!(o instanceof Author)) {
            return false;
        }
        Author author = (Author) o;
        return author.email==this.email;


    }
}
