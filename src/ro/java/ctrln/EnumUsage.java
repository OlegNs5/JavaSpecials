package ro.java.ctrln;

public class EnumUsage {
    public static void main(String[] args) {
        WeekDay weekDay = WeekDay.SUNDAY;
        switch(weekDay){
            case MONDAY:
                System.out.println("Este Luni");
                break;
            case TUESDAY:
                System.out.println("Este Marti");
                break;
            case WEDNESDAY:
                System.out.println("Este Miercuri");
                break;
            case THURSDAY:
                System.out.println("Este Joi");
                break;
            case FRIDAY:
                System.out.println("Este Vineri");
                break;
            case SATURDAY:
                System.out.println("Este Simbata");
                break;
            case SUNDAY:
                System.out.println("Este Duminica");
                break;
        }
    }
}
