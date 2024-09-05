package Program;

import java.util.Scanner;

public class N_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter count:");
        Scanner sc=new Scanner(System.in);
        int range=sc.nextInt();
        int counter=1;
        
        while(counter<=range)
        {
        	System.out.println(counter +" ");
        	counter++;
        }
        System.out.println();
        }
	}


