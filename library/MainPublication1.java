package library;

/**
 * Assignment:2
 * @author Maor Pinhas id:324170885
 *
 */
public class MainPublication1 {
    /**
     * creating a list of authors and different types of publications and printing their details
     * @param args/
     */
    public static void main(String[] args) {

        publication[] publications = new publication[100];
        Author[] authors = new Author[100];
        authors[0] = new Author("Harper Lee","harper@somwhere.com");
        authors[1] = new Author("F. Scott Fitzgerald","scott@somwhere.com");
        authors[2] = new Author("Amos Oz","oz@somwhere.com");
        authors[3] = new Author("Giora Alexandron","giora@somwhere.com");
        authors[4] = new Author("Avraham Aizenbud","avi@somwhere.com");
        authors[5] = new Author("Ezra Hadad","ezra@somwhere.com");

        publications[0]= new Book("To Kill a Mockingbird", "J. B. Lippincott & Co.",
                2, authors[0],"Tay Hohoff", 1960);
        publications[1]=new journal("Scientific American", "Springer Nature", 5, 135, 2021);
        publications[2]=new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "",1);
        publications[3]=new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "",3);
        publications[4]=new Book("The Great Gatsby", "Charles Scribner's Sons",
                1, authors[1],"Maxwell Perkins", 1925);
        publications[5]=new journal("Teva Hadvarim","Hahevra le-Heker Haadam ve-Hasovev ltd",5,297,2020);
        publications[6]=new Encyclopedia("Encyclopedia Americana", "Scholastic Corporation", 1, "", 30);
        publications[7]=new Book("Sippur Al Ahava VeChoshech", "Houghton Mifflin Harcourt",
                1, authors[2],"", 2002);
        publications[8]=new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "",2);
        publications[9]=new journal("Nature","Springer Nature",
                5,  590,2021 );

        System.out.println("List of publication in the order they were entered :");
        System.out.println("==================================================");
        for(int i=0; i<publication.publicationCounter-10;i++) {
            System.out.println(	publications[i].toString());
        }




    }
}

