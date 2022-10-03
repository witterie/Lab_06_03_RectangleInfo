import java.util.Scanner;

public class Lab_06_04_MetricConverter {
    public static void main(String[] args) {
        double meters = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Give measurement in meters: ");
        if(in.hasNextDouble()){
            meters = in.nextDouble();
        }else{
            System.out.println("Your input is invalid");
            in.nextLine();
        }
        System.out.println("");

        miles = meters / 1609;
        feet = meters * 3.281;
        inches = meters * 39.3701;

        System.out.println("Meters Conversions");
        System.out.printf("Miles: %.2f%n", + miles);
        System.out.printf("Feet: %.2f%n", feet);
        System.out.printf("Inches: %.2f%n", inches);
    }
}
