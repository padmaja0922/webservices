package com.bcj.corejava.data_types.strings.lab4;

public class Max_Number {

	public static void main(String[] args) {
		
		String str= "324, 457, 112, 259, 323, 222";
		String [] str1=str.split(", ");
		
		int compare=0;
		int[] digit=new int[str1.length];
		for(int i=0;i<str1.length;i++)
		{int sum = 0, remainder = 0;
			digit[i]=Integer.parseInt(str1[i]);
			while (digit[i] > 0) {
				remainder = digit[i] % 10;
				sum = sum + remainder;
				digit[i] = digit[i] / 10;
				
			}digit[i] =sum;
			if(compare<digit[i])
				compare=digit[i];
			//System.out.println(" "+digit[i]);}
			
		}		
	for(int j=0;j<str1.length;j++)	
	{
		if(compare==digit[j])
			System.out.println("The biggest numbers are :"+str1[j]);
	}

	}

}
