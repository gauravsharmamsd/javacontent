import self3.Cricket;

public class Format  {

	public static Sports getGameFormat(String format) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Sports game = (Sports)Class.forName(format).newInstance();
		return game;
	}

}
