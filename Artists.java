
import java.util.ArrayList;


public class Artists extends Informations {
    
    public static ArrayList names = new ArrayList<>();
    public static ArrayList pass = new ArrayList<>();
    public static ArrayList<DashboardArtist> dashboardArtist = new ArrayList<>();
    public static int noOfArtist = 0;
    public String typeOfArtist;
    
    public Artists(String username,String password)
    {
        super(username,password);
        this.typeOfArtist = typeOfArtist;
        
        try
        {           
            names.add(username);
            pass.add(password);
            
            DashboardArtist artist = new DashboardArtist(username);
            artist.setVisible(false);
            dashboardArtist.add(artist);
 
             System.out.println(names.get(noOfArtist));
             System.out.println(pass.get(noOfArtist));
             
            ++noOfArtist;
            
        }catch(Exception e)
        {
            System.out.print("sdfdsf");
        }
        
    }
    
    
    
}
