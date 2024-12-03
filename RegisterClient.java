import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegisterClient extends JFrame implements ActionListener, ItemListener
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
    protected JLabel confirmPassword= new JLabel("Confirm Password");
    protected JPasswordField confirmPasswordField = new JPasswordField();
    protected JButton registerButton = new JButton("Register");
    protected JButton goBack = new JButton("return");
    protected String[] account = new String[2];
    
    
    public RegisterClient()
    {
        super("ArtStream - Client Register");
        setSize(1200,900);
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
        JLabel welcomeLabel = new JLabel("Create Account");
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

        confirmPassword.setFont(new Font("Monospaced", Font.PLAIN, 16));
        confirmPassword.setForeground(Color.WHITE);
        
        confirmPasswordField.setMaximumSize(new Dimension(600, 40));
        confirmPasswordField.setFont(new Font("Monospaced", Font.PLAIN, 14));
        
        registerButton.setFont(new Font("Monospaced", Font.BOLD, 16));
        registerButton.setBackground(Color.decode("#89CFF0"));
        registerButton.setForeground(Color.BLACK);
        registerButton.setAlignmentX(LEFT_ALIGNMENT);
        registerButton.setMaximumSize(new Dimension(300, 30));
        
        
        goBack.setFont(new Font("Monospaced", Font.BOLD, 16));
        goBack.setBackground(Color.decode("#89CFF0"));
        goBack.setForeground(Color.BLACK);
        goBack.setAlignmentX(LEFT_ALIGNMENT);
        goBack.setMaximumSize(new Dimension(300, 30));
        

        formPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        formPanel.add(usernameLabel);
        formPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        formPanel.add(usernameField);
        formPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        formPanel.add(passwordLabel);
        formPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        formPanel.add(passwordField);
        formPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        formPanel.add(confirmPassword);
        formPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        formPanel.add(confirmPasswordField);
        formPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        formPanel.add(registerButton);
        formPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        formPanel.add(goBack);
        formPanel.setBorder(BorderFactory.createEmptyBorder(10,50,100,50));

        signinPanel.add(formPanel, BorderLayout.CENTER);

        // Add panels to the left panel
        leftPanel.add(signinPanel, BorderLayout.CENTER);

        // Add panels to the container
        con.add(leftPanel);
        con.add(rightPanel);
        
        registerButton.addActionListener(this);
        goBack.addActionListener(this);
        // Set frame visibility
        setVisible(true);
    }
    @Override
    public void itemStateChanged(ItemEvent e)
    {
        Object source = e.getItem();
       
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
       Object source = e.getSource();
       
       if(source == registerButton)
       {
           String username = usernameField.getText();
           char[] pass = passwordField.getPassword();
           char[] confirmPass = confirmPasswordField.getPassword();
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
               new Client(username,password);
               JOptionPane.showMessageDialog(null,"Account created successfully!");
               new SigninClient();
               setVisible(false);
              
           }
           else
           {
               passwordField.setText(""); 
               confirmPasswordField.setText(""); 
               JOptionPane.showMessageDialog(null,"The password should match");
           }
           
           
           
       }else if(source == goBack)
       {
           new SetupAccountClient();
           setVisible(false);
       }
       
    
    }
    
    
    
    
    
    
    
}
