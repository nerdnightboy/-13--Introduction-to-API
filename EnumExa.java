/*
 * Enum example
 */
enum DayOfWeek {
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}

public class EnumExa {
    public static void main(String[] args){
        DayOfWeek today = DayOfWeek.Tuesday;

        System.out.println(today);

        DayOfWeek tomorrow = DayOfWeek.Wednesday;
        System.out.println(tomorrow);
    }
}
