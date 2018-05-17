import java.util.Comparator;

public class Interval implements Comparator<Interval> {

	private int start;
	private int end;
	public Interval(int a,int b)
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
		 return "[ "+start+" , "+end+" ]";
	 }
	@Override
	public int compare(Interval a, Interval b) {
		if(a.getEnd()<b.getEnd())
		{
			return 1;
		}
		else if(a.getEnd()>b.getEnd())
			return -1;
		return 0;
		
	}
	
}
