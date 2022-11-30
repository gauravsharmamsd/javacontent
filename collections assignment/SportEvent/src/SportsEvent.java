import java.util.ArrayList;

public class SportsEvent {

	private Player[] players;
	private Sport[] sports;
	private DaySchedule[] schdules;
	
	//1. Register Player
	public void registerPlayer(String playerName, String[] games) {
		
		Player p = new Player(games,playerName);
		
		players=new Player[4];
		for(Player s:players) {
			System.out.println(s);
		}
		//TODO
		//Store the newly player into players array 
		
	}
	//2.AddSport
	public void addSport(String gamName, int no) {
		Sport s=new Sport(gamName,no);
		sports=new Sport[no];
		for(Sport s1: sports) {
			System.out.println(s1);
		}
		//TODO
	}
	//3. CreateSchedule
	public void createSchedule(String dayName, String[] gameNames) {
		//TODOes[i] = sportName;Search Sport from array of sports for each of the gameName 
		//Create that array of Sport and pass i to constructor of DaySchdule  Class
		//1. Create DaySchdule and Store that into array
		
	}
	//4. DisplayDayWise
	public String displayDayWiseSchedule(String dayName) {
		return null;
	}
	//5. DisplayGameWise
	public String displayGameWiseSchedule(String gameName) {
		return null;
	}
	//6. DisplayPlayerwise
	public String displayPlayerWiseSchedule(String playerName) {
		return null;
	}
}