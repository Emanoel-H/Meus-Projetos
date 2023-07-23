package Weather.Domain;

import java.util.Scanner;

public class Weather {
    Scanner sc = new Scanner(System.in);
    public void showMenu (){
        System.out.println("==================================================");
        System.out.println("          Welcome to the Weather Converter        ");
        System.out.println("   Type the kind of conversion you want to run:   ");
        System.out.println("\n 1- Fahrenheit to Celsius \n 2- Celsius to Fahrenheit \n 9- Exit program");
        System.out.println("==================================================");
    }
    public boolean fahrToCelsius (float f) {
     if (f != 0){
         float c = (f - 32) / 1.8f;
         System.out.println("The value you've inserted converted to Celsius is: " + Math.round(c));
         return true;
     }
        System.out.println("The fahrenheit value you've inserted is 0, try again");
     return false;
    }

    public boolean celToFahrenheit (double c) {
        if (c != 0){
            double f = ((c * 9) / 5) + 32;
            System.out.println("The value you've inserted converted to Fahrenheit is: " + Math.round(f));
            return true;
        }
            System.out.println("The celsius value you've inserted is 0, try again");
        return false;
    }

    public void toRun (int op, Weather sweather){
        try {
            switch (op){
                case 1:
                    System.out.println("Insert the Fahrenheit degrees:");
                    float fahrenheit = sc.nextFloat();
                    sweather.fahrToCelsius(fahrenheit);
                    break;
                case 2:
                    System.out.println("Insert the Celsius degrees:");
                    double celsius = sc.nextDouble();
                    sweather.celToFahrenheit(celsius);
                    break;
                case 9:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("You've inserted an invalid option, try again.");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
