package core_java;

/**
 * @author admin
 *
 */
public class demo {
	int i;//field

	public static void main1(String[] args) {
		//System.out.print("Hello world");
		//int i;//local variable,declaration statement
		int i=235,j=180;
		int k=i+j;
		System.out.println("i="+i);
		System.out.println("k="+k);
		i++;
		System.out.println("i="+i);
		k--;
		System.out.println("k="+k);
		System.out.println(++i);
		System.out.println(k++);
		System.out.println(k);
		// TODO Auto-generated method stub

	}
public static void main(String[] args) {
	int i,j,k;
	i=5;
	k=7;
	j=6;
	int a=(i++)+(++j)+(++k)+(k++)+(++i)+(j++);
	i=5;
	k=7;
	j=6;
	int b=(i++)+(--j)+(++k)+(k--)+(++i)+(j++);
	System.out.println(a);
	System.out.println(b);
	b+=5;
	System.out.println(b);
	
	i=5;
	k=7;
	j=6;
	boolean c=i>j; 
	System.out.println(c);
	boolean z=(i<j && c)||(k<j);
	boolean x=i>j && i++==--k;
	System.out.println(x);
}
}
