import java.util.Scanner;

public class PartyAffiliation {
  public static void main(String[] args) {

    // declare variable: choice
    Scanner in = new Scanner(System.in);
    String choice = "";

    // display menu and prompt user for party affiliation
    System.out.println("Enter your party affiliation:");
    System.out.println("D - Democrat");
    System.out.println("R - Republican");
    System.out.println("I - Independent");
    System.out.print("Your choice: ");

    // read input as string
    choice = in.nextLine();

    // cascaded if: if D, output Donkey
    if (choice.equalsIgnoreCase("D")) {
      System.out.println("You get a Democratic Donkey.");
      // else if R, output Elephant
    } else if (choice.equalsIgnoreCase("R")) {
      System.out.println("You get a Republican Elephant.");
      // else if I, output Person
    } else if (choice.equalsIgnoreCase("I")) {
      System.out.println("You get an Independent Person.");
      // else output Other; doesn't matter what the user enters (i.e., can be "other" or "libertarian," etc.)
    } else {
      System.out.println("You get an Other.");
    }
  }
}