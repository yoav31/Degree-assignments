package lab5;

public class MainSoccerTeam {
    public static void main(String[] args) {
        SoccerPlayer[] players = getPlayers();
        System.out.println("\nPlayers for draft BEFORE UPDATING statistics:\n" +
                "================================");
        printPlayers(players);
        randomPlayerActions(players, players.length, 30);
        sortByStatistics(players);
        buildTeam(players, players.length, 4, 3, 3);

    }

    /**
     * Create an array of SoccerPlayer and insert into that array data of players
     *
     * @return array of SoccerPlayer of length 20(you may change its length)
     */
    public static SoccerPlayer[] getPlayers() {
        SoccerPlayer[] players = new SoccerPlayer[19];

        players[0] = new Forward("Ronaldo", 36);
        players[1] = new Forward("Lewandowski", 34);
        players[2] = new Forward("Dembélé", 25);
        players[3] = new Forward("Fati", 20);
        players[4] = new Forward("Raphinha", 26);
        players[5] = new Midfield("Busquets", 34);
        players[6] = new Midfield("Gavi", 19);
        players[7] = new Midfield("Pedri", 20);
        players[8] = new Midfield("Modric", 35);
        players[9] = new Goalkeeper("Navas", 34);
        players[10] = new Goalkeeper("ter Stegen", 31);
        players[11] = new Defence("Araujo", 24);
        players[12] = new Defence("Christensen", 27);
        players[13] = new Defence("Alonso", 32);
        players[14] = new Defence("Ramos", 35);
        players[15] = new Defence("Kounde", 24);
        players[16] = new SoccerPlayer("Isco", 29);
        players[17] = new SoccerPlayer("Nymar", 31);
        players[18] = new SoccerPlayer("Messi", 36);
        return players;
    }

    public static void printPlayers(SoccerPlayer[] players) {
        for (int i = 0; i < players.length; i++) {
            if (players[i] != null)
                System.out.println(players[i].toString());
        }
        System.out.println();
    }

    public static void randomPlayerActions(SoccerPlayer[] players, int numPlayers, int numActions) {
        System.out.println("Players for draft AFTER updating statistics ::\n" +
                " =====================================");
        for (int i = 0; i < numActions; i++) {
            int num = (int) (Math.random() * (numPlayers - 1));
            players[num].addStatistics();
        }
        printPlayers(players);
    }

    public static void sortByStatistics(SoccerPlayer[] players) {
        for (int i = 0; i < players.length; i++) {
            for (int j = i + 1; j < players.length; j++) {
                if (players[i].getStatistics() < players[j].getStatistics()) {
                    SoccerPlayer temp = players[i];
                    players[i] = players[j];
                    players[j] = temp;
                }
            }
        }
        System.out.println("Players for draft AFTER SORT by statistics ::\n" +
                "=====================================");
        printPlayers(players);
    }

    public static void buildTeam(SoccerPlayer[] players, int numPlayers, int numD, int numM, int numF) {
        int i = 0, count = 0;
        SoccerPlayer[] NewTeam = new SoccerPlayer[numPlayers];
        for (SoccerPlayer index : players) {
            if (index.getClass() == Goalkeeper.class) {
                NewTeam[i] = index;
                i++;
                break;
            }
        }
        for (SoccerPlayer index : players) {
            if (count < numD) {
                if (index.getClass() == Defence.class) {
                    NewTeam[i] = index;
                    i++;
                    count++;
                }
            } else {
                break;
            }
        }
        count = 0;
        for (SoccerPlayer index : players) {
            if (count < numM) {
                if (index.getClass() == Midfield.class) {
                    NewTeam[i] = index;
                    i++;
                    count++;
                }
            } else {
                break;
            }
        }
        count = 0;
        for (SoccerPlayer index : players) {
            if (count < numF) {
                if (index.getClass() == Forward.class) {
                    NewTeam[i] = index;
                    i++;
                    count++;
                }
            } else {
                break;
            }
        }
        count = 0;
        for (SoccerPlayer index : players) {
            if (count < 2) {
                if (index.getClass() == SoccerPlayer.class) {
                    NewTeam[i] = index;
                    i++;
                    count++;
                }
            } else {
                break;
            }
        }
        System.out.println("Barcelona Team Players:\n" +
                "=====================================");
        printPlayers(NewTeam);

    }
}
