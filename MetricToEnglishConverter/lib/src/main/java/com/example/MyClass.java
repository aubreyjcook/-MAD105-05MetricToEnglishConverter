package com.example;

public class MyClass {
    public static void main(String[] args){
        float metricValue;
        metricValue = 28;

        System.out.println(metricValue + " METERS is equal to ");

        double englishValue;
        englishValue = metricValue * 3.2808;
        englishValue = (double)Math.round(englishValue);

        System.out.println(englishValue + " FEET.");


        metricValue = 168;

        System.out.println(metricValue + " KILOMETERS is equal to ");

        englishValue = metricValue / 1.609344;
        englishValue = (double)Math.round(englishValue);

        System.out.println(englishValue + " MILES.");


        metricValue = 47;

        System.out.println(metricValue + " CENTIMETERS is equal to ");

        englishValue = metricValue / 2.54;
        englishValue = (double)Math.round(englishValue);

        System.out.println(englishValue + " INCHES.");


        metricValue = 27;

        System.out.println(metricValue + " KILOMETERS per HOUR is equal to ");

        metricValue = metricValue * 1000; //convert to meters

        englishValue = metricValue * 3.2808; //converting to the english unit by multiplying by the foot per meter constant
        englishValue = englishValue / 3600; //convert to feet per second

        englishValue = (double)Math.round(englishValue);

        System.out.println(englishValue + " FEET per SECOND.");


        metricValue = 92;

        System.out.println(metricValue + " LITERS is equal to ");

        englishValue = metricValue * 0.26417;
        englishValue = (double)Math.round(englishValue);

        System.out.println(englishValue + " GALLONS.");


        metricValue = 200;

        System.out.println(metricValue + " KILOGRAMS is equal to ");

        englishValue = metricValue * 0.00110231;
        englishValue = (double)Math.round(englishValue*100)/100;

        System.out.println(englishValue + " TONS.");
    }
}