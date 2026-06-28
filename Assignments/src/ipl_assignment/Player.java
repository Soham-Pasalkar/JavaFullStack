package ipl_assignment;

public class Player {
	public String name;
	public int bid;

	public Player() {
		super();	
	}
	
	public Player(String name, int bid) {
		this.name = name;
		this.bid = bid;
	}
	
	
	@Override
	public String toString() {
		
		return "Player [Name = " + name + ", Price = " + bid + "Cr ]";
	}

	public int getPrice() {
		return bid;
	}
	
	public void showPrice() {
		System.out.println("Price : " + bid + "Cr");
	}

}
