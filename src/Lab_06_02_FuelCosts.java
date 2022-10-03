import java.util.Scanner;

public class Lab_06_02_FuelCosts {
    public static void main(String[] args) {
        double gasTank = 0;
        double fuelEfficiency = 0;
        double gasPrice = 0;
        double gallonAmount;
        double mile;
        double milesLeft;

        Scanner in = new Scanner(System.in);

        System.out.println("How many gallons of gas are left in the tank?");

        if(in.hasNextDouble()){
            gasTank = in.nextDouble();
            in.nextLine();
        }else{
            System.out.println("Your input is invalid");
        }
        System.out.println("What is your fuel efficiency in mpg?");

        if(in.hasNextDouble()){
            fuelEfficiency = in.nextDouble();
            in.nextLine();
        }else{
            System.out.println("Your input is invalid");
        }
        System.out.println("What is the price of gas per gallon?");

        if(in.hasNextDouble()){
            gasPrice = in.nextDouble();
            in.nextLine();
        }else{
            System.out.println("Your input is invalid");
        }

        gallonAmount = 100 / fuelEfficiency;
        mile = gallonAmount * gasPrice;
        milesLeft = gasTank * fuelEfficiency;

        System.out.println("100 miles of travel will cost: " + mile + "$");
        System.out.println(milesLeft + " Miles left before tank is empty");

    }
}
