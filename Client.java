

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Client extends Informations{
    
    private static ArrayList <String> names = new ArrayList<>();
    private static ArrayList <String> pass = new ArrayList<>();
    private static ArrayList<DashboardClient> dashboardClients = new ArrayList<>();
   
   
    public static int noOfClient = 0;
    private int index = 0;

    public Client(String username,String password)
    {
        super(username,password);
        
        try
        {           
            names.add(username);
            pass.add(password);
            
            DashboardClient client = new DashboardClient(username);
            client.setVisible(false);
            dashboardClients.add(client);
 
             System.out.println(names.get(noOfClient));
             System.out.println(pass.get(noOfClient));
             
            ++noOfClient;
            
        }catch(Exception e)
        {
            System.out.print("sdfdsf");
        }

    }

    public Client()
    {
        super("Unknown","LOL");
    }
        
    public boolean validateLogin(String name, String password) {

        for (int i = 0; i < names.size(); ++i) {
            if (name.equals(names.get(i)) && password.equals(pass.get(i))) {
                index = i;              
                return true; 
            }
        }
        return false; 
    }
    public boolean validateRegister(String name, String password) {

        for (int i = 0; i < names.size(); ++i) {
            if (name.equals(names.get(i)) && password.equals(pass.get(i))) {
                return true; 
            }
        }
        return false; 
    }

    public void  dashboardClient()
    {       
        dashboardClients.get(index).setVisible(true);; 
    }

    
    




}
