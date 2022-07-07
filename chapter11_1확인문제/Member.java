package chapter11_1확인문제;

import java.util.Objects;

public class Member {
	private String id;
	private String name;
	
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return id + ": "+ name;
	}


	 
	
	

}
