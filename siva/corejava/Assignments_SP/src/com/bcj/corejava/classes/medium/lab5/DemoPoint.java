package com.bcj.corejava.classes.medium.lab5;

public class DemoPoint {
	public static void main(String[] args) {
		

		Point point1=new Point();
		point1.setxCoordinate(8);
		point1.setyCoordinate(12);
		Point point2= new Point();
		point2.setxCoordinate(10);
		point2.setyCoordinate(21);
		Point.distanceFromAnotherPoint(point1, point2);
		point1.slopeWithAnotherPoint(point1, point2);
		midPoint(point1, point2);
		distanceFromOrigin(point1);
		isVertical(point1);
		isHorizontal(point1);
		
		
		
	}


	/**
	 * @param 
	 * 
	 * this method is defined to check the given point is horizontal
	 */
	private static boolean isHorizontal(Point p1) {
		// TODO Auto-generated method stub
		if(p1.getxCoordinate()==0)
			return true;
			else 
				return false;
		
		
	}


	/**
	 * @param 
	 *
	 * this method is defined  to check the given point is vertical
	 */
	private static boolean isVertical(Point p1) {
		// TODO Auto-generated method stub
		if(p1.getyCoordinate()==0)
			return 
					true;
			else 
				return false;
		
		
		
	}


	/**
	 * @param p1
	 * @param p2
	 * this method is used to calculate the midpoint of two given points 
	 */
	private static void midPoint(Point p1, Point p2) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("mid point of given two points is : "+p1.getxCoordinate()+","+p1.getyCoordinate());
		System.out.println("mid point of given two points is : "+p2.getxCoordinate()+","+p2.getyCoordinate());
		}
	/**
	 * @param p1
	 * @return
	 * this method is used to calculate the distance from the origin from a given point  
	 */
	private static double distanceFromOrigin(Point p1) {
		// TODO Auto-generated method stub
		
		 double distance = Math.sqrt(Math.pow(p1.getxCoordinate(), 2)+Math.pow(p1.getxCoordinate(), 2));
	      return distance ;

	}

}
