

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DashboardClient extends JFrame implements ActionListener
{
    protected Container con = getContentPane();
    protected JPanel headerPanel = new JPanel();
    protected JPanel title = new JPanel();
    protected JPanel choices = new JPanel();
    protected ImageIcon accepted = new ImageIcon("C:\\Users\\Owner\\OneDrive\\Documents\\NetBeansProjects\\ArtStreamFinal\\src\\main\\java\\com\\mycompany\\artstreamfinal\\accepted-removebg-preview.png");
    protected ImageIcon pending = new ImageIcon("C:\\Users\\Owner\\OneDrive\\Documents\\NetBeansProjects\\ArtStreamFinal\\src\\main\\java\\com\\mycompany\\artstreamfinal\\pending-removebg-preview.png");
    protected ImageIcon profile = new ImageIcon("C:\\Users\\Owner\\OneDrive\\Documents\\NetBeansProjects\\ArtStreamFinal\\src\\main\\java\\com\\mycompany\\artstreamfinal\\profile-removebg-preview.png");
    protected JPanel contents = new JPanel();
    protected JPanel[] grids = new JPanel[4];
    protected JLabel[] profileLabels = new JLabel[4];
    protected JLabel titleLabel = new JLabel("ARTSTREAM");
    protected JLabel label = new JLabel("Find Artists");
    protected Image icon;
    protected Image iconNewSize;
    
    protected ImageIcon[] icons = {
            new ImageIcon("C:\\Users\\Owner\\OneDrive\\Documents\\NetBeansProjects\\ArtStreamFinal\\src\\main\\java\\com\\mycompany\\artstreamfinal\\digitalarts.jpg"),
            new ImageIcon("C:\\Users\\Owner\\OneDrive\\Documents\\NetBeansProjects\\ArtStreamFinal\\src\\main\\java\\com\\mycompany\\artstreamfinal\\charcoal.jpg"),
            new ImageIcon("C:\\Users\\Owner\\OneDrive\\Documents\\NetBeansProjects\\ArtStreamFinal\\src\\main\\java\\com\\mycompany\\artstreamfinal\\landscape.jpg"),
            new ImageIcon("C:\\Users\\Owner\\OneDrive\\Documents\\NetBeansProjects\\ArtStreamFinal\\src\\main\\java\\com\\mycompany\\artstreamfinal\\portrait.jpg")
        };
        
    protected JLabel[] names = 
        {
            new JLabel("DIGITAL ARTISTS"),
            new JLabel("CHARCOAL ARTISTS"),
            new JLabel("LANDSCAPE ARTISTS"),
            new JLabel("PORTRAIT ARTISTS")
        };
    
    protected JButton acceptedButton;
    protected JButton pendingButton;
    protected JButton profileButton;

    protected JPanel mainPanel = new JPanel();

    protected JButton[] viewArtists = new JButton[4];
    protected JPanel backPanel = new JPanel();
    protected JButton back = new JButton("back");
    private String name;

    public DashboardClient()
    {
        super("ArtStream - Dashboard Client");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        con.setLayout(new BorderLayout());
        con.add(headerPanel, BorderLayout.NORTH);
        con.add(mainPanel, BorderLayout.CENTER);
        headerPanel.setLayout(new BorderLayout());
        headerPanel.setBackground(Color.decode("#303765"));
        headerPanel.add(title, BorderLayout.WEST);
        headerPanel.add(choices, BorderLayout.EAST);

        title.setLayout(new FlowLayout(FlowLayout.LEADING));
        title.setBackground(Color.decode("#303765"));

        // Set a larger font size for the title
        
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 40)); // Increase font size here
        titleLabel.setForeground(Color.WHITE);
        title.add(titleLabel);

        // Set the icon sizes (as before)
        Image acceptedSize = accepted.getImage();
        Image iconNewSize1 = acceptedSize.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        accepted = new ImageIcon(iconNewSize1);

        Image pendingSize = pending.getImage();
        Image iconNewSize2 = pendingSize.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        pending = new ImageIcon(iconNewSize2);

        Image profileSize = profile.getImage();
        Image iconNewSize3 = profileSize.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        profile = new ImageIcon(iconNewSize3);

        acceptedButton = new JButton(accepted);
        pendingButton = new JButton(pending);
        profileButton = new JButton(profile);

        acceptedButton.setBackground(Color.decode("#303765"));
        pendingButton.setBackground(Color.decode("#303765"));
        profileButton.setBackground(Color.decode("#303765"));

        acceptedButton.setToolTipText("Accepted Commissions");
        pendingButton.setToolTipText("Pending Commissions");
        profileButton.setToolTipText("Log-out");

        choices.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 10));  // Right-aligned with spacing
        choices.add(acceptedButton);
        choices.add(pendingButton);
        choices.add(profileButton);
        choices.setBackground(Color.decode("#303765"));
        headerPanel.add(choices, BorderLayout.EAST);

        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.decode("#17224d"));
        JPanel secondHeader = new JPanel();

        // Set a larger font size for the combo box
        
        
        label.setFont(new Font("Segoe UI", Font.PLAIN, 25)); 
        label.setMaximumSize(new Dimension(200, 100));
        
        label.setBackground(Color.decode("#17224d"));
        label.setForeground(Color.WHITE);
        label.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 20));
        secondHeader.setLayout(new FlowLayout(FlowLayout.LEADING, 10, 10));  // Added spacing between components
        secondHeader.add(label);
        secondHeader.setBackground(Color.decode("#17224d"));

        mainPanel.add(secondHeader, BorderLayout.NORTH);

        
        contents.setLayout(new GridLayout(0, 4, 20, 20));  // Increased horizontal and vertical spacing
  
        
        
        for (int i = 0; i < grids.length; ++i) {
            
            icon = icons[i].getImage();
            iconNewSize = icon.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            icons[i] = new ImageIcon(iconNewSize);

            profileLabels[i] = new JLabel(icons[i]);
            profileLabels[i].setFont(new Font("Segoe UI", Font.PLAIN, 18));
            profileLabels[i].setForeground(Color.WHITE);
            profileLabels[i].setText(names[i].getText());

            profileLabels[i].setVerticalTextPosition(SwingConstants.BOTTOM);
            profileLabels[i].setHorizontalTextPosition(SwingConstants.CENTER);

            grids[i] = new JPanel();
            grids[i].setLayout(new BorderLayout());
            grids[i].setBackground(Color.decode("#303765"));

            // Add the profile image to the grid
            grids[i].add(profileLabels[i], BorderLayout.CENTER);

            // Create and configure the "See Profile" button
            viewArtists[i] = new JButton("VIEW ARTISTS");
            viewArtists[i].addActionListener(this);
            viewArtists[i].setBackground(Color.decode("#17224d"));
            viewArtists[i].setForeground(Color.WHITE);
            viewArtists[i].setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            // Add padding around each grid and add the button at the bottom
            grids[i].setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            grids[i].add(viewArtists[i], BorderLayout.SOUTH);
        }

        // Add each profile grid to the contents panel
        for (int i = 0; i < grids.length; ++i) {
            contents.add(grids[i]);
        }
        contents.setBackground(Color.decode("#17224d"));
        // Add the content panel to the main panel
        mainPanel.add(contents, BorderLayout.CENTER);
        backPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
        backPanel.setBackground(Color.decode("#17224d"));
        backPanel.add(back);
        mainPanel.add(backPanel,BorderLayout.SOUTH);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(50, 100, 200, 100));
        
        acceptedButton.addActionListener(this);
        pendingButton.addActionListener(this);
        profileButton.addActionListener(this);
        back.addActionListener(this);
        
               
    }
    
    
    
    public DashboardClient(String name) {
        super("ArtStream - Dashboard Client");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        con.setLayout(new BorderLayout());
        con.add(headerPanel, BorderLayout.NORTH);
        con.add(mainPanel, BorderLayout.CENTER);
        headerPanel.setLayout(new BorderLayout());
        headerPanel.setBackground(Color.decode("#303765"));
        headerPanel.add(title, BorderLayout.WEST);
        headerPanel.add(choices, BorderLayout.EAST);

        title.setLayout(new FlowLayout(FlowLayout.LEADING));
        title.setBackground(Color.decode("#303765"));

        // Set a larger font size for the title
        
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 40)); // Increase font size here
        titleLabel.setForeground(Color.WHITE);
        title.add(titleLabel);

        // Set the icon sizes (as before)
        Image acceptedSize = accepted.getImage();
        Image iconNewSize1 = acceptedSize.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        accepted = new ImageIcon(iconNewSize1);

        Image pendingSize = pending.getImage();
        Image iconNewSize2 = pendingSize.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        pending = new ImageIcon(iconNewSize2);

        Image profileSize = profile.getImage();
        Image iconNewSize3 = profileSize.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        profile = new ImageIcon(iconNewSize3);

        acceptedButton = new JButton(accepted);
        pendingButton = new JButton(pending);
        profileButton = new JButton(profile);

        acceptedButton.setBackground(Color.decode("#303765"));
        pendingButton.setBackground(Color.decode("#303765"));
        profileButton.setBackground(Color.decode("#303765"));

        acceptedButton.setToolTipText("Accepted Commissions");
        pendingButton.setToolTipText("Pending Commissions");
        profileButton.setToolTipText(name);

        choices.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 10));  // Right-aligned with spacing
        choices.add(acceptedButton);
        choices.add(pendingButton);
        choices.add(profileButton);
        choices.setBackground(Color.decode("#303765"));
        headerPanel.add(choices, BorderLayout.EAST);

        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.decode("#17224d"));
        JPanel secondHeader = new JPanel();

        // Set a larger font size for the combo box
        
        
        label.setFont(new Font("Segoe UI", Font.PLAIN, 25)); 
        label.setMaximumSize(new Dimension(200, 100));
        
        label.setBackground(Color.decode("#17224d"));
        label.setForeground(Color.WHITE);
        label.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 20));
        secondHeader.setLayout(new FlowLayout(FlowLayout.LEADING, 10, 10));  // Added spacing between components
        secondHeader.add(label);
        secondHeader.setBackground(Color.decode("#17224d"));

        mainPanel.add(secondHeader, BorderLayout.NORTH);

        
        contents.setLayout(new GridLayout(0, 4, 20, 20));  // Increased horizontal and vertical spacing
  
        
        
        for (int i = 0; i < grids.length; ++i) {
            
            icon = icons[i].getImage();
            iconNewSize = icon.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            icons[i] = new ImageIcon(iconNewSize);

            profileLabels[i] = new JLabel(icons[i]);
            profileLabels[i].setFont(new Font("Segoe UI", Font.PLAIN, 18));
            profileLabels[i].setForeground(Color.WHITE);
            profileLabels[i].setText(names[i].getText());

            profileLabels[i].setVerticalTextPosition(SwingConstants.BOTTOM);
            profileLabels[i].setHorizontalTextPosition(SwingConstants.CENTER);

            grids[i] = new JPanel();
            grids[i].setLayout(new BorderLayout());
            grids[i].setBackground(Color.decode("#303765"));

            // Add the profile image to the grid
            grids[i].add(profileLabels[i], BorderLayout.CENTER);

            // Create and configure the "See Profile" button
            viewArtists[i] = new JButton("VIEW ARTISTS");
            viewArtists[i].addActionListener(this);
            viewArtists[i].setBackground(Color.decode("#17224d"));
            viewArtists[i].setForeground(Color.WHITE);
            viewArtists[i].setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            // Add padding around each grid and add the button at the bottom
            grids[i].setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            grids[i].add(viewArtists[i], BorderLayout.SOUTH);
        }

        // Add each profile grid to the contents panel
        for (int i = 0; i < grids.length; ++i) {
            contents.add(grids[i]);
        }
        contents.setBackground(Color.decode("#17224d"));
        // Add the content panel to the main panel
        mainPanel.add(contents, BorderLayout.CENTER);
        backPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
        backPanel.setBackground(Color.decode("#17224d"));
        backPanel.add(back);
        mainPanel.add(backPanel,BorderLayout.SOUTH);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(50, 100, 200, 100));
        
        acceptedButton.addActionListener(this);
        pendingButton.addActionListener(this);
        profileButton.addActionListener(this);
        back.addActionListener(this);
        this.name = name;
               
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
       }else if(source == viewArtists[0])
       {
           new DigitalArtists();
           setVisible(false);
       }else if(source == viewArtists[1])
       {
           new CharcoalArtists();
           setVisible(false);
           
       }else if(source == viewArtists[2])
       {
           new LandscapeArtists();
           setVisible(false);
       }else if(source == viewArtists[3])
       {
           new PortraitArtists();
           setVisible(false);
       }else
       {
           new SigninClient();
           setVisible(false);
       }
       
       
    }
   
    
    
    
    
    
    
}
