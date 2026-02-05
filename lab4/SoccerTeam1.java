package lab4;

public class SoccerTeam1 {
        public static void main(String[] args) {
            Forward f1 = new Forward("Ronaldo", 36);
            Defence d1 = new Defence("Araujo", 24);
            Midfield m1 = new Midfield("Modric", 35);
            Goalkeeper g1 = new Goalkeeper("Navas", 34);
            Reserve r1 = new Reserve("Isco", 29);
            System.out.println("Print all soccer players:");
            System.out.println("=========================");
            System.out.println(f1+"\n"+d1+"\n"+m1+"\n"+g1+"\n"+r1);
            System.out.println("Print play() foe all soccer players:");
            System.out.println("====================================");
            //
            // there is error in next lines because the methods are missing from classes
            //
            System.out.println(f1.play());
            System.out.println(d1.play());
            System.out.println(m1.play());
            System.out.println(g1.play());
            System.out.println(r1.play());
            //update game reaults
            f1.makeGoals();
            f1.makeGoals();
            d1.makeTackle();
            g1.makeSave();
            System.out.println("Print all soccer players AFTER updating game results:");
            System.out.println("=====================================================");
            System.out.println(f1+"\n"+d1+"\n"+m1+"\n"+g1+"\n"+r1);
        }


    }



