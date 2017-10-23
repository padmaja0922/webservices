package com.bcj.corejava.classes.medium.lab5;

public class Point {

	private double xCoordinate;
	private double  yCoordinate;
	private boolean isCollinear;
	
	
	public double getxCoordinate() {
		return xCoordinate;
	}
	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	public double getyCoordinate() {
		return yCoordinate;
	}
	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	public boolean isCollinear() {
		return isCollinear;
	}
	public void setCollinear(boolean isCollinear) {
		this.isCollinear = isCollinear;
	}

	/**
	 * @param p1
	 * @param p2
	 * @return
	 * this method is defined to calculate the slope of given two points 
	 */
	public   double  slopeWithAnotherPoint(Point p1,Point p2){
	    double  slope=(p2.yCoordinate-p1.yCoordinate)/(p2.xCoordinate-p1.xCoordinate);
	    if(slope==0)
	    {
	    	setCollinear(true);	    	
	    }else setCollinear(false);
	    
			return slope;
			
		}
	
	
	
	/**
	 * @param p1
	 * @param p2
	 * @return
	 * this method is used to calculate the distance between two given points 
	 */
	public static double  distanceFromAnotherPoint(Point p1, Point p2) {
		// TODO Auto-generated method stub
		
		 double distance = Math.sqrt(Math.pow(p2.xCoordinate-p1.xCoordinate, 2)+Math.pow(p2.yCoordinate-p2.yCoordinate, 2));
	return distance ;

}

}
