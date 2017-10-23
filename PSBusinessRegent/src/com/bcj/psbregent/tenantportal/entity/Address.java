/**
 * 
 */
package com.bcj.psbregent.tenantportal.entity;

/**
 * @author Boot Camp User 008
 *
 */
public class Address {
	
	

	  private String addrline1;
	  private String addrline2;
	  private String city;
	  private String state;
	  private String zipCode;
	  
  
	  
	/**
	 * Overriding toString method
	 */
	  
	  public String toString(){
			
			return (this.addrline1 +"  "+this.addrline2 + "  "+ this.city +"  "+ this.state+"  "+ this.zipCode);
		}
	  
	  
	public Address() {
		super();
	}
	/**
	 * @param addrline1
	 * @param addrline2
	 * @param city
	 * @param state
	 * @param zipCode
	 */
	
	public Address(String addrline1, String addrline2, String city, String state, String zipCode) {
		super();
		this.addrline1 = addrline1;
		this.addrline2 = addrline2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	/**
	 * @return the addrline1
	 */
	public String getAddrline1() {
		return addrline1;
	}
	/**
	 * @param addrline1 the addrline1 to set
	 */
	public void setAddrline1(String addrline1) {
		this.addrline1 = addrline1;
	}
	/**
	 * @return the addrline2
	 */
	public String getAddrline2() {
		return addrline2;
	}
	/**
	 * @param addrline2 the addrline2 to set
	 */
	public void setAddrline2(String addrline2) {
		this.addrline2 = addrline2;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}
	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}
