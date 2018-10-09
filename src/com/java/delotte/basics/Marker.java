package com.java.delotte.basics;

public class Marker {

		public double price;
		public String color;
		public final String brand;//each method have to have the string value brand if it is final
		
		
		public static String category ="Sarmistha";
		
		
		
		public void write(String input)
		{
			System.out.println(input);
		}
		
		public static void swap(int a,int b)
		{
			int temp=a;
			a=b;
			b=temp;
			System.out.println("now a = "+a+"and b = "+b);
		}
		public Marker()
		{
			//System.out.println("Marker Object Created");
			price=20.0;
			brand="SILKY";
		}
		public Marker(String b)
		{
			brand=b;
		}
		
		public Marker(String b,String d,double p)
		{
			brand=b;
			color=d;
			price=p;
		}
		// TODO Auto-generated method stub
		public void setprice(double price) {
			if(price>0)
			{
				this.price=price;
			}
			else
			{
				System.out.println("Invalid Marker Price");
			}
			// TODO Auto-generated method stub
			
		}
		public double getprice()
		{
			return price;
		}
		
		/*public static void printprice()
		{
			System.out.println(price);
		}*/
		
		public void setcategory(String c)
		{
			Marker.category=c;
		}
		}

