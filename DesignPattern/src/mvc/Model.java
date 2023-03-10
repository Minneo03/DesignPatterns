package mvc;

import javax.swing.table.DefaultTableModel;
 
/**
 * The model class for an MVC multi-program
 * 
 * @author Ryan Minneo ashraf_sarhan
 * @version 1.0
 */
@SuppressWarnings("serial")
public class Model extends DefaultTableModel 
{
    public Model() 
    {
        super(Constants.DATA, Constants.TABLE_HEADER);
    }
 
}