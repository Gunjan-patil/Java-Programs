package conditional_statement;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=16;
		if(age>=18)
		{
			System.out.println("adult:Driving licence");
		}
		if(age>13 && age<18)
		{
		System.out.println("Teenager");	
		}
		else
		{
			System.out.println("not adult");
		}

	}

}
