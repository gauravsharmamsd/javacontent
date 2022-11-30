package self3;

public class SportsFactory {

	public static Sports GetSports(String sport) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		if(sport.equals("Cricket"))
			return new Cricket();
			else if(sport.equals("Hockey"))
				return new Hockey();
			else if(sport.equals("Kabaddi"))
				return new Kabaddi();
		
			return null;
			
		

			
	}

}
