package com.mmcoe.library;

public class Member {
	private String Name;
	private Book bk;
	
	public Member(String Name) {
		this.Name = Name;
	}

	@Override
	public String toString() {
		return "Member [Name = " + Name + " ]";
	}
	
	public void Status() {
		if(bk == null) {
			System.out.println(Name + "has no book issued");
		}
		else {
			System.out.println(Name + "has issued" + bk);
		}
	}
	
}
