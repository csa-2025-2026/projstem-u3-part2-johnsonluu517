import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);  // input from the keyboard
    /* ============= BEGIN SOLUTION ================================ */
    System.out.println("Type a number");
    double input1 = scan.nextDouble();
    double target1 = 12.345;
    if (target1 == input1)
    {
         System.out.println("YES");
    }
   System.out.println("Type a number");
    int input2 = scan.nextInt();
    int target2 = 48;
    if (target2 == input2)
    {
         System.out.println("YES");
    }

    System.out.println("Type an integer");
    int input3 = scan.nextInt();
    System.out.println("Type an integer");
    int input4 = scan.nextInt();
    if (input4 == (input3 *2))
    {
         System.out.println("YES");
    }

    System.out.println("Type an integer");
    int input5 = scan.nextInt();
    if (input5 % 2 == 0) {
      System.out.println("Divisible by 2!");
    }

    if (input5 % 3 == 0) {
      System.out.println("Divisible by 3!");
    }

System.out.println("Type an integer");
    int input6 = scan.nextInt();
 
  if (input6 / 2 == (double)input6 / 2) {
      System.out.println("Even!");
    }

    else {
        System.out.println("Odd!");
      
    }


    System.out.println("Type a capital letter grade (no + or -)");
    String input7 = scan.next();

     if (input7 == ("A") ) {
      System.out.println("90-100");
    }
     if (input7 == ("B") ) {
      System.out.println("80-90");
    }
     if (input7 == ("C") ) {
      System.out.println("70-80");
    }
     if (input7 == ("D") ) {
      System.out.println("60-70");
    }
     if (input7 == ("F") ) {
      System.out.println("0-60");
    }



    /* ============= END SOLUTION ================================== */
    scan.close();
  }
}
