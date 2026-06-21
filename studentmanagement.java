import java.util.Scanner;
public class Student {
  public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
       System.out.print("Enter Student Name: ");
        String name = s.nextLine();
       System.out.print("Enter Student City: ");
        String city = s.nextLine();
       System.out.print("Enter Roll Number: ");
        int roll = s.nextInt();
       System.out.println("--- Registered Details ---");
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Roll No: " + roll);
        s.close();
    }
}
