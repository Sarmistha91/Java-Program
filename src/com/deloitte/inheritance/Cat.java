package com.deloitte.inheritance;

public class Cat extends Animal implements Hunter,Jumper,Runner{
	public void hunt()
	{
		System.out.println("Cat is hunting");
	}
	public void jump(int length)
	{
		System.out.println("Cat is jumping "+length);
	}
	public void run(int distance)
	{
		System.out.println("Cat running "+distance);
	}
	public void move(int d)
	{
		System.out.println("Cat is moving "+d);
	}
	public static void main(String[] args) {
		
		Cat c=new Cat();
		c.hunt();
		c.run(34);
		c.move(7);
		c.jump(72);
		// TODO Auto-generated method stub

	}

}
