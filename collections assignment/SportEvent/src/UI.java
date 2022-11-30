

	import java.util.Scanner;

	public class UI {

		private static SportsEvent sportsEvent = new SportsEvent();
		private static Scanner sc = new Scanner(System.in);
		public static void main(String[] args) {
			displayMenu();
		}
		private static void displayMenu() {
			while(true) {
				System.out.println("1 Register Player");
				System.out.println("2 Add Sport");
				System.out.println("3 Create Schedule");
				System.out.println("4 Dispaly Details for a Day");
				System.out.println("5 Dispaly Details for a Player");
				System.out.println("6 Dispaly Details for a Sport");
				System.out.println("7 Exit");
				int choice = sc.nextInt();
				switch(choice) {
				case 1: registerPlayer(); break;
				case 2: addSport(); break;
				case 3: createSchedule(); break;
				case 4: displayDayWise(); break;
				case 5: displayPlayerWise(); break;
				case 6: displaySportWise(); break;
				case 7: System.exit(1);
				default : System.out.println("Invalid Choice");
				}
			}
		}
		private static void displaySportWise() {
			// TODO Auto-generated method stub
			
		}
		private static void displayPlayerWise() {
			// TODO Auto-generated method stub
			
		}
		private static void displayDayWise() {
			// TODO Auto-generated method stub
			
		}
		private static void createSchedule() {
			// TODO Auto-generated method stub
			
		}
		private static void addSport() {
			System.out.println("Enter No of Player");
			int no=sc.nextInt();
			System.out.println("Enter name of gme");
			String st=sc.next();
			sportsEvent.addSport(st, no);
			// TODO Auto-generated method stub
			
		}
		private static void registerPlayer() {
			//Get Player Name from user
			System.out.println("Enter Name");
			String playerName = sc.next();
			//Ask how many games he would like  to participate
			System.out.println("How many sports ?");
			int no = sc.nextInt();
			//Get names of sports he wants to play
			String[] sportNames= new String[no];
			for(int i=0; i< no; i++) {
				System.out.println("Enter name of the Sport");
				String sportName = sc.next();
				sportNames[i] = sportName;
			}
			//call sportsEvent.registerPlayer()
			sportsEvent.registerPlayer(playerName, sportNames);
			
		}

	}