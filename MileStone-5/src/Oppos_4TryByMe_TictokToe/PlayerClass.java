package Oppos_4TryByMe_TictokToe;

public class PlayerClass {
	private String name;
	private char symbol;
	public PlayerClass(String name, char symbol) {
		super();
		setName(name);
		setSymbol(symbol);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == null) {
			System.out.println("name is null");
			return;
		}
		this.name = name;
	}
	public char getSymbol() {
		return symbol;
	}
	public void setSymbol(char symbol) {
		if(symbol == '\0') {
			System.out.println(" symvol is null");
		}
		this.symbol = symbol;
	}
	
}
