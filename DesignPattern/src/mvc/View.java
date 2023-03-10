package mvc;

import java.awt.Dimension;
import javax.swing.border.TitledBorder;
import javax.swing.*;


/**
 * View class for a MVC multi-program
 * 
 * @author Ryan Minneo - ashraf_sarhan
 * @version 1.0
 */
public class View
{
	public View()
	{
		//Create Views (View in MVC)
		JTextField searchBar = new JTextField(50);
		JButton searchButton = new JButton("Search");
		JTable tableView = new JTable();
		
		//Create Table Model (Model in MVC)
		Model tableModel = new Model();
		tableView.setModel(tableModel);
		
		//Create Controller (Controller in MVC)
		Controller controller = new Controller(searchBar, tableModel);
		searchButton.addActionListener(controller);
		
		//Set View Layout (The V in MVC)
		JPanel controlPanel = new JPanel();
		controlPanel.add(searchBar);
		controlPanel.add(searchButton);
		
		JScrollPane tableScroll = new JScrollPane(tableView);
		tableScroll.setPreferredSize(new Dimension(700, 182));
		tableScroll.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Grading Sheet", TitledBorder.CENTER, TitledBorder.TOP));
		
		JSplitPane tableSplit = new JSplitPane(JSplitPane.VERTICAL_SPLIT, controlPanel, tableScroll);
		tableSplit.setDividerLocation(35);
		tableSplit.setEnabled(false);
		
		//Display all of it in a scrolling window
		JFrame frame = new JFrame("Graded Sheet Using MVC");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(tableSplit);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
