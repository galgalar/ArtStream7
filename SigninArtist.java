

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SigninArtist extends SigninClient implements ActionListener, ItemListener
{
    
    
    public SigninArtist() 
    {

        setVisible(true);
    }
    
     @Override
    public void itemStateChanged(ItemEvent e)
    {
        Object source = e.getItem();
        if(source == rememberMeCheckbox)
        {
            if(e.getStateChange() == ItemEvent.SELECTED)
            {
                //STORE DATA
            }else
            {
               //
            }
        }
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
       Object source = e.getSource();
       
       if(source == signinButton)
       {
           JOptionPane.showMessageDialog(null,"Login Successfully!");
           new DashboardAdmin();
           setVisible(false);
       }else if(source == goBack)
       {
           new SetupAccountArtist();
           setVisible(false);
       }
       
    
    }
    
    
    
    
    
}