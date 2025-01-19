import java.util.Scanner;
public class FahrenheitToCelcius {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        double fahrenheit = sc.nextDouble();

        double celcius = (fahrenheit - 32) * 5.0 / 9.0;
        System.out.println(celcius);
        }
    }
