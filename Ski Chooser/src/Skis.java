
public class Skis
	{
		
		private String brand;
		private String name;
		private int level;
		private boolean twinTip;
		private String skiType;
		
		public Skis (String b, String n, int lvl, boolean twin, String t)
		{
			brand = b;
			name = n;
			level = lvl;
			twinTip = twin;
			skiType = t;
		}

		public int getLevel()
			{
				return level;
			}

		public void setLevel(int level)
			{
				this.level = level;
			}

		public String getBrand()
			{
				return brand;
			}

		public void setBrand(String brand)
			{
				this.brand = brand;
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public boolean isTwinTip()
			{
				return twinTip;
			}

		public void setTwinTip(boolean twinTip)
			{
				this.twinTip = twinTip;
			}

		public String getSkiType()
			{
				return skiType;
			}

		public void setSkiType(String skiType)
			{
				this.skiType = skiType;
			}


		
	}
