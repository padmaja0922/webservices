package com.bcj.corejava.classes.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 */

/**
 * @author siva
 *performing operations on sets
 */
public class SetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

			    // Create a set called mySet
			    Set mySet = new HashSet();

			    // Ensure that this set contains an interesting selection of fruit 
			    String fruit1 = "pear", fruit2 = "banana", fruit3 = "tangerine",
			                            fruit4 = "strawberry", fruit5 = "blackberry";
			    mySet.add( fruit1 );
			    mySet.add( fruit2 );
			    mySet.add( fruit3 );
			    mySet.add( fruit2 );
			    mySet.add( fruit4 );
			    mySet.add( fruit5 );

			    // Display contents of mySet
			    System.out.println( "mySet now contains:" );
			    System.out.println( mySet );
			    System.out.println("the cardinality of mySet is :"+mySet.size());
			    System.out.println();
			    Iterator<String> itr=mySet.iterator();
			    System.out.println("after deleting  berries from the list");
			    while(itr.hasNext())
			    {String hold=itr.next();
			    	if(hold.equals("blackberry")||hold.equals("strawberry"))
			    	itr.remove();
			    	
			    }System.out.println(mySet);
			    
			    Iterator<String> remv=mySet.iterator();
			    while(remv.hasNext()){
			    	String obj=remv.next();remv.remove();}
			    System.out.println("\nis my set is empty now :"+mySet.isEmpty());
			  }
			}



