package Program;

import java.util.Scanner;

public class Sum_naturalno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int i=1;
        
        while(i<=num)
        {
        	sum+=i;
        	i++;
        }
        System.out.println("sum:"+sum);
	}

}
