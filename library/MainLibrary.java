package library;

import java.util.Scanner;
/**
 * Assignment:2
 * @author Maor Pinhas id:324170885
 *
 */
public class MainLibrary {
    /**
     * creating a simulation to library website:
     * there is a list of students and list of different publications that students can loaned from the library
     * while entering to the website every student first need to enter his student's number and the publication's number that he would like to loan
     * if the student didn't loaned already over 3 publications and there is still available copies of the publication the loan will be completed
     * else the loan will fail and corresponding massage will be printed
     * to end the process and to see the Report on library status the student will enter -1 instead his student number
     * @param args/
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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
        publications[1]=new Article("Teva Hadvarim","Hahevra le-Heker Haadam ve-Hasovev ltd",0,297,2020,
                "Yanshuf Aezim", authors[5],
                "http://www.tevahadvarim.co.il/wp-content/uploads/2020/11/297_farticle_pdf_9.pdf");
        publications[2]=new journal("Scientific American", "Springer Nature", 5, 135, 2021);
        publications[3]=new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "",1);
        publications[4]=new Article("Masa Hakesem Hamadaii","Weizmann IOS",0,102,2021,
                "Alufot Eropa le-Mathematica", authors[4],
                "https://heb.wis-wander.weizmann.ac.il/computer-science-math/n-11335");
        publications[5]=new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "",3);
        publications[6]=new Book("The Great Gatsby", "Charles Scribner's Sons",
                1, authors[1],"Maxwell Perkins", 1925);
        publications[7]=new journal("Teva Hadvarim","Hahevra le-Heker Haadam ve-Hasovev ltd",5,297,2020);
        publications[8]=new Encyclopedia("Encyclopedia Americana", "Scholastic Corporation", 1, "", 30);
        publications[9]=new Book("Sippur Al Ahava VeChoshech", "Houghton Mifflin Harcourt",
                1, authors[2],"", 2002);
        publications[10]=new Article("Masa Hakesem Hamadaii","Weizmann IOS",0,106,2022,
                "AI (artificial intelligence) is upgrading", authors[3],
                "https://heb.wis-wander.weizmann.ac.il/science-teaching/n-11735");
        publications[11]=new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "",2);
        publications[12]=new journal("Nature","Springer Nature",
                5,  590,2021 );

        Student[] students = new Student[100];
        students[0]=new Student("Albert Einstein");
        students[1]= new Student("Marie Curie");
        students[2]= new Student("Rosalind Franklin");
        students[3]= new Student("Stephen Hawking");

        boolean canLoan=true;
        while(canLoan=true) {
            System.out.println("welcome to the library, Start loan");
            System.out.println("insert student number [0,3]");
            int n= in.nextInt();
            if(n==-1) {
                canLoan=false;
                System.out.println("Report on library status:");
                System.out.println("==============================");
                for(int i=0; i<publication.publicationCounter-10;i++) {
                    MainPublication2.sort(publications);
                    System.out.println(publications[i].miniString());
                }
                break;
            }
            System.out.println("insert publication number [10,22]");
            int n1=in.nextInt();
            if(publications[n1-10].qty>0 && students[n].loanedNum<3) {
                students[n].arr[students[n].loanedNum]=publications[n1-10];
                students[n].loanedNum++;
                publications[n1-10].qty--;
                System.out.println("Loan Report:");
                System.out.println(students[n].toString());
                System.out.println("Successful loan of: \r\n"+publications[n1-10].miniString());

            }
            else if(publications[n1-10].qty==0) {
                System.out.println("Load report: Loan failed - out of stock  "+publications[n1-10].miniString());
            }
            else {
                System.out.println("Load report: Loan failed - student has already loaned 3 publications");
                System.out.println(students[n].toString());
            }
            System.out.println();
        }
    }
}