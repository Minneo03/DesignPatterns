package singleton;
/**
 * Just testing to see how Singletons work, this class simply contains the main method used to test for if the singleton works.
 * 
 * @author Ryan Minneo
 * @version 1.0
 */
public class SingletonDesignTester 
{
	public static void main(String[] args)
	{
		SingletonDesign firstInst = SingletonDesign.getInstance();
		SingletonDesign secondInst;
		
		firstInst.setNumbah(30);
		
		System.out.println(firstInst.getNumbah());
		
		secondInst = SingletonDesign.getInstance();
		
		secondInst.setNumbah(15);
		
		System.out.println(firstInst.getNumbah());
		System.out.println(secondInst.getNumbah());
	}
}
