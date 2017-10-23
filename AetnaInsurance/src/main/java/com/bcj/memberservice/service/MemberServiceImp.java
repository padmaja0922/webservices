package com.bcj.memberservice.service;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.bcj.memberservice.dao.MemberDao;
import com.bcj.memberservice.entity.Member;


@WebService (serviceName = "MemberService" , endpointInterface="com.bcj.memberservice.service.MemberServiceInterface")
public class MemberServiceImp implements MemberServiceInterface {
	
	
	@Autowired
	MemberDao memberDao;

	public int registerMember(Member member) {
		
		System.out.println(memberDao);
		
		return  memberDao.registerMember(member);
		
	}

	public Member getMemberById(int id) {
		
		Member member =  memberDao.getMemberById(id);
		
		return member;
		
	}

}
