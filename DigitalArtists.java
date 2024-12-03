
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.*;

public class DigitalArtists extends DashboardClient {
    /*
    protected JButton[] commissionDigital = new JButton[4];
   
    public DigitalArtists() {
        // Set a specific title for the Digital Artists dashboard
        label.setText("Digital Artists");
        String[] digitalArtists = 
        {
            "Precious Anne Larayos",
            "Mykie Justinnae",
            "Ken Congson",
            "Bryan Esconde"
        };       
        
        // Clear the existing content panel
        contents.removeAll();

        // Set the new icon for Digital Artists
        ImageIcon newIcon = new ImageIcon("C:\\Users\\Owner\\OneDrive\\Documents\\NetBeansProjects\\ArtStreamFinal\\src\\main\\java\\com\\mycompany\\artstreamfinal\\profile.jpg");
        Image newImage = newIcon.getImage();
        Image resizedImage = newImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        newIcon = new ImageIcon(resizedImage);

        // Update the contents with the new image
        for (int i = 0; i < grids.length; ++i) {
            // Update the label with the new icon
            profileLabels[i] = new JLabel(newIcon);
            profileLabels[i].setFont(new Font("Segoe UI", Font.PLAIN, 18));
            profileLabels[i].setForeground(Color.WHITE);
            profileLabels[i].setText(digitalArtists[i]);            
            profileLabels[i].setVerticalTextPosition(SwingConstants.BOTTOM);
            profileLabels[i].setHorizontalTextPosition(SwingConstants.CENTER);

            // Update each grid
            grids[i] = new JPanel();
            grids[i].setLayout(new BorderLayout());
            grids[i].setBackground(Color.decode("#303765"));
            grids[i].add(profileLabels[i], BorderLayout.CENTER);

            // Create a new "View Profile" button
            commissionDigital[i] = new JButton("REQUEST COMMISSION");
            commissionDigital[i].addActionListener(this);
            commissionDigital[i].setBackground(Color.decode("#17224d"));
            commissionDigital[i].setForeground(Color.WHITE);
            commissionDigital[i].setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            grids[i].setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            grids[i].add(commissionDigital[i], BorderLayout.SOUTH);

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
       }else if(source == commissionDigital[0] || source == commissionDigital[1] || source == commissionDigital[2] ||source == commissionDigital[3] )
       {
           new CommissionDigital();
       }else
       {
           new DashboardClient();
           setVisible(false);
       }
       
       
    }
    
    
    */
    
    protected static ArrayList<JPanel> panels = new ArrayList<>();
    protected JButton artistsButton = new JButton("View Artists");  
    
    public DigitalArtists(String name)
    {
        label.setText("Digital Artists");
        contents.removeAll();  
        contents.setLayout(new FlowLayout(FlowLayout.LEADING));       
        
        ImageIcon newIcon = new ImageIcon("C:\\Users\\Owner\\OneDrive\\Documents\\NetBeansProjects\\ArtStreamFinal\\src\\main\\java\\com\\mycompany\\artstreamfinal\\profile.jpg");
        Image newImage = newIcon.getImage();
        Image resizedImage = newImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        newIcon = new ImageIcon(resizedImage);
        
        JLabel go = new JLabel(newIcon);
        go.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        go.setForeground(Color.WHITE);
        go.setText("Glyzel M. Galagar");      
        go.setHorizontalTextPosition(SwingConstants.CENTER);
        go.setVerticalTextPosition(SwingConstants.BOTTOM);
         
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(go,BorderLayout.CENTER);
        panel.add(artistsButton,BorderLayout.SOUTH);
        panel.setBackground(Color.decode("#303765"));
        panel.setPreferredSize(new Dimension(300,100));
        contents.add(panel);
        contents.setBackground(Color.decode("#17224d"));
        for(int i = 0; i < panels.size(); ++i)
        {
            contents.add(panels.get(i));
        } 
        setVisible(true);
        
    }
     
    public DigitalArtists()
    {
        label.setText("Digital Artists");
        contents.removeAll();  
        contents.setLayout(new BorderLayout());
        JLabel post = new JLabel("No artists available");
        post.setFont(new Font("Arial",Font.BOLD,40));
        post.setBorder(BorderFactory.createEmptyBorder(10,600,500,10));
        contents.add(post,BorderLayout.CENTER);

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
       }else
       {
           new DashboardClient();
           setVisible(false);
       }
       
       
    }
    
    
    
    
    
    
   
    
    
 }
