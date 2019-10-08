
public class Human
	{
		
		private String name;
		private int height;
		private int level;
		private String preference;
		private String brand;
		
		public Human(String n, int h, int l, String p, String b)
		{
			name = n;
			height = h;
			level = l;
			preference = p;
			brand = b;
		}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public int getHeight()
			{
				return height;
			}

		public void setHeight(int height)
			{
				this.height = height;
			}

		public int getLevel()
			{
				return level;
			}

		public void setLevel(int level)
			{
				this.level = level;
			}

		public String getPreference()
			{
				return preference;
			}

		public void setPreference(String preference)
			{
				this.preference = preference;
			}

		public String getBrand()
			{
				return brand;
			}

		public void setBrand(String brand)
			{
				this.brand = brand;
			}
		
		
		
	}
