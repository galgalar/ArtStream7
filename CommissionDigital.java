
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CommissionDigital extends JFrame implements ActionListener, ItemListener
{
    protected Container con = getContentPane();
    protected JPanel panel = new JPanel();
    protected JLabel name = new JLabel("Name:");
    protected JTextField nameField = new JTextField();
    protected JLabel email = new JLabel("Email:");
    protected JTextField emailField = new JTextField();
    protected JLabel contact = new JLabel("Contact:");
    protected JTextField contactField = new JTextField();
    protected JLabel subjectMatter = new JLabel("Subject Matter:");
    protected JTextField subjectMatterField = new JTextField();
    protected JLabel medium = new JLabel("Medium");
    protected String[] mediumOfDigital = 
    {
        "Select",
        "Adobe Photoshop - ₱1000.00",
        "Corel Painter - ₱1900.00",
        "Procreate - ₱2500.00"
    };  
    protected JComboBox<String> mediumList = new JComboBox<>(mediumOfDigital);
    protected JLabel size = new JLabel("Size");
    protected ButtonGroup sizeChoice = new ButtonGroup();
    protected JRadioButton size1 = new JRadioButton("10 cm x 15 cm - ₱1200.00");
    protected JRadioButton size2 = new JRadioButton("13 cm x 18 cm - ₱2200.10");
    protected JRadioButton size3 = new JRadioButton("20 cm x 25 cm - ₱4500.50");
    protected JRadioButton size4 = new JRadioButton("91 cm x 122 cm - ₱5000.50");
    protected JButton submit = new JButton("Submit");
    protected JScrollPane scroll = new JScrollPane(panel,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    protected String artSize = "";
    protected double totalSummary = 0;
    protected double totalMedium = 0;
    protected double totalSize = 0;
    
    protected String nameGet;
    protected String emailGet;
    protected String contactGet;
    protected String subjectGet;
    protected String mediumGet;
    protected String sizeGet;
        
    
    public CommissionDigital()
    {
        setSize(680,650);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        con.setLayout(new FlowLayout());
        con.add(scroll);

        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.setPreferredSize(new Dimension(670,650));
        panel.setBackground(Color.decode("#484e7e"));
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));      
        panel.add(Box.createRigidArea(new Dimension(10, 30)));
        name.setForeground(Color.WHITE);
        panel.add(name);
        panel.add(Box.createRigidArea(new Dimension(10, 10)));
        nameField.setMaximumSize(new Dimension(690,30));
        nameField.setAlignmentX(LEFT_ALIGNMENT);
        panel.add(nameField);
        panel.add(Box.createRigidArea(new Dimension(10, 10)));
        email.setForeground(Color.WHITE);
        panel.add(email);
        panel.add(Box.createRigidArea(new Dimension(10, 10)));
        emailField.setMaximumSize(new Dimension(690,30));
        emailField.setAlignmentX(LEFT_ALIGNMENT);
        panel.add(emailField);
        panel.add(Box.createRigidArea(new Dimension(10, 10)));
        contact.setForeground(Color.WHITE);
        panel.add(contact);
        panel.add(Box.createRigidArea(new Dimension(10, 10)));
        contactField.setMaximumSize(new Dimension(690,30));
        contactField.setAlignmentX(LEFT_ALIGNMENT);
        panel.add(contactField);
        panel.add(Box.createRigidArea(new Dimension(10, 10)));
        subjectMatter.setForeground(Color.WHITE);
        panel.add(subjectMatter);
        panel.add(Box.createRigidArea(new Dimension(10, 10)));
        subjectMatterField.setMaximumSize(new Dimension(500,30));
        subjectMatterField.setAlignmentX(LEFT_ALIGNMENT);
        panel.add(subjectMatterField);
        panel.add(Box.createRigidArea(new Dimension(10, 10)));
        medium.setForeground(Color.WHITE);
        panel.add(medium);
        panel.add(Box.createRigidArea(new Dimension(10, 10)));
        mediumList.setMaximumSize(new Dimension(200,40));
        mediumList.setAlignmentX(LEFT_ALIGNMENT);
        panel.add(mediumList);
        panel.add(Box.createRigidArea(new Dimension(10, 10)));
        panel.add(size);
       
        size.setForeground(Color.WHITE);
        sizeChoice.add(size1);
        sizeChoice.add(size2);
        sizeChoice.add(size3);
        sizeChoice.add(size4);
        
        size1.setBackground(Color.decode("#484e7e"));
        size2.setBackground(Color.decode("#484e7e"));
        size3.setBackground(Color.decode("#484e7e"));
        size4.setBackground(Color.decode("#484e7e"));
        
        size1.setForeground(Color.WHITE);
        size2.setForeground(Color.WHITE);
        size3.setForeground(Color.WHITE);
        size4.setForeground(Color.WHITE);
        
        panel.add(Box.createRigidArea(new Dimension(10, 10)));
        panel.add(size1);
        panel.add(Box.createRigidArea(new Dimension(10, 10)));
        panel.add(size2);
        panel.add(Box.createRigidArea(new Dimension(10, 10)));
        panel.add(size3);
        panel.add(Box.createRigidArea(new Dimension(10, 10)));
        panel.add(size4);
        panel.add(Box.createRigidArea(new Dimension(10, 10)));
  
        panel.add(submit);
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        
        submit.addActionListener(this);
        size1.addItemListener(this);
        size2.addItemListener(this);
        size3.addItemListener(this);
        size4.addItemListener(this);
   
        setVisible(true);
    }    
    
  
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
            new PendingCommissions("Digital",nameGet,emailGet,contactGet,subjectGet,mediumGet,sizeGet,totalSummary);
            setVisible(false);
            
        }
        
    }
    
    
    
    
    
    
    

    
}
