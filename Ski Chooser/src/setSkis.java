import java.util.ArrayList;

public class setSkis
	{
		static ArrayList <Skis> theSkis = new ArrayList <Skis>();
		
		public static void makeSkis()
		{
			
			theSkis.add(new Skis ("Atomic", "Redster", 3, false, "Piste"));
			theSkis.add(new Skis ("Atomic", "Redster X", 2, false, "Piste"));
			theSkis.add(new Skis ("Atomic", "Savor", 1, false, "Piste"));
			theSkis.add(new Skis ("Atomic", "Vantage", 2, false, "All Mountain"));
			theSkis.add(new Skis ("Atomic", "Bent Chetler", 3, true, "Freeski"));
			theSkis.add(new Skis ("Atomic", "Punx", 3, true, "Freestyle"));
			theSkis.add(new Skis ("Atomic", "Backland", 3, true, "Freeski"));
			theSkis.add(new Skis ("Volkl", "Deacon", 1, false, "Piste"));
			theSkis.add(new Skis ("Volkl", "Mantra", 3, false, "Freeski"));
			theSkis.add(new Skis ("Volkl", "Revolt", 3, true, "Freestyle"));
			
			
		}
		
		
		
	}
