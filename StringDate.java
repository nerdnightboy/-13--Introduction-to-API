/*
 * Write a program to convert date to a string in the format “MM/DD/YYYY”?
 */

import java.time.*;
import java.time.format.*;
public class StringDate {
    public static void main(String[] args){
        LocalDate lc = LocalDate.of(2002, 04, 12);
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("MM/dd/YYYY");
        String result = lc.format(formatDate);
        System.out.println("Date is : " + result);

    }
}
