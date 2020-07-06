public class LessonOne {
    public static void main(String[] args) {
        int thisYear = 2019;
        String birthdayMonth = "June";
        int firstDay = 3;

        // create a daysInWeek variable with a value of 7
        int daysInWeek = 7;

        // add the value of the daysInWeek variable to the firstDay variable, using a shortcut operator
        firstDay += daysInWeek;

        // Create a startingDay numeric constant with the new value of the firstDay variable
        final int startingDay = firstDay;

        // Display the result
        System.out.println("There are " + daysInWeek + "days in a week.\nYour starting day in the month is: " + startingDay);
    }
}
