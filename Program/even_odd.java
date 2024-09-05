package Program;

import java.util.Scanner;

public class even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number:");
       Scanner sc=new Scanner(System.in);
      int num =sc.nextInt();
      
      if(num%2==0)
      {
    	  System.out.println("Odd");
      }
      else
      {
    	  System.out.println("Even");
      }
	}

}
