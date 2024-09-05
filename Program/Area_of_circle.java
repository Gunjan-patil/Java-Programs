package Program;

import java.util.Scanner;

public class Area_of_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the Radius:");
     float rad=sc.nextFloat();
     
     float area=3.14f*rad*rad;
     System.out.print("Area is:"+area);
	}

}
