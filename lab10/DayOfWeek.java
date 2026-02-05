package lab10;

/**
 * An enumeration representing the days of the week.
 */
public enum DayOfWeek {
    SUNDAY("Sun"), MONDAY("Mon"), TUESDAY("Tue"), WEDNESDAY("Wed"),
    THURSDAY("Thu"), FRIDAY("Fri"), SATURDAY("Sat"),SATURDAY2("Sat2");
    //TODO

    private final String day;

    DayOfWeek(String day) {
        this.day=day;
        //TODO
    }

    public String getDay() {
        //מחזיר את השם המלא
        switch (this.day) {
            case "Sun":
                return "Sunday";
            case "Mon":
                return "Monday";
            case "Tue":
                return "Tuesday";
            case "Wed":
                return "Wednesday";
            case "Thu":
                return "Thursday";
            case "Fri":
                return "Friday";
            case "Sat":
                return "Saturday";
            default :
                return " ";
        }
    }

    public String getAbbreviation(){
        //מחזיר את השם הקיצור
        return this.day;
    }
}

