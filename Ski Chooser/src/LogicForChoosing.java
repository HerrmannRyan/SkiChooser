import javax.swing.JOptionPane;

public class LogicForChoosing
	{
		

		static boolean continueToNext = true;
		
		//Find the code for difficulty first.
		
		public static void logicForChoosing()
		{
			//Remove the skis by importance
			
				findSameLevel();
				checkArraylistSize();
				if (continueToNext)
				{
					findSamePreference();
				}
				showFinalSkis();
				
			
		}
		
		public static void findSameLevel()
		{
			int userLevel = WelcomeHuman.theUser.get(0).getLevel();
			
			
			for (int i = setSkis.theSkis.size() - 1 ; i >= 0; i--)
				{
					
					int skiLevel = setSkis.theSkis.get(i).getLevel();
					
					if (userLevel != skiLevel)
						{
							setSkis.theSkis.remove(i);
						}
					
				}
			
		}
		
		public static void findSamePreference()
		{
			
			String preference = WelcomeHuman.theUser.get(0).getTerrainPreference();
			
			for (int i = setSkis.theSkis.size() - 1; i >= 0; i-- )
			{
				String typeOfSkis = setSkis.theSkis.get(i).getSkiType();
				
				if (preference.equals(typeOfSkis))
				{
				}
				else
				{
					setSkis.theSkis.remove(i);
				}
			}
			
			
		}
		
		public static void checkArraylistSize()
		{
			
			int skiArraySize = setSkis.theSkis.size();
			
			if (skiArraySize <= 2)
			{
				continueToNext = false;
			}
			else
			{
				continueToNext = true;
			}
			
		}
		
		public static void showFinalSkis()
		{
			JOptionPane.showMessageDialog(null, "The Skis that I think you would like are: " ); 
			for(Skis f: setSkis.theSkis)
			{
				JOptionPane.showMessageDialog(null, f.getBrand() + " " + f.getName());
			}

		}
		
		
	}
