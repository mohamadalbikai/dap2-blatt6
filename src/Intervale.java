
public class Intervale {

	private int start;
	private int end;
	public Intervale(int a,int b)
	{
		try {
			if(a<b)
			{
				start=a;
				end=b;
			}
			else 
				throw new IllegalArgumentException();
		}catch(Exception e)
		{
			System.out.println("der Interval war falsch : die war kleiner als Anfang");
			throw new IllegalArgumentException();
		}
	}
	public int getStart() 
	{
		return start;
	}
	 public int getEnd() 
	 {
		 return end;
	 }
	 public String toString()
	 {
		 return "";
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("ich bin hier ");
	}

}
