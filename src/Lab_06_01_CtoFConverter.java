import java.util.Scanner;

public class Lab_06_01_CtoFConverter {
    public static void main(String[] args) {
        double celsius = 0.0;
        double fahrenheit = 0.0;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter celsius value:");
        if (in.hasNextDouble()) {
            celsius = in.nextDouble();
            in.nextLine();

            fahrenheit = 9.0 / 5.0 * celsius + 32;
            System.out.println("The fahrenheit value is: " + fahrenheit);
        }else{
            System.out.println("Your input is invalid");
        }
    }
}
