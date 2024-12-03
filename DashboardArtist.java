
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

public class DashboardArtist extends JFrame {
    
    protected Container con = getContentPane();
    protected JPanel headerPanel = new JPanel();
    protected JPanel sidePanel = new JPanel(); 
    protected JPanel title = new JPanel();
    protected JPanel choices = new JPanel();
    protected ImageIcon profile = new ImageIcon("C:\\Users\\Owner\\OneDrive\\Documents\\NetBeansProjects\\ArtStreamFinal\\src\\main\\java\\com\\mycompany\\artstreamfinal\\profile-removebg-preview.png");
    protected JButton profileButton;
    protected JPanel mainPanel = new JPanel();
    protected String name;
    
    public DashboardArtist()
    {
        super("ArtStream - Dashboard Artist");
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
        JLabel titleLabel = new JLabel("ARTSTREAM");
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 40)); // Increase font size here
        titleLabel.setForeground(Color.WHITE);
        title.add(titleLabel);

        // Set the icon sizes (as before)
        Image profileSize = profile.getImage();
        Image iconNewSize1 = profileSize.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        profile = new ImageIcon(iconNewSize1);
        this.name = name;
        profileButton = new JButton(profile);
        profileButton.setBackground(Color.decode("#303765"));
        profileButton.setToolTipText(name);
        choices.add(profileButton);
        choices.setBackground(Color.decode("#303765"));
        headerPanel.add(choices, BorderLayout.EAST);
        
        mainPanel.setBackground(Color.decode("#000e37"));    
        mainPanel.setLayout(new BorderLayout());
        sidePanel.setBackground(Color.decode("#484e7e"));
        sidePanel.setPreferredSize(new Dimension(500,700));
        mainPanel.add(sidePanel,BorderLayout.WEST);
        
        setVisible(true);
        
    }
    
    
    
    public DashboardArtist(String name)
    {
        
        super("ArtStream - Dashboard Artist");
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
        JLabel titleLabel = new JLabel("ARTSTREAM");
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 40)); // Increase font size here
        titleLabel.setForeground(Color.WHITE);
        title.add(titleLabel);

        // Set the icon sizes (as before)
        Image profileSize = profile.getImage();
        Image iconNewSize1 = profileSize.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        profile = new ImageIcon(iconNewSize1);
        this.name = name;
        profileButton = new JButton(profile);
        profileButton.setBackground(Color.decode("#303765"));
        profileButton.setToolTipText(name);
        choices.add(profileButton);
        choices.setBackground(Color.decode("#303765"));
        headerPanel.add(choices, BorderLayout.EAST);
        
        mainPanel.setBackground(Color.decode("#000e37"));    
        mainPanel.setLayout(new BorderLayout());
        sidePanel.setBackground(Color.decode("#484e7e"));
        sidePanel.setPreferredSize(new Dimension(500,700));
        mainPanel.add(sidePanel,BorderLayout.WEST);
        
        setVisible(true);
        
        
        
    }
   
    
    
    
    
    
    
}
