import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class WelcomeHuman
	{
		static ArrayList <Human> theUser = new ArrayList <Human>();
		
		static Scanner stringInput = new Scanner(System.in);
		static Scanner intInput = new Scanner(System.in);
		
		//Get name
		static String userName;
		
		//Get height
		static double feetHeight;
		static double inchHeight;
		static int fullHeight;
		
		//Get difficulty and ski sizes
		static String userLevelChoice;
		static int userDifficulty;
		static int skiSizeLower;
		static int skiSizeUpper;
		
		//Get preference
		//static int userSkiPreference;
		static String userSkiType;
		
		//Get Brand
		static String userBrand;
		
		public static void welcomeUser()
		{
			
			JOptionPane.showMessageDialog(null, "Hello! Today you will be choosing skis for you according to what skiier you are! "
					+ "\nI am going to take some information from you, and from that I will choose what skis I think will fit you best.");
			
		}
		
		public static void recieveInformation()
		{	
			//Get the name
			//System.out.println("Please state your name:");
			userName = JOptionPane.showInputDialog("What is your name?");
			
			//Get height
			//HeightInput userHeight = new HeightInput();
			//userHeight.setVisible(true);
			
			
			JOptionPane.showMessageDialog(null, "Okay, I will ask for your height in feet and inches. Please put down feet first");
			feetHeight = Double.parseDouble(JOptionPane.showInputDialog("Feet:"));
			JOptionPane.showMessageDialog(null, "Now, add on inches");
			inchHeight = Double.parseDouble(JOptionPane.showInputDialog("Inches"));
			
			makeUserHeight();
			
			//Get Level
			String[] levelChoices = {"Beginner", "Intermediate / Advanced", "Expert"};
			userLevelChoice = (String) JOptionPane.showInputDialog(null, "What would you approximate yourself as?", "Select Level", JOptionPane.QUESTION_MESSAGE, null, levelChoices, levelChoices[0]);
			makeUserDifficulty();
			makeUserSkiLength();
			
			
			//Get preference
			String[] preferenceChoice = {"Piste", "All Mountain", "Freestyle", "Freeski"};
			//System.out.println("What type of skiing do you prefer? \n(1) Piste \n(2) All Mountain \n(3) Freestyle \n(4) Freeski");
			userSkiType = (String) JOptionPane.showInputDialog(null, "What type of skiing do you prefer?", "Select Ski Preference", JOptionPane.QUESTION_MESSAGE,null, preferenceChoice, preferenceChoice[0]);
			//makeUserPreference();
			
			//Get brand
			String[] brandChoice = {"Atomic", "Volkl", "K2", "Rossignol", "Nordica", "Faction", "No Preference"};
			//System.out.println("Do you have a brand you particularly like? \n(1) Atomic \n(2) Volkl \n(3) K2 \n(4) Rossignol \n(5) Nordica \n(6) Faction \n(7) No Preference");
			userBrand = (String) JOptionPane.showInputDialog(null, "Do you have a brand you particularly like?", "Select Brand", JOptionPane.QUESTION_MESSAGE, null, brandChoice, brandChoice[6]);
			
			//makeUserBrand();
			
			//Make the full person and return it
			makeEntireHuman();
			
			//Show the Human
			//showHuman();
			
			
		}
		
		public static void makeUserHeight()
		{
			
			double feetToCentimeters = feetHeight * 30.48;
			double inchToCentimeters = inchHeight * 2.54;
			
			fullHeight = (int)((feetToCentimeters) + (inchToCentimeters));
				
		}
		
		public static void makeUserDifficulty()
		{
			
			switch (userLevelChoice)
			{
			
			case "Beginner":
				userDifficulty = 1;
				break;
				
			case "Intermediate / Advanced":
				userDifficulty = 2;
				break;
				
			case "Expert":
				userDifficulty = 3;
				break;
			
			}
			
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
		
		
		/*public static void makeUserPreference()
		{
			
			switch (userSkiPreference)
			{
			case 1:
				userSkiType = "Piste";
				break;
				
			case 2:
				userSkiType = "All Mountain";
				break;
			
			case 3:
				userSkiType = "Freestyle";
				break;
				
			case 4:
				userSkiType = "Freeski";
				break;
			
			}
			
		}*/
		
		/*public static void makeUserBrand()
		{
			
			switch (brandChoice)
			{
			
			case 1:
				userBrand = "Atomic";
				break;
			
			case 2:
				userBrand = "Volkl";
				break;
			
			case 3: 
				userBrand = "K2";
				break;
				
			case 4:
				userBrand = "Rossignol";
				break;
				
			case 5:
				userBrand = "Nordica";
				break;
				
			case 6: 
				userBrand = "Faction";
				break;
				
			case 7:
				userBrand = "No Preference";
				break;
			
			}
		}*/
		
		public static void makeEntireHuman()
		{
			
			theUser.add(new Human("",0,0,"","",0));
			
			theUser.get(0).setName(userName);
			theUser.get(0).setHeight(fullHeight);
			theUser.get(0).setLevel(userDifficulty);
			theUser.get(0).setTerrainPreference(userSkiType);
			theUser.get(0).setBrand(userBrand);
			theUser.get(0).setSkiSize(fullHeight);
		}
		
		public static void showHuman()
		{
			
			System.out.println(theUser.get(0).getName());
			System.out.println(theUser.get(0).getHeight());
			System.out.println(theUser.get(0).getLevel());
			System.out.println(theUser.get(0).getTerrainPreference());
			System.out.println(theUser.get(0).getBrand());
			System.out.println(theUser.get(0).getSkiSize());
			
		}
		
		public static void giveSkiSizeRecommendation()
		{
			
			JOptionPane.showMessageDialog(null, theUser.get(0).getName() + ", I also think that in choosing these skis, that you get them in the ski length range from " + skiSizeLower + "cm to " + skiSizeUpper + "cm.");
			
		}
		
		

	}
