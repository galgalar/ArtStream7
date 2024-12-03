

import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;


public class CommissionPortrait extends CommissionDigital  {
     @Override
    public void itemStateChanged(ItemEvent e)
    {
       Object source = e.getItem();
       
      
       if(source == mediumList)
       {
           
       }else
       {
           totalSize = 0;
           
           if(e.getStateChange()== ItemEvent.SELECTED)
           {
                JRadioButton selectedButton = (JRadioButton) e.getItem();
                if(selectedButton.getText().equals("Adobe Photoshop - ₱1000.00"))
                    totalSize = 1000.00;
                else if(selectedButton.getText().equals("Corel Painter - ₱1900.00"))
                    totalSize = 1900.00;
                else if(selectedButton.getText().equals("Procreate - ₱2500.00"))
                    totalSize = 2500.00;
                    
           }
        System.out.print(totalSize);
       }
        
       
       
       
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
      Object source = e.getSource();
        
        totalSummary = totalSize + totalMedium;
         nameGet = nameField.getText();
         emailGet = emailField.getText();
         contactGet = contactField.getText();
         subjectGet = subjectMatterField.getText();
         mediumGet = (String)mediumList.getSelectedItem();
         sizeGet = ""+totalSize;
        
        
        String lol = "Commission Summary\nName: "+nameField.getText()+"\nEmail: "+emailField.getText()+"\nContact: "+contactField.getText()+"\nSubject Matter: "+subjectMatterField.getText()+"\nMedium: "+mediumList.getSelectedItem()+"\nSize: "+totalSize+"\nTotal: "+totalSummary;
        
        
        
        if(source == submit)
        {           
            JOptionPane.showMessageDialog(null,lol);
            nameField.setText("");
            emailField.setText("");
            contactField.setText("");
            subjectMatterField.setText("");
            mediumList.setSelectedIndex(0);
            sizeChoice.clearSelection();       
            new PendingCommissions("Portrait",nameGet,emailGet,contactGet,subjectGet,mediumGet,sizeGet,totalSummary);
            setVisible(false);
            
        }
    }
    
}
