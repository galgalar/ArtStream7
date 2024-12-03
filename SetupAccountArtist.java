

import javax.swing.*;
import java.awt.*;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.event.*;

public class SetupAccountArtist extends SetupAccountClient implements ActionListener {

    public SetupAccountArtist() 
    {
        setupLabel.setText("Setup your account as an Artist");
        setVisible(true);
    }

   @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        String command = e.getActionCommand();
        
        
        if(command.equals("signin"))
        {
            card.show(secondMain,command);
        }else if(command.equals("register"))
        {
            card.show(secondMain,command);    
        }
    
       if(source == registerButton)
       {
           String username = usernameFieldRegister.getText();
           char[] pass = passwordFieldRegister.getPassword();
           char[] confirmPass = confirmPasswordFieldRegister.getPassword();
           String password = "",confirmPassword = "";
           
           
           for(int i = 0;i < pass.length; ++i)
           {
               password += pass[i];
           }
           for(int i = 0;i < confirmPass.length; ++i)
           {
               confirmPassword += confirmPass[i];
           }
           
           if(password.equals(confirmPassword))
           {
               new Artists(username,password);
               JOptionPane.showMessageDialog(null,"Account created successfully!");
               
               card.show(secondMain,"signin");   
               
              
           }
           else
           {
               passwordFieldRegister.setText(""); 
               confirmPasswordFieldRegister.setText(""); 
               JOptionPane.showMessageDialog(null,"The password should match");
           }
  
           
       }else if(source == goBack)
       {
           new FirstFrame();
           setVisible(false);
       }else if(source == signinButton)
       {
           JOptionPane.showMessageDialog(null,"Login Successfully!");
           new DashboardArtist((String)usernameFieldRegister.getText());
           setVisible(false);
       }
        
    }  
    
    
        
  
    
        
}