
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author polep
 */
public class starting {
    public static void main(String args[])
    {
        try{
        Loading ob=new Loading();
               ob.setup();
           ob.setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
