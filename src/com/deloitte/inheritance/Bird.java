package com.deloitte.inheritance;

public class Bird extends Animal {
	public void fly(int distance)
	{
		System.out.println("Bird flies "+distance+ " distance");
	}
	public void move(int distance)
	{
		System.out.println("Bird can move "+distance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
