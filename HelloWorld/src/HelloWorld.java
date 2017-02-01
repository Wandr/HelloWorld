
public class HelloWorld {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		int chicken = SimpleAddition(5, 10);
		int soup = SimpleSubraction(7, 4);
		
		System.out.println("The answer is: " + chicken + " JKJK it's " + soup);
		
		return;
	}
	
	static int SimpleAddition(int x, int y)
	{
		return x + y;
	}
	
	static int SimpleSubraction(int x, int y)
	{
		return x - y;
	}

}
