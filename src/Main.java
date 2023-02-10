import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Vehicle Mustang = new Vehicle();
        String Colour;
        int Year;
        Scanner userIn = new Scanner(System.in);

        System.out.println("Enter the colour of the car");
        Colour = userIn.nextLine();
        System.out.println("Enter the Year of the car");
        Year = userIn.nextInt();

        Mustang.Drives(Colour,Year);
        System.out.println("The "+Mustang.Year+" "+Mustang.Colour+" Mustang Drives!");

    }

}



