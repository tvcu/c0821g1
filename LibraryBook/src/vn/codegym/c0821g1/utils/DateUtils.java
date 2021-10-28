package vn.codegym.c0821g1.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateUtils {
    private static final String DATE_PATTERN = "MM-dd-yyyy HH:mm:ss";

    public static String dateToString(Date date, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern == null ? DATE_PATTERN : pattern);
        return simpleDateFormat.format(date);
    }

    public static String dateToString(Date date) {
        return dateToString(date, null);
    }

    public static Date stringToDate(String dateString, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern == null ? DATE_PATTERN : pattern);
        try {
            return simpleDateFormat.parse(dateString);
        } catch (ParseException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public static Date stringToDate(String dateString) {
        return stringToDate(dateString, null);
    }
}
