public class Ex3
{
	static public void main (String [] args)
	{
		float i =0, y=0;
		for(String x : args) {
			float n = Float.parseFloat(x);
			i = i+n;
			y++;			
		}
		System.out.print("Media: "+ (i/y));
	}
}