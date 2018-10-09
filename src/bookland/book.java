package bookland;

public class book {

	public static void main(String[] args) {
	}
		
		int np,cp;
		String title,author,publiser;
		public book(int tp,int cup,String t,String a,String p)
		{
			np=tp;
			cp=cup;
			title=t;
			author=a;
			publiser=p;
		}
		public boolean isopen(int cp)
		{
			if(cp!=0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
		public boolean isclose(int cp)
		{
			if (cp==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		public int open()
		{
			cp=1;
			return cp;
		}
		public int open(int pg)
		{
			cp=pg;
			return cp;
		}
		public int close()
		{
			cp=0;
			return cp;
		}
		public int turnl(int pg)
		{
			cp=cp+pg;
			return cp;
		}
		public int turnr(int pg)
		{
			cp=cp-pg;
			return cp;
		}
		
		// TODO Auto-generated method stub

	

}
