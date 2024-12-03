
import javax.swing.*;
import java.awt.*;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.event.*;

public class PortraitArtists extends LandscapeArtists {
    
    protected JButton[] commissionPortrait= new JButton[4];
    
    public PortraitArtists()
    {
        label.setText("Portrait Artists");
        String[] landscapeArtists = 
        {
            "Gojo Saturo",
            "Yuji Itadori",
            "Nobara Kugisaki",
            "Megumi Fushiguro"
        };   
        
        contents.removeAll();
        for (int i = 0; i < grids.length; ++i) 
        {
            
            profileLabels[i].setText(landscapeArtists[i]);            
            profileLabels[i].setVerticalTextPosition(SwingConstants.BOTTOM);
            profileLabels[i].setHorizontalTextPosition(SwingConstants.CENTER);

            // Update each grid
            grids[i] = new JPanel();
            grids[i].setLayout(new BorderLayout());
            grids[i].setBackground(Color.decode("#303765"));
            grids[i].add(profileLabels[i], BorderLayout.CENTER);

            // Create a new "View Profile" button
            commissionPortrait[i] = new JButton("REQUEST COMMISSION");
            commissionPortrait[i].addActionListener(this);
            commissionPortrait[i].setBackground(Color.decode("#17224d"));
            commissionPortrait[i].setForeground(Color.WHITE);
            commissionPortrait[i].setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            grids[i].setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            grids[i].add(commissionPortrait[i], BorderLayout.SOUTH);

            // Add the grid to the contents panel
            contents.add(grids[i]);
        }

        // Refresh the UI to display changes
        contents.revalidate();
        contents.repaint();
        
        
        
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
       }else if(source == commissionPortrait[0] || source == commissionPortrait[1] || source == commissionPortrait[2] ||source == commissionPortrait[3])
       {
           new CommissionPortrait();
      
       }else
       {
           new DashboardClient();
           setVisible(false);
       }
       
       
    }
    
    
    
    
    
}