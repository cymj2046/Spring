package com.exam.mvc2.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.exam.mvc2.vo.MemberVo;

@Component
public class MemberDao {
	//DB연결
	private Map<String, MemberVo> memberDB = new HashMap<String, MemberVo>();
	
	//메서드
	public void insertMember(MemberVo memberVo) {
		memberDB.put(memberVo.getM_id(), memberVo);
		printAllMember();
	}
	
	public MemberVo selectMember(MemberVo memberVo) {
		MemberVo signInedMember = memberDB.get(memberVo.getM_id());
		if(signInedMember !=null && memberVo.getM_pw().equals(signInedMember.getM_pw())) {
			return signInedMember;
		}else {
			return null;
		}
	}
	
	private void printAllMember() {
		Set<String> keys = memberDB.keySet();
		Iterator<String> iterator = keys.iterator();
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			MemberVo memberVo = memberDB.get(key);
			System.out.println("m_id : "+ memberVo.getM_id());
			System.out.println("m_pw : "+ memberVo.getM_pw());
			System.out.println("m_mail : "+ memberVo.getM_mail());
			System.out.println("m_phone : "+ memberVo.getM_phone());
		}
		
	}

}
