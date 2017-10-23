package com.bcj.example;

import javax.swing.JOptionPane;

public class AlertExample {
	
	
	public static void main(String[] args) {
		
	   msgbox( "This language just gets better and better!");
		
	}
	
	private static  void msgbox(String s){
		   JOptionPane.showMessageDialog(null, s);
		}

}
