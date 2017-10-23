package com.bcj.corejava.classes.simple.lab1;
import java.util.Random;
public class Password {

	public static void main(String[] args) {
		char hold;
		Random rndm = new Random(); 
for(int i=1;i<=8;i++)
{
	if(i%2!=0)
	System.out.print((char) (rndm.nextInt(25) + 97));
	else
		System.out.print((rndm.nextInt(9)+1));
}
	}

}
