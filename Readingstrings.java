package java;

import java.util.Scanner;

public class Readstring {
  public static void main(String[] args)  
      {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter a string:");
        String input = sc.nextLine();
        System.out.print("You enterd"+input);
        
}
}