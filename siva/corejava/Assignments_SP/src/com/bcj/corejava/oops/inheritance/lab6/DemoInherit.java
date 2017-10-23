/**
 * 
 */
package com.bcj.corejava.oops.inheritance.lab6;

/**
 * @author Bootcamp User 014
 *
 */
public class DemoInherit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean validName;
		Address adr=new Address("8231 carpenter pkwy", "Irving", "Texas", 75038);
		Hostelite hstl = new Hostelite("Aaradhya", 105,"double" , "Tommy", 75.6f, 'H',"CSE", adr, 4);
		validName=hstl.validateStudentName();
		if(validName==true)
		{
			if(hstl.validateBranchName()&& hstl.validateExamMarks())
			{
				System.out.println(  "student name                : "
						+ hstl.getStudentName() + "\n" + "qualifyingExam Marks        : "
						+ hstl.getQualifyingExamMarks()+"\n" + "Residential status          : " + hstl.getResidentialStatus()
						+ "\n" + "current Year of engineering : " + hstl.getYearOfEngg() + "\n" + "Branch name                 : "
						+ hstl.getBranchName()+"\n"
						+"permanent address line              : " +hstl.getPermanentAddress().getAddressLine()+"\n"
						+"permanent address city      : " +hstl.getPermanentAddress().getCity()+"\n"
					    +"permanent address state     : " +hstl.getPermanentAddress().getState()+"\n"
						+"permanent address  zip      : " +hstl.getPermanentAddress().getZip()+"\n"
						+"hostel Name                 : "+hstl.getHostelName()+"\n"
						+"Room No                     : "+hstl.getRoomNumber()+"\n"
						+"Room Type                   : "+hstl.getRoomType());
				
			}
			
		}
		Address adr1=new Address("501 Monroe  ST", "Dallas", "Texas", 75080);
		Address  residentialAddress =new Address("123 Greenway Dr", "Irving", "Texas", 75038);
		
		
		DayScholar dschlr= new DayScholar(residentialAddress, 10, "Timmy", 80.0f, 'D', "CSE", adr1, 4);
		System.out.println();
		
		
		System.out.println(" DayScholar");
		if(dschlr.validateStudentName()){
			if(dschlr.validateBranchName()&& dschlr.validateExamMarks())
			{
				System.out.println(  "student name                : "
						+ dschlr.getStudentName() + "\n" + "qualifyingExam Marks        : "
						+ dschlr.getQualifyingExamMarks()+"\n" + "Residential status          : " + dschlr.getResidentialStatus()
						+ "\n" + "current Year of engineering : " + dschlr.getYearOfEngg() + "\n" + "Branch name                 : "
						+ dschlr.getBranchName()+"\n"
						
						+"current year of engg        : "+dschlr.getYearOfEngg()+"\n"
						+"branch Name                 : "+dschlr.getBranchName()+"\n"
						+"residentialAddress line     : "+dschlr.getResidentialAddress().getAddressLine()+"\n"
						+"residentialAddress city     : "+dschlr.getResidentialAddress().getCity()+"\n"
					    +"residentialAddress state    : "+dschlr.getResidentialAddress().getState()+"\n"
					    +"residentialAddress zip      : "+dschlr.getResidentialAddress().getZip()+"\n"
						+"distance                    : "+dschlr.getDistance()+"\n"
						+"permanent address line      : " +dschlr.getPermanentAddress().getAddressLine()+"\n"
						+"permanent address city      : " +dschlr.getPermanentAddress().getCity()+"\n"
						+"permanent address state     : " +dschlr.getPermanentAddress().getState()+"\n"
						+"permanent address  zip      : " +dschlr.getPermanentAddress().getZip()+"\n"
					);
				
			}
		}


	}}
