package core_java;

import com.java.delotte.basics.Marker;

public class Swap {

	public static void main(String[] args) {
		Marker a= new Marker("Raynold","Black",25);
		Marker b = new Marker("Camlin","Blue",22);
		System.out.println(a.getprice()+""+b.getprice());
		swap(a,b);
		System.out.println(a.getprice()+""+b.getprice());
		// TODO Auto-generated method stub

	}
	public static void swap(Marker m1,Marker m2)
	{
		double temp=m1.getprice();
		m1.setprice(m2.getprice());
		m2.setprice(temp);
	}

}
