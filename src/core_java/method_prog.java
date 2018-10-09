package core_java;

import java.util.Calendar;

public class method_prog {

	public static void main(String[] args) {
		print();
		System.out.println("then the function");
		System.out.println("then the function");
		System.out.println("then the function");
		print(2);
		print();
		System.out.println("then the function");
		System.out.println("then the function");
		print();
		print(3);
		print(20,'o');
		int c=max(5,4);
		System.out.println(c);
		int a=9,b=12,z=4;
		int max=max(a,b);
		System.out.println(max);
		max=max(z,max(a,b));
		System.out.println(max);
		
		System.out.println("Today is " +today());
		// TODO Auto-generated method stub

	}
	public static void print()
	{
		System.out.println("HELOO");
	}
	
	public static void print(int length)
	{
		for(int i=1;i<=length;i++)
		{
			System.out.println("..............");
		}
	}
	
	public static void print(int length,char c)
	{
		for(int i=1;i<=length;i++)
		{
			System.out.print(c);
		}
		System.out.println();
	}
	
	public static int max(int x,int y)
	{
		if(x<y)
		{
			return y;
		}
		else
		{
			return x;
		}
	}
	public static int today()
	{
		Calendar c= Calendar.getInstance();
		return c.get(Calendar.DATE);
	}

}
