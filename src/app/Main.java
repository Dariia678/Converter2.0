package app;

public class Main {

    public static void main(String[] args) {

        System.out.println("Project Converter: This project converts " +
                "miles to kilometers and vice versa.");
        System.out.println("5 miles is " + milesToKilometers(5));
    }
    public static double milesToKilometers(double miles) {
        return miles *1.56849;
    }
}
