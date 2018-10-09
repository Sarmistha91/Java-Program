package core_java;

public class control_statements {

	public static void main(String[] args) {
		/*if(true)
		{
			System.out.println("TWO");
		}
		if(false)//dead since it always takes true if not assigned
		{
			System.out.println("TWO");
		}
		int i=2;
		if(i==2)
		{
			System.out.println(i);
		}
		if (i==3)
			System.out.println(i);//only this block is associated with if
			System.out.println("TWO");
			
			
		int a=4;
		if(a==4)
		{
			System.out.println("FOUR");
		}
		else
		{
			System.out.println("NOT FOUR");
		}
		
		
		int marks=12;*/
		/*if(marks<40) //IF STATEMENTS
		{
			System.out.println("FAIL");
		}
		if(marks>=40 && marks<50)
		{
			System.out.println("THIRD CLASS");
		}
		if(marks>=50 && marks<60)
		{
			System.out.println("SECOND CLASS");
		}
		if(marks>=60 && marks<75)
		{
			System.out.println("THIRD CLASS");
		}
		if(marks>=75)
		{
			System.out.println("DISTINCTION");
		}*/
		
		/*if(marks<40) //IF-ELSE-IF STATEMENT
		{
			System.out.println("FAIL");
		}
		else if(marks>=40 && marks<50)
		{
			System.out.println("THIRD CLASS");
		}
		else if(marks>=50 && marks<60)
		{
			System.out.println("SECOND CLASS");
		}
		else if(marks>=60 && marks<75)
		{
			System.out.println("THIRD CLASS");
		}
		else if(marks>=75)
		{
			System.out.println("DISTINCTION");
		}*/
		
		/*if (marks>=75)//IF-ELSE LADDER STATEMENT
		{
			System.out.println("DISTINCTION");
		}
		else
		{
			if(marks>=60)
			{
				System.out.println("FIRST CLASS");
			}
			else
			{
				if(marks>=50)
				{
					System.out.println("SECOND CLASS");
				}
				else
				{
					if(marks>=40)
					{
						System.out.println("THIRD CLASS");
					}
					else
					{
						System.out.println("FAILED");
					}
				}
			}
		}*/
		
		/*int month=2;
		switch(month)
		{
		case 1:
			System.out.println("January");
		case 2:
			System.out.println("FEBRUARY");
		case 3:
			System.out.println("MARCH");
		case 4:
			System.out.println("APRIL");
		}*/
		
		int month=3;
		/*switch(month)
		{
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("FEBRUARY");
			break;
		case 3:
			System.out.println("MARCH");
			break;
		case 4:
			System.out.println("APRIL");
			break;
		default:
			System.out.println("NO MATCH CASE.ENTER VALID MONTH i.e BETWEEN 1-4.");
			break;//not necessary
		}
		*/
		switch(month)
		{
		case 1:
		case 3:
		case 4:
			System.out.println("30/31 days");
			break;
		case 2:
			System.out.println("28/29 days");
			break;

		default:
			System.out.println("NO MATCH CASE.ENTER VALID MONTH i.e BETWEEN 1-4.");
			break;//not necessary
		}
		// TODO Auto-generated method stub

	}

}
