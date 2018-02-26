import java.util.Scanner;

public class Geometry{

  public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);
    double area;

    System.out.println("1) Square\n2) Circle\n");
    System.out.print("Choose a shape: ");

    String mode = kb.next();

    if (mode.equals("1")) {

      System.out.print("Enter sidelength: ");

      double sidelength = kb.nextDouble();
      area = sidelength * sidelength;

      System.out.print("Area: ");
      System.out.println(area);

      } else if(mode.equals("2")) {

        System.out.print("Enter radius: ");

        double radius = kb.nextDouble();
        area = (Math.PI * Math.pow(radius, 2));

        System.out.print("Area: ");
        System.out.println(area);

      } else { System.out.println("Invalid option. Exiting..."); }
   }
}

