
public class LogicForChoosing
	{
		
		//Find the code for difficulty first.
		
		public static void logicForChoosing()
		{
			findSameLevel();
			
		}
		
		public static void findSameLevel()
		{
			int userLevel = WelcomeHuman.theUser.get(0).getLevel();
			
			
			for (int i = setSkis.theSkis.size() - 1; i >= 0; i--)
				{
					
					int skiLevel = setSkis.theSkis.get(i).getLevel();
					
					if (userLevel != skiLevel)
						{
							setSkis.theSkis.remove(i);
						}
					
				}
			
			System.out.println("Your remaining skis are:");
			for(Skis s: setSkis.theSkis)
				{
					System.out.println(s.getName());
				}
			
		}
		
		
	}
