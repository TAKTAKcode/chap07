package com.greedy.section02.uses;

public class MemberRegistManager {
	
	public void regist(MemberDTO[] members) {
		
		System.out.println("회원을 등록합니다.");
		
		for(int i = 0; i < members.length; i++) {
			System.out.println(members[i].getName() + "님을 회원 등록하였습니다.");
		}
		
		System.out.println("총 " + members.length + "명의 회원을 등록하는데 성공하였습니다!");
	}

}
