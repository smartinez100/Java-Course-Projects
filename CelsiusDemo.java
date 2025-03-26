public class CelsiusDemo {
    public static void main(String[] args) {
        // call celsius method and store in variable
        double convertToCelsius = celsius(72.0);
        // print the result
        System.out.println("72 degrees Fahrenheit is " + convertToCelsius + " degrees Celsius");
    }

    public static double celsius(double fahrenheit) {
        // return the fareinheit to celsius conversion formatted to 2 decimal places
        return Double.parseDouble(String.format("%.2f", (fahrenheit - 32) * (5.0 / 9.0)));
    }

}
