package Program;

import java.util.Scanner;

public class add_natural_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum =0;
        int i=1;
        while(i<=n)
        {
        	sum+=i;
        	i++;
        	
        }
        System.out.println("Sum="+sum);
	}

}
