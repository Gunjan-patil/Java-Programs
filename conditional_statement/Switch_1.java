package conditional_statement;

import java.util.Scanner;

public class Switch_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int number=5;
//		Scanner sc=new Scanner(System.in);
//		int number=sc.nextInt();
    switch(number)
    {
    case 1:
    	System.out.println("Tea");
    break;
    case 2:
    	System.out.println("Coffee");
    break;
    case 3:
    	System.out.println("Green Tea");
    	break;
   default:
  	System.out.println("Wake Up....");
    }
	}

}
