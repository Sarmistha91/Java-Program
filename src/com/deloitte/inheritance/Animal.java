package com.deloitte.inheritance;

public abstract class Animal extends Object {
	boolean alive;
	{
		alive=true;//initialiser block
	}
	public Animal()
	{
		//alive=true;
	}
	public void eat()
	{
		System.out.println("Animal is eating.");
	}
	/*public void move(int distance)
	{
		System.out.println("Animal can move "+distance);
	}*/
	
	public abstract void move(int distance);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
