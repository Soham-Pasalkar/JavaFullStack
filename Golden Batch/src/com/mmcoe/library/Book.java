package com.mmcoe.library;

public class Book {
	private String title;
	private Member mbr;
	
	
	public Book(String title) {
		super();
		this.title = title;
	}

	public String toString() {
		return "Book [Title=" + title + "]";
	}
	
	public Member getMbr() {
		return mbr;
	}

	public void setMbr(Member mbr) {
		this.mbr = mbr;
	}

	public void status() {
		if(mbr == null)
			System.out.println(title + "not issued by any member");
		else
			System.out.println(title + "is issued to "+ mbr);
		
	}
	

}
