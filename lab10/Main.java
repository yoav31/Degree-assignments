package lab10;

/**
 * This program demonstrates the use of enums and records.
 * It defines a simple enumeration for the days of the week
 * and a record to represent a person with name and age.
 * It also includes additional classes and functionality.
 */
public class Main {

    /**
     * The main method demonstrates the usage of enums and records.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        // Using the DayOfWeek enum
        DayOfWeek today = DayOfWeek.TUESDAY;
        System.out.println("Today is " + today);
        System.out.println("Abbreviation: " + today.getAbbreviation());

        // Using the Person record
        Person person = new Person("John", 25,"abc@gmail.com");
        System.out.println(person);

        // Creating a weekly schedule
        DayOfWeek[] days = {DayOfWeek.SUNDAY,DayOfWeek.MONDAY,DayOfWeek.THURSDAY, DayOfWeek.WEDNESDAY,DayOfWeek.THURSDAY,
                DayOfWeek.FRIDAY,DayOfWeek.SATURDAY,DayOfWeek.SATURDAY2};
        Schedule schedule = new Schedule(days);
        schedule.printSchedule();

        DayOfWeek day = days[0];
        weekendUSA(day);
        DayOfWeek day1 = days[0];
        weekendISRAEL(day1);
    }

    public static void weekendUSA(DayOfWeek day) {
        switch (day) {
            case MONDAY,TUESDAY ,WEDNESDAY,THURSDAY,FRIDAY:
                System.out.println(" is week day");
                break;
            case SUNDAY,SATURDAY,SATURDAY2:
                System.out.println(" is weekend");
                break;
        }
    }
    public static void weekendISRAEL(DayOfWeek day){
        if(day==DayOfWeek.SATURDAY || day==DayOfWeek.FRIDAY ||day==DayOfWeek.SATURDAY2)
            System.out.println("is weekend");
        else {
            System.out.println("is week day");
        }
    }
}

