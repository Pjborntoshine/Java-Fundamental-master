package Oops_4;

public class Player {
	private String player;
	private char symbol;
	public Player(String player, char symbol) {
		super();
		setPlayer(player);
		setSymbol(symbol);
	
	}
	public String getPlayer() {
		return player;
	}
	public void setPlayer(String player) {
		if(!player.isEmpty()) {
			this.player = player;
		}
		
	}
	public char getSymbol() {
		return symbol;
	}
	public void setSymbol(char symbol) {
		if(symbol!='\0') {
			this.symbol = symbol;
		}
		
	}
	
	
}
