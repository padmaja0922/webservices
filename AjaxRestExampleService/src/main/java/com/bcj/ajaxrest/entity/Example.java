package com.bcj.ajaxrest.entity;

public class Example {
	
	
	void b (int i){
		System.out.println(1);
	}
	

	void b (Integer i){
		System.out.println(2);
	}
	

	void b (Object o){
		System.out.println(3);
	}

	 public static void main(String[] args) {
		
		 
		 Example e  = new Example();
		 e.b(10);
		 e.b(10.5);
		 e.b(new Double("25.25"));
		 
		 
		 
	}


}
