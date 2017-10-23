package com.bcj.corejava.classes.medium.lab4;

public class Student {
	String name, branch;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public boolean validateStudentName() {
		if (name.length() >= 5 && name.length() <= 25)
			return true;
		else {
			System.out.println("The length of the name should be minimum 5 characters and a maximum of 25 characters");
			return false;
		}
	}

	public boolean validatebranchName(String str) {
		if("cse".equalsIgnoreCase(str)||"ece".equals(str)||"eee".equals(str)||"mech".equals(str)||"bio-tech".equals(str))
			return true;
		else
			
		setBranch("CSE");
			return false;
	}
}