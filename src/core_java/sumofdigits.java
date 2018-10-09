package core_java;

public class sumofdigits {

	public static void main(String[] args) {
		int a=565;
		int d=a%10;
		int sum=0;
		sum=sum+d;
		a=a/10;
		d=a%10;
		sum=sum+d;
		a=a/10;
		d=a%10;
		sum=sum+d;
		System.out.println("Sum of digits="+sum);
		// TODO Auto-generated method stub

	}

}
