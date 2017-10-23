/**
 * 
 */
package com.bcj.psbregent.tenantportal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bcj.psbregent.tenantportal.entity.Company;
import com.bcj.psbregent.tenantportal.util.JDBCUtilByProperty;


/**
 * This class saves the company details in database using property utility class
 *
 */


public class RegistrationDao {

	/**
	 * @param company
	 * @return Account Id
	 *  
	 * This method saves the address details of company to database and gets the address Id from data base
	 * then calls saveTenant and saveCompany methods to save tenant details and company details
	 *
	 */
	
	public static int saveCompanyDetails(Company company) {

		int cid = 0;
		Connection con = null;
		int aid = 0;

		try {

			con = JDBCUtilByProperty.getConnectionByProperty();

			PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(
					"INSERT INTO `address` (addressline1,addressline2,city,state,zipcode) VALUE  (?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);
			
			pstmt.setString(1, company.getAddress().getAddrline1());
			pstmt.setString(2, company.getAddress().getAddrline2());
			pstmt.setString(3, company.getAddress().getCity());
			pstmt.setString(4, company.getAddress().getState());
			pstmt.setString(5, company.getAddress().getZipCode());

			pstmt.executeUpdate();

			ResultSet rs = pstmt.getGeneratedKeys();

			while (rs.next()) {
				aid = rs.getInt(1);
			}

			int tid = saveTenant(company, con);

			cid = saveCompany(company, con, aid, tid);

			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		 finally {
				try {
					con.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		
		
		return cid;

	}
	
	/**
	 * 
	 * @param company
	 * @param con
	 * @return tid
	 * @throws SQLException
	 * 
	 * This method saves tenant details in database and return tenant id
	 * 
	 */

	public static int saveTenant(Company company, Connection con) throws SQLException {

		int aid = 0, tid = 0;
		PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(
				"INSERT INTO `address` (addressline1,addressline2,city,state,zipcode) VALUE  (?,?,?,?,?)",
				Statement.RETURN_GENERATED_KEYS);
		
		pstmt.setString(1, company.getTent().getAddr().getAddrline1());
		pstmt.setString(2, company.getTent().getAddr().getAddrline2());
		pstmt.setString(3, company.getTent().getAddr().getCity());
		pstmt.setString(4, company.getTent().getAddr().getState());
		pstmt.setString(5, company.getTent().getAddr().getZipCode());

		pstmt.executeUpdate();

		ResultSet rs = pstmt.getGeneratedKeys();

		while (rs.next()) {
			aid = rs.getInt(1);
		}

		pstmt = (PreparedStatement) con.prepareStatement(
				"INSERT INTO `tenant` (firstname,lastname,email,phone,aid) VALUE  (?,?,?,?,?)",
				Statement.RETURN_GENERATED_KEYS);
		
		pstmt.setString(1, company.getTent().getFirstName());
		pstmt.setString(2, company.getTent().getLastName());
		pstmt.setString(3, company.getTent().getEmail());
		pstmt.setString(4, company.getTent().getPhone());
		pstmt.setInt(5, aid);

		pstmt.executeUpdate();
		rs = pstmt.getGeneratedKeys();

		while (rs.next()) {
			tid = rs.getInt(1);

		}
		return tid;

	}
	
	/**
	 * 
	 * @param company
	 * @param con
	 * @param aid
	 * @param tid
	 * @return cid
	 * @throws SQLException
	 * 
	 * 
	 * After inserting tenant details and address of company this method takes tid and aid as input and 
	 * stores in database and return account id 	 * 
	 * 
	 */

	public static int saveCompany(Company company, Connection con, int aid, int tid) throws SQLException {

		int cid = 0;
		PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(
				"INSERT INTO `company` (name ,email,phone,userid,password,caid,tid) VALUE  (?,?,?,?,?,?,?)",
				Statement.RETURN_GENERATED_KEYS);
		
		pstmt.setString(1, company.getcName());
		pstmt.setString(2, company.getcEmail());
		pstmt.setString(3, company.getcPhone());
		pstmt.setString(4, company.getUserId());
		pstmt.setString(5, company.getPassword());
		pstmt.setInt(6, aid);
		pstmt.setInt(7, tid);

		pstmt.executeUpdate();
		ResultSet rs = pstmt.getGeneratedKeys();
		

		while (rs.next()) {
			cid = rs.getInt(1);
		}

		return cid;

	}

	
	

}
