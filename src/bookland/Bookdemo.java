package bookland;

public class Bookdemo {

	public static void main(String[] args)
	{
		book b1 =new book(800,8,"NEW LIFE","SARMISTHA MOHANTY","MOH");
		book b2 =new book(400,0,"NEXT LIFE","ABINASH","SAHU");
		if(b1.isclose(b1.cp))
		{
			b1.cp=b1.open();
			System.out.println(b1.title+" is now open at page "+b1.cp);
		}
		else
		{
			System.out.println(b1.title+" is opened at page "+b1.cp);
		}
		if(b2.isclose(b2.cp))
		{
			b2.cp=b2.open();
			System.out.println(b2.title+" is now open at page "+b2.cp);
		}
		else
		{
			System.out.println(b2.title+" is opened at page "+b2.cp);
		}
		// TODO Auto-generated method stub

	}

}
