package vn.codegym.c0821g1.next.day.calculator;

public class NextDayCalculator {
    public boolean isLeapYear(int year) {
        boolean isDivision400 = year % 400 == 0;
        boolean isDivision100 = year % 100 == 0;
        boolean isDivision4 = year % 4 == 0;
        return (isDivision4 && !isDivision100) || isDivision400;
    }

    public int getDaysOfMonth(int month, int year) throws Exception {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                boolean isLeapYear = isLeapYear(year);
                if (isLeapYear) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                throw new Exception("Month invalid");
        }
    }

    public void nextDay(int day, int month, int year) throws Exception {
        int daysOfMonth = getDaysOfMonth(month, year);
        if (day < 1 && day > daysOfMonth)
            throw new Exception("Day invalid");

        if (day == daysOfMonth) {
            day = 1;
            if (month == 12) {
                month = 1;
                year += 1;
            } else {
                month += 1;
            }
        } else {
            day += 1;
        }

        System.out.printf("%d/%d/%d\n",day,month,year);
    }

    public static void main(String[] args) {
        NextDayCalculator nextDayCalculator=new NextDayCalculator();
        try {
            nextDayCalculator.nextDay(1,1,2018);
            nextDayCalculator.nextDay(31,1,2018);
            nextDayCalculator.nextDay(30,4,2018);
            nextDayCalculator.nextDay(28,2,2018);
            nextDayCalculator.nextDay(29,2,2020);
            nextDayCalculator.nextDay(31,12,2018);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
