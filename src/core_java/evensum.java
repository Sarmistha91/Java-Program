package core_java;

public class evensum {

	public static void main(String[] args) {
		int sum=0;
		int a=264;
		for (int i=0;i<3;i++)
			{
			int d=a%10;
			a=a/10;
			if (d%2==0)
			{
				sum=sum+d;
			}
			
			}
		System.out.println("Sum of even digits="+sum);
		// TODO Auto-generated method stub

	}

}
