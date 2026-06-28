package ipl_assignment;

public class Team extends Player {
	public String team_name;
	public Player[] players;
	public int budget; // in Cr
	public int i = 0;

	public Team(String team_name) {
		this.team_name = team_name;
		this.budget = 80;
		players = new Player[11];
	}

	//----------------------------------------------------------
	public void addPlayer(Player p) {
		if (i < 11) {
			int check = p.getPrice();
			if ((budget - check) >= 0) {
				budget = budget - check;
				players[i] = p;
				i += 1;
			}
			else {
				System.out.println("Not enough Budget Left");
			}
		}
	}
	
	//-----------------------------------------------------------
	public void showPlayers() {
		System.out.println("Team : " + team_name + "->");
		for(int j = 0; j < i; j++) {
			System.out.println("     " + players[j]);
		}
		System.out.println("Budget : " + (80 - budget));
	}
	
}
