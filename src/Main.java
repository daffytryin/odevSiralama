import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       int x, y, z;
       Scanner input = new Scanner(System.in);

       System.out.print("1. sayı:");
        x = input.nextInt();

        System.out.print("2. sayı:");
        y = input.nextInt();

        System.out.print("3. sayı:");
        z = input.nextInt();

       if (x > y && x > z) {
          if ( y > z) {
              System.out.println(" " +x + ">" +y + ">" +z);
          } else if (z > y) {
              System.out.println(" "+x + ">" +z + ">" +y);
          }
    } else if (y>x && y>z) {
           if (x > z) {
               System.out.println(" " + y + ">" + x + ">" + z);
           } else if (z > x) {
               System.out.println(" " + y + ">" + z + ">" + x);
           }
       } else if (z>y && z>x) {
           if ( y > x) {
               System.out.println(" " +z + ">" +y + ">" +x);
           } else if (x > y) {
               System.out.println(" "+z + ">" +x + ">" +y);
           }
       }
} }