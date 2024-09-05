package Program;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int income=sc.nextInt();
        int tax;
        
        if(income<300000)
        {
         tax=0;
        }
        else if(income>=300000 &&income<=800000)
        {
        	tax=(int)(income*0.2);
        }
        else {
        	tax=(int)(income*0.3);
        }
        System.out.println("your tax is:"+ tax);
	}
	

}
