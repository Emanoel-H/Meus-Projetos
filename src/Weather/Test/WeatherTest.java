package Weather.Test;

import Weather.Domain.Weather;

import java.util.Scanner;

public class WeatherTest {
    public static void main(String[] args) {
        Weather w = new Weather();
        Scanner sc = new Scanner(System.in);
        int input = 0;
        while (input != 9){
            w.showMenu();
            input = sc.nextInt();
            w.toRun(input, w);
        }
        System.out.println();
        sc.close();
    }
}
