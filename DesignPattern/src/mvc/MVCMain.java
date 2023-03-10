package mvc;

import javax.swing.SwingUtilities;

/**
 * Main class for a few programs relating to a MVC Design Pattern
 * 
 * @author Ryan Minneo - ashraf_sarhan 
 * @Version 1.0
 */
public class MVCMain
{
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try
				{
					createAndShowGUI();
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void createAndShowGUI() throws Exception
	{
		new View();
	}
}
