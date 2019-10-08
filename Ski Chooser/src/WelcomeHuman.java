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
		
		public static void welcomeUser()
		{
			
			System.out.println("Hello! Today you will be chosen skis according to who you are! "
					+ "\nI am going to take some infromation from you, and from that I will choose what skis I think will fit you best.");
			
		}
		
		public static void recieveInformation()
		{			
			System.out.println("Please state your name:");
			userName = stringInput.nextLine();
			System.out.println("Okay, I will ask for your height in feet and inches. Please put down feet first");
			feetHeight = intInput.nextInt();
			System.out.println("Now, add on inches");
			inchHeight =  intInput.nextInt();
			makeUserHeight();
			System.out.println();
			
			
		}
		
		public static void makeUserHeight()
		{
			
			double feetToCentimeters = feetHeight * 30.48;
			double inchToCentimeters = inchHeight * 2.54;
			
			fullHeight = (int)((feetToCentimeters) + (inchToCentimeters));
			
			
		}

	}
