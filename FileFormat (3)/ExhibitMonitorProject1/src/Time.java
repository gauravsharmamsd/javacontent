import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
	public static FileDescription fDesc=new FileDescription();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm");
		String currentTime = dateFormat.format(date);
		System.out.println("Current Time :: " + currentTime);
//		SimpleDateFormat dateFormat1 = new SimpleDateFormat("hh:mm");
		String timeOfArrival = fDesc.getTimeToArrive();
		Date time1;
		Date time2;

		try {
			time1 = dateFormat.parse(currentTime);
			time2 = dateFormat.parse(timeOfArrival);
			int comp=time1.compareTo(time2);
			System.out.println(time1+" time1 "+time2+" time2");
			System.out.println("compare "+comp);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
