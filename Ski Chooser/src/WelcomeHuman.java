import java.util.ArrayList;
import java.util.Scanner;

public class WelcomeHuman
	{
		static ArrayList <Human> theUser = new ArrayList <Human>();
		
		static Scanner stringInput = new Scanner(System.in);
		static Scanner intInput = new Scanner(System.in);
		
		static String userName;
		
		static double feetHeight;
		static double inchHeight;
		static int fullHeight;
		
		static int userDifficulty;
		static int skiSizeLower;
		static int skiSizeUpper;
		
		static int userSkiPreference;
		
		public static void welcomeUser()
		{
			
			System.out.println("Hello! Today you will be chosen skis according to who you are! "
					+ "\nI am going to take some infromation from you, and from that I will choose what skis I think will fit you best.");
			
		}
		
		public static void recieveInformation()
		{	
			//Get the name
			System.out.println("Please state your name:");
			userName = stringInput.nextLine();
			
			//Get height
			System.out.println("Okay, I will ask for your height in feet and inches. Please put down feet first");
			feetHeight = intInput.nextInt();
			System.out.println("Now, add on inches");
			inchHeight =  intInput.nextInt();
			makeUserHeight();
			
			//Get Level
			System.out.println("When you ski, what level of skiing would you approximate yourself as? \n(1) Beginner \n(2) Intermediate / Advanced\n(3) Expert");
			userDifficulty = intInput.nextInt();
			makeUserSkiLength();
			
			//Get preference
			System.out.println("What type of skiing do you prefer? \n(1) Piste \n(2) All Mountain \n(3) Freestyle \n(4) Freeski \n(5)I do not know what these mean...");
			
			
		}
		
		public static void makeUserHeight()
		{
			
			double feetToCentimeters = feetHeight * 30.48;
			double inchToCentimeters = inchHeight * 2.54;
			
			fullHeight = (int)((feetToCentimeters) + (inchToCentimeters));
				
		}
		
		public static void makeUserSkiLength()
		{
			if (userDifficulty == 1)
				{
					skiSizeLower = fullHeight - 20;
					skiSizeUpper = fullHeight - 15;
				}
			
			else if (userDifficulty == 2)
				{
					skiSizeLower = fullHeight - 15;
					skiSizeUpper = fullHeight - 10;
				}
			else if (userDifficulty == 3)
				{
					skiSizeLower = fullHeight - 10;
					skiSizeUpper = fullHeight + 5;
				}
		}

	}
