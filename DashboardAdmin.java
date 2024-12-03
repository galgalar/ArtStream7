
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import java.util.*;

public class DashboardAdmin extends DashboardArtist implements StoreRequests, ActionListener
{
    
    private ImageIcon image = new ImageIcon("C:\\Users\\Owner\\OneDrive\\Documents\\NetBeansProjects\\ArtStreamFinal\\src\\main\\java\\com\\mycompany\\artstreamfinal\\profile.jpg");
    private JButton requests = new JButton("Requests");
    private JButton accepted = new JButton("Accepted");
    private JButton done = new JButton("Done");
    private CardLayout card = new CardLayout();
    private JPanel cardPanel = new JPanel();
    public static ArrayList <JPanel> clientsRequests = new ArrayList<>();
    public JPanel[] panels = new JPanel[3];
    
    public DashboardAdmin()
    {
        Image img = image.getImage();
        Image imgSize = img.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        image = new ImageIcon(imgSize);    
        JLabel profile = new JLabel(image);
        profile.setFont(new Font("Monospaced",Font.BOLD,20));
        profile.setText("GLYZEL GALAGAR");
        profile.setForeground(Color.WHITE);
        profile.setVerticalTextPosition(SwingConstants.BOTTOM);
        profile.setHorizontalTextPosition(SwingConstants.CENTER);
        
        requests.setActionCommand("requests");
        accepted.setActionCommand("accepted");
        done.setActionCommand("done");
        
        sidePanel.setLayout(new BoxLayout(sidePanel,BoxLayout.Y_AXIS));
        sidePanel.add(Box.createRigidArea(new Dimension(0,30)));
        sidePanel.add(profile);
        sidePanel.add(Box.createRigidArea(new Dimension(0,30)));
        requests.setMaximumSize(new Dimension(500,70));
        sidePanel.add(requests);
        sidePanel.add(Box.createRigidArea(new Dimension(0,30)));
        accepted.setMaximumSize(new Dimension(500,70));
        sidePanel.add(accepted);
        sidePanel.add(Box.createRigidArea(new Dimension(0,30)));
        done.setMaximumSize(new Dimension(500,70));
        sidePanel.add(done);
        sidePanel.add(Box.createRigidArea(new Dimension(0,30)));
        sidePanel.setBorder(BorderFactory.createEmptyBorder(100,100,100,100));
        cardPanel.setLayout(card);
        mainPanel.add(cardPanel,BorderLayout.CENTER);
        
        // Fix: Use addAll to add all items from requestsClients
        clientsRequests.addAll(requestsClients);    
        
        for(int i = 0; i < panels.length; ++i)
        {
            panels[i] = new JPanel();
            if(i == 0)
            {         
                panels[i].setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
                panels[i].setBackground(Color.decode("#000e37"));
                panels[i].setLayout(new FlowLayout(FlowLayout.LEADING));
                
                for(int j = 0; j < clientsRequests.size(); ++j)
                {
                    
                    panels[i].add(clientsRequests.get(j)); // Fix: Iterate through clientsRequests properly
                }
                cardPanel.add("requests", panels[i]);            
            }
            else if(i == 1)
            {
                panels[i].setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
                panels[i].setBackground(Color.decode("#000e37"));
                cardPanel.add("accepted", panels[i]);
            }
            else
            {
                panels[i].setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
                panels[i].setBackground(Color.decode("#000e37"));
                cardPanel.add("done", panels[i]);         
            }
        }
        
        requests.addActionListener(this);
        accepted.addActionListener(this);
        done.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();
        card.show(cardPanel,command);
    }    
    
    
    
}
