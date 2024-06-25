package i18n;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateFormatDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        Locale vi = new Locale("vi");
        Locale ja = new Locale("ja");
        Locale en = new Locale("en");


        String s1 = formatDateByLocale(today, vi);
        System.out.println("s1 = " + s1);
        String s2 = formatDateByLocale(today, ja);
        System.out.println("s2 = " + s2);
        String s3 = formatDateByLocale(today, en);
        System.out.println("s3 = " + s3);

        String s4 = formatDateByPattern(today, "yyyy-MM-dd");
        System.out.println("s4 = " + s4);
    }

    public static String formatDateByLocale(LocalDate date, Locale locale){
        DateTimeFormatter formatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(locale);
        return formatter.format(date);
    }

    public static String formatDateByPattern(LocalDate date, String pattern){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return  formatter.format(date);
    }
}
