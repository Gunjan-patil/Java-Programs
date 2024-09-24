package conditional_statement;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a:");
     int a=sc.nextInt();
     System.out.println("Enter b:");
     int b=sc.nextInt();
     System.out.println("Enter operator:");
     char operator=sc.next().charAt(0);
     
     switch(operator)
     {
     case 1:System.out.println(a+b);
            break;
     case 2:System.out.println(a-b);
           break;
     case 3:System.out.println(a*b);
          break;
     case 4:System.out.println(a/b);
          break;
     case 5:System.out.println(a%b);
          break;
     default:System.out.println("wrong");   
     } 
     }
}
