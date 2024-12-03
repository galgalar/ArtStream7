
import javax.swing.*;
import java.awt.*;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.event.*;

public class CharcoalArtists extends DigitalArtists {

    protected JButton[] commissionCharcoal= new JButton[4];
    public CharcoalArtists()
    {
       label.setText("Charcoal Artists");
       String[] charcoalArtists = 
        {
            "Kashiefoun Kou",
            "Kafoi NakU",
            "Booringue Ayttie",
            "Miguel Duane"
        };       
        contents.removeAll();
        for (int i = 0; i < grids.length; ++i) 
        {
            
            profileLabels[i].setText(charcoalArtists[i]);            
            profileLabels[i].setVerticalTextPosition(SwingConstants.BOTTOM);
            profileLabels[i].setHorizontalTextPosition(SwingConstants.CENTER);

            // Update each grid
            grids[i] = new JPanel();
            grids[i].setLayout(new BorderLayout());
            grids[i].setBackground(Color.decode("#303765"));
            grids[i].add(profileLabels[i], BorderLayout.CENTER);

            // Create a new "View Profile" button
            commissionCharcoal[i] = new JButton("REQUEST COMMISSION");
            commissionCharcoal[i].addActionListener(this);
            commissionCharcoal[i].setBackground(Color.decode("#17224d"));
            commissionCharcoal[i].setForeground(Color.WHITE);
            commissionCharcoal[i].setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            grids[i].setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            grids[i].add(commissionCharcoal[i], BorderLayout.SOUTH);

            // Add the grid to the contents panel
            contents.add(grids[i]);
        }

        // Refresh the UI to display changes
        contents.revalidate();
        contents.repaint();

        // Set the visibility of the window
        setVisible(true);
        
        
        
        
       
    }
    
    
    @Override 
    public void actionPerformed(ActionEvent e)
    {
       Object source = e.getSource();
       
       if(source == acceptedButton)
       {
           new AcceptedCommissions();
           setVisible(false);
       }else if(source == pendingButton)
       {
           new PendingCommissions();
           setVisible(false);
       }else if(source == profileButton)
       {
           int choice = JOptionPane.showConfirmDialog(null,"Are you sure you want to log out?", "Confirm Log-Out",JOptionPane.YES_NO_OPTION);
           
           if(choice == JOptionPane.YES_OPTION)
           {
               new FirstFrame();           
               setVisible(false);
           }   
       }else if(source == commissionCharcoal[0] || source == commissionCharcoal[1] || source == commissionCharcoal[2] ||source == commissionCharcoal[3] )
       {
           new CommissionCharcoal();
         
       }else
       {
           new DashboardClient();
           setVisible(false);
       }
       
       
    }
    
    
    
    
}
