import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Homework8 {
    public static void main(String[] args) {
        printTimeLine(4);

        printTimeLine(4);
        printNewTimeLine1(2);
        printNewTimeLine2(11);
    }


    /**
     * Due: Wed (Apr 6)
     * <p>
     * Create a method that will print timeline for given input data-points
     * <p>
     * Timeline should be (hour am/pm) with 2 hour interval from the current time.
     * <p>
     * generateTimeline(5)
     * Now 11pm 1am 3am 5am
     */
    public static void printTimeLine(int dataPoints) {
        SimpleDateFormat myFormat = new SimpleDateFormat("ha");
        Calendar cal = Calendar.getInstance();
        // System.out.println("Now");

        for (int i = 1; i <= 5; i++) {
            cal.add(Calendar.HOUR, 2);
            Date dateFromCal = cal.getTime();
            System.out.print(  "  "+ myFormat.format(dateFromCal).toLowerCase());


            /** generateTimeline(2)
             * Now 11pm
             */


        }



            }
    public static void printNewTimeLine1 ( int dataPoints1) {
        SimpleDateFormat myFormat1 = new SimpleDateFormat("ha");
        Calendar cal1 = Calendar.getInstance();
        // System.out.println("Now");

        for (int j = 1; j <= 2; j++) {
            cal1.add(Calendar.HOUR, 2);
            Date dateFromCal1 = cal1.getTime();
            System.out.print( " " + myFormat1.format(dateFromCal1).toLowerCase());

        }
    }

        /** generateTimeline(11)      // running code at 10:15am
         * Now 12pm 2pm 4pm 6pm 8pm 10pm 12am 2am 4am 6am
         */


        public static void printNewTimeLine2 ( int dataPoints2) {
            SimpleDateFormat myFormat2 = new SimpleDateFormat("ha");
            Calendar cal2 = Calendar.getInstance();
             System.out.println( " Now ") ;

            for (int j = 1; j <= 11 ; j++) {
                cal2.add(Calendar.HOUR, 2);
                Date dateFromCal2 = cal2.getTime();
                System.out.print(" " +  myFormat2.format(dateFromCal2).toLowerCase());

            }
        }


}


