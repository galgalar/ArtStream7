

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SigninClient extends JFrame implements ActionListener, ItemListener
{
    protected Container con = getContentPane();
    protected JPanel conPanel = new JPanel();
    protected JPanel leftPanel = new JPanel();
    protected JPanel rightPanel = new JPanel();
    protected ImageIcon icon = new ImageIcon("C:\\Users\\Owner\\OneDrive\\Documents\\NetBeansProjects\\ArtStreamFinal\\src\\main\\java\\com\\mycompany\\artstreamfinal\\ARTS-removebg-preview.png");
    protected JLabel imageLabel = new JLabel(icon);
    protected JPanel signinPanel = new JPanel();
    protected JLabel usernameLabel = new JLabel("Username");
    protected JTextField usernameField = new JTextField();
    protected JLabel passwordLabel = new JLabel("Password");
    protected JPasswordField passwordField = new JPasswordField();
    protected JCheckBox rememberMeCheckbox = new JCheckBox("Remember me");
    protected JButton signinButton = new JButton("Sign In");
    protected JButton goBack = new JButton("return");

    public SigninClient() 
    {
        super("ArtStream - Client Sign In");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Resize the icon
        Image img = icon.getImage();
        Image resizedImg = img.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        icon = new ImageIcon(resizedImg);
        imageLabel.setIcon(icon);

        // Layout for container
        con.setLayout(new GridLayout(1, 2, 0, 0));
        
        // Configure right panel
        rightPanel.setBackground(Color.decode("#000e37"));
        rightPanel.setLayout(new GridBagLayout());
        rightPanel.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 70));
        rightPanel.add(imageLabel);

        // Configure left panel
        leftPanel.setBackground(Color.decode("#000e37"));
        leftPanel.setLayout(new BorderLayout());
        leftPanel.setBorder(BorderFactory.createEmptyBorder(190, 50, 100, 50));

        // Configure signin panel
        signinPanel.setLayout(new BorderLayout());
        signinPanel.setBackground(Color.decode("#000e37"));

        // Header panel
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(Color.decode("#000e37"));
        JLabel welcomeLabel = new JLabel("Welcome again!");
        welcomeLabel.setFont(new Font("Monospaced", Font.BOLD, 24));
        welcomeLabel.setForeground(Color.WHITE);
        headerPanel.add(welcomeLabel);
        headerPanel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
        signinPanel.add(headerPanel, BorderLayout.NORTH);

        // Main form panel
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));
        formPanel.setBackground(Color.decode("#000e37"));

        
        usernameLabel.setFont(new Font("Monospaced", Font.PLAIN, 16));
        usernameLabel.setForeground(Color.WHITE);

        
        usernameField.setMaximumSize(new Dimension(600, 40));
        usernameField.setFont(new Font("Monospaced", Font.PLAIN, 14));

        
        passwordLabel.setFont(new Font("Monospaced", Font.PLAIN, 16));
        passwordLabel.setForeground(Color.WHITE);

       
        passwordField.setMaximumSize(new Dimension(600, 40));
        passwordField.setFont(new Font("Monospaced", Font.PLAIN, 14));

        
        rememberMeCheckbox.setFont(new Font("Monospaced", Font.PLAIN, 14));
        rememberMeCheckbox.setBackground(Color.decode("#000e37"));
        rememberMeCheckbox.setForeground(Color.WHITE);

        
        signinButton.setFont(new Font("Monospaced", Font.BOLD, 16));
        signinButton.setBackground(Color.decode("#89CFF0"));
        signinButton.setForeground(Color.BLACK);
        signinButton.setAlignmentX(LEFT_ALIGNMENT);
        signinButton.setMaximumSize(new Dimension(300, 30));
        
        
        goBack.setFont(new Font("Monospaced", Font.BOLD, 16));
        goBack.setBackground(Color.decode("#89CFF0"));
        goBack.setForeground(Color.BLACK);
        goBack.setAlignmentX(LEFT_ALIGNMENT);
        goBack.setMaximumSize(new Dimension(300, 30));
        

        formPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        formPanel.add(usernameLabel);
        formPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        formPanel.add(usernameField);
        formPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        formPanel.add(passwordLabel);
        formPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        formPanel.add(passwordField);
        formPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        formPanel.add(rememberMeCheckbox);
        formPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        formPanel.add(signinButton);
        formPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        formPanel.add(goBack);
        formPanel.setBorder(BorderFactory.createEmptyBorder(10,50,100,50));

        signinPanel.add(formPanel, BorderLayout.CENTER);

        // Add panels to the left panel
        leftPanel.add(signinPanel, BorderLayout.CENTER);

        // Add panels to the container
        con.add(leftPanel);
        con.add(rightPanel);
        rememberMeCheckbox.addItemListener(this);
        signinButton.addActionListener(this);
        goBack.addActionListener(this);
        // Set frame visibility
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
           new DashboardClient();
           setVisible(false);
       }else if(source == goBack)
       {
           new SetupAccountClient();
           setVisible(false);
       }
       
    
    }
    
    
    
}