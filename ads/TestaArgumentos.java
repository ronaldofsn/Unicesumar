public class TestaArgumentos
{
	static public void main (String [] args)
	{
		System.out.print("O programa foi executado com os parametros:\n");
		
		for(String arg : args) {
			System.out.println(arg);
		}
	}
}