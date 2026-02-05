package lab10;

/**
 * A class representing a weekly schedule.
 */
public class Schedule {
    private DayOfWeek[] days;

    public Schedule(DayOfWeek[] days) {
        this.days = days;
        }


    public void printSchedule() {
        //TODO
        for (DayOfWeek day : days){
            System.out.println(day);
        }
    }
}

