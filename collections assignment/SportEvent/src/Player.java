import java.util.Arrays;

public class Player {
	private String[] gameNames;
	private String name;
	
	public Player(String[] gameNames, String name) {
		super();
		this.gameNames = gameNames;
		this.name = name;
	}
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Player [gameNames=" + Arrays.toString(gameNames) + ", name=" + name + "]";
	}
	public String[] getGameNames() {
		return gameNames;
	}
	public void setGameNames(String[] gameNames) {
		this.gameNames = gameNames;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}