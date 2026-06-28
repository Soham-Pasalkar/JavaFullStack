package ipl_assignment;

public class IPL {
	public static void main(String[] args) {
		
		Player rcb1 = new Player("Virat Kohli", 20);
		Player rcb2 = new Player("AB Devilliers", 16);
		Player rcb3 = new Player("Chris Gayle", 8);
		Player rcb4 = new Player("Dayle Steyn", 8);
		Player rcb5 = new Player("Bhuvneshwar Kumar", 8);
		Player rcb6 = new Player("Dinesh Karthik", 6);
		Player rcb7 = new Player("Yuzvendra Chahal", 6);
		Player rcb8 = new Player("Mohammed Siraj", 2);
		Player rcb9 = new Player("Rajat Patidar", 2);
		Player rcb10 = new Player("Krunal Pandya", 2);
		Player rcb11 = new Player("Suyash Sharma", 1);
		
		Team T1 = new Team("Royal Challengers Banglore");
		T1.addPlayer(rcb1);
		T1.addPlayer(rcb2);
		T1.addPlayer(rcb3);
		T1.addPlayer(rcb4);
		T1.addPlayer(rcb5);
		T1.addPlayer(rcb6);
		T1.addPlayer(rcb7);
		T1.addPlayer(rcb8);
		T1.addPlayer(rcb9);
		T1.addPlayer(rcb10);
		T1.addPlayer(rcb11);
		
		T1.showPlayers();
		System.out.println("  ");
		
		//-----------------------------------------------------
		
		Player csk1 = new Player("MS Dhoni", 18);
		Player csk2 = new Player("Ravinda Jadeja", 8);
		Player csk3 = new Player("Shardul Thakur", 6);
		Player csk4 = new Player("Deepak Chahar", 6);
		Player csk5 = new Player("Shane Watson", 8);
		Player csk6 = new Player("Ravi Ashwin", 8);
		Player csk7 = new Player("Ambati Rayudu", 6);
		Player csk8 = new Player("Sanju Samson", 10);
		Player csk9 = new Player("Ruturaj Gaikwad", 7);
		Player csk10 = new Player("Shivam Dube", 6);
		Player csk11 = new Player("Matt Henry", 7);
		
		Team T2 = new Team("Chennai Super Kings");
		T2.addPlayer(csk1);
		T2.addPlayer(csk2);
		T2.addPlayer(csk3);
		T2.addPlayer(csk4);
		T2.addPlayer(csk5);
		T2.addPlayer(csk6);
		T2.addPlayer(csk7);
		T2.addPlayer(csk8);
		T2.addPlayer(csk9);
		T2.addPlayer(csk10);
		T2.addPlayer(csk11);
		
		T2.showPlayers();
		System.out.println("  ");
		
		//-------------------------------------------------------
		
		Player mi1 = new Player("Rohit Sharma", 15);
		Player mi2 = new Player("Surya Kumar Yadav", 8);
		Player mi3 = new Player("Ishan Kishan", 8);
		Player mi4 = new Player("Hardik Pandya", 8);
		Player mi5 = new Player("Quinton DeCock", 8);
		Player mi6 = new Player("Jaspreet Bumrah", 15);
		Player mi7 = new Player("Trent Boult", 8);
		Player mi8 = new Player("Jofra Archer", 3);
		Player mi9 = new Player("Tilak Verma", 2);
		Player mi10 = new Player("Mitchell Santner", 2);
		Player mi11 = new Player("Mayank Markande", 1);
		
		Team T3 = new Team("Mumbai Indians");
		T3.addPlayer(mi1);
		T3.addPlayer(mi2);
		T3.addPlayer(mi3);
		T3.addPlayer(mi4);
		T3.addPlayer(mi5);
		T3.addPlayer(mi6);
		T3.addPlayer(mi7);
		T3.addPlayer(mi8);
		T3.addPlayer(mi9);
		T3.addPlayer(mi10);
		T3.addPlayer(mi11);
		
		T3.showPlayers();
		System.out.println("  ");
		
		//-------------------------------------------------------
		
		
		
	}
	
}
