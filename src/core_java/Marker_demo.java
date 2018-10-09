package core_java;

import com.java.delotte.basics.Marker;
import java.util.Date;
public class Marker_demo {
	
	public static void main(String[] args) {
		Marker m1= new Marker("Reynolds","Blue",28);
		System.out.println(m1.getprice());
		m1.setprice(35.0);
		
		System.out.println(m1.getprice());
		
		m1.setcategory("permanent");
		System.out.println(m1.category);
	}
	
	
	
	
	public static void maina(String[] args) {
		Marker m1= new Marker("Reynolds","Blue",28);
		Date d1 = new Date();
		System.out.println(d1);
		System.out.println(m1.color);
		System.out.println(m1.toString());
		
	}
	public static void mainn(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println(Math.max(78, 67));
		System.out.println(Math.min(48, 54));
		System.out.println(Math.floor(23.7));
		System.out.println(Math.ceil(78.5));
		System.out.println(Math.sqrt(64));
		System.out.println(Math.pow(3, 4));
		System.out.println(Math.abs(220));
	}
	
	
	
	public static void main4(String[] args) {
		Marker m1=new Marker("Reynolds","Blue",28);
		Marker m2=new Marker("Reynol","Bl",2);
		
		System.out.println(m1.color);
		System.out.println(m2.color);
		
		System.out.println(m1.category);
		System.out.println(m2.category);
		
		m1.color="black";
		m1.color="pink";
		
		m1.category="sta";
		m2.category="onary";
		
		System.out.println(m1.color);
		System.out.println(m2.color);
		
		System.out.println(m1.category);
		System.out.println(m2.category);
	}

	public static void main1(String[] args) {
		Marker m1;//declaration statement
		m1=new Marker();
		Marker m2 = new Marker();
		/*m1.price=15.8;
		m2.price=20.9;*/
		m2.color="Silver";
		//System.out.println(m1.price);
		System.out.println(m1.brand);
		System.out.println(m1.color);
		//System.out.println(m2.price);
		System.out.println(m2.brand);
		System.out.print(m2.color);
		
		/*m1.Marker();*///only for method calling not constructor calling
		// TODO Auto-generated method stub

	}
	public static void main2(String[]args){
		Marker m1=new Marker();
		//m1.brand="Camlin";
		m1.setprice(-10.54);
		System.out.println(m1.brand);
		Marker m2=new Marker("PERMANENT","BLACK",45.24);
		System.out.println(m2.brand);
		System.out.println(m2.color);
		System.out.println(m1.getprice());
		Marker.swap(3, 4);
	}

}
