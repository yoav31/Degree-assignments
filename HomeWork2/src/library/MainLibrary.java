
package library;

import java.util.Scanner;

public class MainLibrary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student[] students = new Student[100];
        students[0] = new Student("Albert Einstein");
        students[1] = new Student("Marie Curie");
        students[2] = new Student("Rosalind Franklin");
        students[3] = new Student("Stephen Hawking");

        Publication[] publications = new Publication[100];
        Author[] authors = new Author[100];
        authors[0] = new Author("Harper Lee", "harper@somwhere.com");
        authors[1] = new Author("F. Scott Fitzgerald", "scott@somwhere.com");
        authors[2] = new Author("Amos Oz", "oz@somwhere.com");
        authors[3] = new Author("Giora Alexandron", "giora@somwhere.com");
        authors[4] = new Author("Avraham Aizenbud", "avi@somwhere.com");
        authors[5] = new Author("Ezra Hadad", "ezra@somwhere.com");
        publications[0] = new Book("To Kill a Mockingbird", "J. B. Lippincott & Co.", 2, authors[0], "Tay Hohoff", 1960);
        publications[1] = new Article("Teva Hadvarim", "Hahevra le-Heker Haadam ve-Hasovev ltd", 0, 297, 2020, "Yanshuf Aezim", authors[5], "http://www.tevahadvarim.co.il/wp-content/uploads/2020/11/297_farticle_pdf_9.pdf");
        publications[2] = new Journal("Scientific American", "Springer Nature", 5, 135, 2021);
        publications[3] = new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "unknown", 1);
        publications[4] = new Article("Masa Hakesem Hamadaii", "Weizmann IOS", 0, 102, 2021, "Alufot Eropa le-Mathematica", authors[4], "https://heb.wis-wander.weizmann.ac.il/computer-science-math/n-11335");
        publications[5] = new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc", 1, "unknown", 3);
        publications[6] = new Book("The Great Gatsby", "Charles Scribner's Sons", 1, authors[1], "Maxwell Perkins", 1925);
        publications[7] = new Journal("Teva Hadvarim", "Hahevra le-Heker Haadam ve-Hasovev ltd", 5, 297, 2020);
        publications[8] = new Encyclopedia("Encyclopedia Americana", "Scholastic Corporation", 1, "", 30);
        publications[9] = new Book("Sippur Al Ahava VeChoshech", "Houghton Mifflin Harcourt", 1, authors[2], "unknown", 2002);
        publications[10] = new Article("Masa Hakesem Hamadaii", "Weizmann IOS", 0, 106, 2022, "AI (artificial intelligence) is upgrading", authors[3], "https://heb.wis-wander.weizmann.ac.il/science-teaching/n-11735");
        publications[11] = new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc", 1, "unknown", 2);
        publications[12] = new Journal("Nature", "Springer Nature", 5, 590, 2021);


        /**
         * A function that sorts the array of publications
         * within a new array according to the order specified in the question
         */
        Publication[] publications1=new Publication[100];
        int j=0;

        for (int i = 0; i < publications.length; i++) {
            if (publications[i] == null)
                break;
            if (publications[i] instanceof Book) {
                publications1[j] = publications[i];
                j++;
            }
        }
        for (int i = 0; i < publications.length; i++) {
            if (publications[i] == null)
                break;
            if (publications[i].getClass()== Journal.class){
                publications1[j] = publications[i];
                j++;
            }

        }
        for (int i = 0; i < publications.length; i++) {
            if (publications[i] == null)
                break;
            if (publications[i].getClass()== Article.class){
                publications1[j] = publications[i];
                j++;
            }
        }
        for (int i = 0; i < publications.length; i++) {
            if (publications[i] == null)
                break;
            if (publications[i] instanceof Encyclopedia){
                publications1[j] = publications[i];
                j++;
            }
        }

        int i=0;
        /**
         * array of the number of student book loans
         */
        int []count={0,0,0,0};

        while (true) {
            System.out.println();
            System.out.println("Welcom to the library. Start loan:\n" +
                    "Insert student number [0,3]:");
            int student_number = input.nextInt();
            if(student_number<0)
                break;

            System.out.println("Insert publication number [10,22]:");
            int publication_number = input.nextInt();
            int index=publication_number-10;

            /**
             * Lower the number of numbers after borrowing by 1
             */
            publications1[index].setQty(publications1[index].getQty()-1);

            /**
             * Checking if there is available from the quantity
             */
            if(publications1[index].getQty()==-1) {
                System.out.println("Loan failed - out of stock");
                continue;
            }
            /**
             * Count the number of student loans
             */
            count[student_number]++;
            if(count[student_number]>3){
                System.out.println("Load report: Loan failed - student has already loaned 3 publications");

            }

            /**
             *Updating the number of student book loans
             */
            students[student_number].setLoanedNum(count[student_number]);

            System.out.println("Loan Report:");
            System.out.println(students[student_number]);
            System.out.println("List of loaned publications:");
            for (int post=0; post<=i; post++ ){
                System.out.println(publications1[post]);
            }

            System.out.println("Successful loan of:");
            if(publications1[i] instanceof Book){
                Book b= (Book) publications1[i];
                System.out.println(b.qty_information());
            }
            if(publications1[i].getClass() == Journal.class){
                Journal J=(Journal) publications1[i];
                System.out.println(J.qty_information());
            }
            if(publications1[i].getClass() == Article.class){
                Article a=(Article) publications1[i];
                System.out.println(a.qty_information());
            }
            if(publications1[i] instanceof Encyclopedia){
                Encyclopedia e=(Encyclopedia) publications1[i];
                System.out.println(e.qty_information());
            }

            i++;
        }
        System.out.println("\nReport on library status:\n" +
                "============================");
        for(int k=0; k< publications1.length; k++) {
            if (publications1[k] == null)
                break;
            if(publications1[k] instanceof Book){
                Book b= (Book) publications1[k];
                System.out.println(b.qty_information());
            }
            if(publications1[k].getClass() == Journal.class){
                    Journal J=(Journal) publications1[k];
                System.out.println(J.qty_information());
            }
            if(publications1[k].getClass() == Article.class){
                Article a=(Article) publications1[k];
                System.out.println(a.qty_information());
            }
            if(publications1[k] instanceof Encyclopedia){
                Encyclopedia e=(Encyclopedia) publications1[k];
                System.out.println(e.qty_information());
            }
        }
    }
}


