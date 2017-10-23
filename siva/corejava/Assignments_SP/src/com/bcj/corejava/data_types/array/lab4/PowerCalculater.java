package com.bcj.corejava.data_types.array.lab4;

import java.util.Scanner;

public class PowerCalculater {

	public static void main(String[] args) {
		System.out.println("Enter the power range for base 2:");
		Scanner sc = new Scanner(System.in);
		int pwr = sc.nextInt();
		System.out.println("Enter the base :");
		int base = sc.nextInt();
		
        int ary[]=new int[pwr];
		PowerCalculater pc=new PowerCalculater();
			ary=pc.powerOfTwo(pwr);
			for(int i=0;i<ary.length;i++)
        System.out.print(" "+ary[i]);
			System.out.println(" "); //printing the returned array
			ary=pc.power(base,pwr);
			for(int i=0;i<ary.length;i++)
        System.out.print(" "+ary[i]);
			}

	public  int[] powerOfTwo(int n)
{
	int[] hold=new int[n];
			hold[0]=1;
	for(int i=1;i<n;i++)      //calculating power for base 2
		hold[i]=hold[i-1]*2;
	return hold;
}
public  int[] power(int base,int power)
{
	int[] hold=new int[power];
			hold[0]=1;
	for(int i=1;i<power;i++)   //calculating power for given base
		hold[i]=hold[i-1]*base;
	return hold;
}

}

