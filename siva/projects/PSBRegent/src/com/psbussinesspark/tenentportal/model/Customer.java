
package com.psbussinesspark.tenentportal.model;

/**
 * @author Bootcamp User 014
 *This class holds the tenant details
 */
public class Customer {
	@Override
	public String toString() {
		return "Customer [fName=" + fName + ", lName=" + lName + ", phone=" + phone + ", email=" + email + ", userId="
				+ userId + ", password=" + password + "]";
	}

	private String fName;
	private String lName;
	private String phone;
	private String email;
	private String userId;
	private String password;

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
