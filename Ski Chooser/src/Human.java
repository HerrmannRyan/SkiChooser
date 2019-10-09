
public class Human
	{

		private String name;
		private int height;
		private int level;
		private String terrainPreference;
		private String brand;
		private int skiSize;

		public Human(String n, int h, int l, String p, String b, int sS)
			{
				name = n;
				height = h;
				level = l;
				terrainPreference = p;
				brand = b;
				skiSize = sS;
			}

		public int getSkiSize()
			{
				return skiSize;
			}

		public void setSkiSize(int skiSize)
			{
				this.skiSize = skiSize;
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

		public String getTerrainPreference()
			{
				return terrainPreference;
			}

		public void setTerrainPreference(String terrainPreference)
			{
				this.terrainPreference = terrainPreference;
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
