package Ex0412;

public class UnitConverter {
    // 필요한 상수 정의
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double POUNDS_PER_KILOGRAM = 1.0 / KILOGRAMS_PER_POUND;
    public static final double CENTIMETERS_PER_INCH = 2.54;
    public static final double INCH_PER_CENTIMETER = 1.0 / CENTIMETERS_PER_INCH;

    public static double toPounds(double kilograms) {
        return POUNDS_PER_KILOGRAM * kilograms;
    }
    public static double toKilograms(double pounds) {
        return KILOGRAMS_PER_POUND * pounds;
    }
    public static double toCentimeters(double inches) {
        return CENTIMETERS_PER_INCH * inches;
    }
    public static double toInches(double centimeters) {
        return INCH_PER_CENTIMETER * centimeters;
    }
    public static double toFahrenheit(double celsius) {
        return celsius * (9.0 / 5.0) + 32;
    }
    public static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * (5.0 / 9.0);
    }
}