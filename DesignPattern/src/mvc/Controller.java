package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * Controller class for an MVC multi-program
 * 
 * @author Ryan Minneo - ashraf_sarhan
 * @version 1.0
 */
public class Controller implements ActionListener 
{
	private JTextField searchBar = new JTextField(30);
	private DefaultTableModel model;
	
	public Controller(JTextField searchBar, DefaultTableModel model) 
	{
		super();
		this.searchBar = searchBar;
		this.model = model;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String searchTerm = searchBar.getText();
		
		if (searchTerm != null && !(searchTerm.equals("")))
		{
			Object[][] newData = new Object[Constants.DATA.length][];
			int index = 0;
			
			for (Object[] o: Constants.DATA)
			{
				if (!(searchTerm.trim()).equals("*")) 
				{
					newData[index++] = o;
				}
				else
				{
					if (String.valueOf(o[0]).startsWith(searchTerm.toUpperCase().trim())) 
					{ 
						newData[index++] = o;
					}
				}
			}
			model.setDataVector(newData, Constants.TABLE_HEADER);
		}
		else
		{
			JOptionPane.showMessageDialog(null,  "Search Bar is blank", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}
