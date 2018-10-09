package com.java.delotte.basics;

import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {
		int [][] arr={{12 ,15},{16,20,36,84},{37,21,22},{16}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main1(String[] args) {
		Marker [] m;
		m= new Marker[3];
		System.out.println(m[2].price);
		
	}

	public static void main2(String[] args) {
		int [] a={8,9,6,5,3,2,1,7};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		//BUBBLE SORT
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j+1]<a[j])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int [][]arr;
		arr= new int [4][4];
		arr[0][0]=12;
		arr[0][1]=15;
		arr[1][0]=16;
		arr[1][1]=20;
		arr[1][2]=36;
		arr[1][3]=84;
		arr[2][0]=37;
		arr[2][1]=21;
		arr[2][2]=27;
		arr[3][0]=16;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		// TODO Auto-generated method stub

	}

}
