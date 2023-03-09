package singleton;
/**
 * This class creates a singletonObj and only allows one instance of the object to occur by creating a private constructor and a public static getInstance method.
 * 
 * @author Ryan Minneo
 * @version - 1.0
 */
public class SingletonDesign 
{
	private static SingletonDesign singletonObj = null;
	private int numbah;
	
	/**
	 * Private constructor for the singletonObj, this will only be able to be called inside of this class.
	 */
	private SingletonDesign()
	{
		this.numbah = 0;
	}
	
	
	/**
	 * This method checks to see if there is an instance of the singletonObj created yet. If there is not a singletonObj created yet then it will call the private constructor above. If there already is a singletonObj, then the second object will be set to the same instance.
	 * 
	 * @return singletonObj - the only instance of a SingletonDesign
	 */
	public static SingletonDesign getInstance()
	{
		if (singletonObj == null)
		{
			singletonObj = new SingletonDesign();
		}
		
		return singletonObj;
	}
	
	
	/**
	 * Classic getter, retrieves the numbah variable from the instance of SingletonDesign
	 * 
	 * @return numbah - the numbah
	 */
	public int getNumbah()
	{
		return numbah;
	}
	
	/**
	 * Classic setter, sets the numbah variable from the instance to the int inputted into the method.
	 * @param x - the inputted number which will become the new numbah variable for the instance.
	 */
	public void setNumbah(int x)
	{
		numbah = x;
	}
	
}
