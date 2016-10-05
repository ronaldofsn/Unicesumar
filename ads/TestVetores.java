public class TestVetores
{
	static public void main(String[] args)
	{
		int [] numbers = {10,20,30,40,50};
		
		for (int x: numbers){
			System.out.print(x);
			System.out.print(",");
		}
		System.out.print("\n");
		String [] names ={"James", "Larry", "Moises", "BRR"};
		
		for(String name : names){
			System.out.print(name);
			System.out.print(",");
		}
	}
}