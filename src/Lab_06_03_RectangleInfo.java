import java.util.Scanner;

public class Lab_06_03_RectangleInfo {
    public static void main(String[] args) {
        double length;
        double width;
        double area;
        double perimeter;
        double diagonal;
        String trash;

        //area = length * width
        //perimeter = 2* length + 2* width
        //diagonal = Squareroot (length * length * width * width)

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length of side A");

        if (in.hasNextDouble()) {
            length = in.nextDouble();
            in.nextLine();

            System.out.println("Enter the width of the rectangle");

            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();

                diagonal = Math.sqrt(length * length + width * width);

                area = length * width;
                perimeter = (2 * length) + (2 * width);

                System.out.printf("The area of the rectangle %.2f%n", area);
                System.out.printf("The perimeter of the rectangle %.2f%n", perimeter);
                System.out.printf("The diagonal of the rectangle %.2f%n", diagonal);


            } else {
                trash = in.nextLine();
                System.out.println("You entered an invalid value: " + trash);
            }
        }
    }
}
