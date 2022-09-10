import java.util.InputMismatchException;
import java.util.Scanner;

public class Main

{
   public static void main(String[] args) {

      System.out.println("Choose your wheel wide, mm:");

      Scanner scanner = new Scanner(System.in);
      int wideWheel = scanner.nextInt();

      System.out.println("Choose your hight wheel, mm:");

      Scanner scanner1 = new Scanner(System.in);
      int hightWheel = scanner1.nextInt();

      System.out.println("Choose your rims sise, inc:");

      Scanner scanner2 = new Scanner(System.in);
      int dRims = scanner2.nextInt();

      System.out.println("Choose your gear ratio the main couple:");
      Scanner scanner3 = new Scanner(System.in);
      double mainCouple = scanner3.nextDouble();


      System.out.println("Choose your the gear ratio need couple:");
      Scanner scanner4 = new Scanner(System.in);
      double needCouple = scanner4.nextDouble();

      System.out.println("Choose your engine speed:");
      Scanner scanner5 = new Scanner(System.in);
      int engineSpeed = scanner5.nextInt();

      double dWheels = ((((wideWheel/1000.0) * (hightWheel/100.0)) * 2) + dRims * (2.54 / 100)) * 3.14;

      double maxSpeed = (dWheels/(mainCouple*needCouple)) * (60/1000.0) * engineSpeed;
      System.out.println("Your maximum speed:" + maxSpeed + "km/h");




   }
}
