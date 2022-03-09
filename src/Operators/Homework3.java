/**
 * Convert Celsius into Fahrenheit
 */
public class Homework3 {
    public static void main(String[] args) {

        double cTemp = 22;
        double fTemp = cTemp * 9 / 5 + 32;
        System.out.println("\n" + cTemp + "C is equal to " + fTemp + "F");
/**
 * Convert Celsius into Kelvin
 */


        double celsiusTemp = 24;
        double kTemp = celsiusTemp + 273.15;
        System.out.println("\n" + celsiusTemp + "C is equal to " + kTemp + "K");


        /**
         * Convert Fahrenheit into celsius
         */

        double fahrenheitTemp = 78;
        double celTemp = (fahrenheitTemp -32)*5/9;
        System.out.println("\n" + fahrenheitTemp + "F is equal to " + celTemp + "C");


        /**
         * Convert Fahrenheit into kelvin
         */

        double fahTemp = 80;
        double kelTemp = (fahTemp + 459.67) * 5/9;
        System.out.println("\n" + fahrenheitTemp + "F is equal to " + kelTemp + "k");



        /**
         * Convert kelvin into Celsius
         */

        double kelvinTemp = 290;
        double celsusTemp = kelvinTemp-273.15 ;
        System.out.println("\n" + kelvinTemp + "k is equal to " + celsusTemp + "C");



        /**
         * Convert kelvin into Fahrenheit
         */
        double kelvnTemp = 290;
        double fahrnhtTemp = kelvinTemp * 9/5 - 459.67 ;
        System.out.println("\n" + kelvinTemp + "k is equal to " + fahrnhtTemp + "F");


    }
}




