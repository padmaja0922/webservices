package com.bcj.memberservice.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.bcj.memberservice.entity.Member;

@WebService
public interface MemberServiceInterface {
	
	 @WebMethod
	public int registerMember(Member member);
	 
	 @WebMethod
    public Member getMemberById(int id);
	 
	 
}
