package core_java;

public class loop_statements {

	public static void main(String[] args) {
		/*for( ; ;)//infinite for loop
		{
			System.out.println("HELOO");
		}*/
		/*int i=0;*///declaration can be done such also but there is difference in scope
		/*for(int i=1;i<=10;i++)
		{
			System.out.println("JELLO");
		}*/
		/*System.out.println("ODD NUMBERS BETWEEN 1-50 = ");
		for(int i=1;i<50;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+",");
			}
		}*/
		/*System.out.println("PRIME NUMBERS BETWEEN 1-50 = ");
		int c=0;
		for(int i=1;i<50;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					{
					c=0;
					break;
					}
				else
				{
					c=1;
				}
			}
			if(c==1)
					{
					System.out.print(i+",");;
					}
			}*/
		/*int i=1;
		while(i<=10)
		{
			System.out.println(10+"x"+i+"="+i*10);
			i++;
		}*/
		
		int i=20;
		do
		{
			System.out.println("10x"+i+"="+i*10);
			i++;
		}
		while(i<=10);
		}
		// TODO Auto-generated method stub

	}


