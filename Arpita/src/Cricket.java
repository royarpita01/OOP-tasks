
public class Cricket extends Sports{
    String matchType;
    int over;
    Player player;
    Cricket(String matchType,int over,Player player)
    {
        this.matchType = matchType;
        this.over = over;
        this.player = player;
    }
    
    void display()
    {
        System.out.println("Matchtype: "+matchType);
        System.out.println("Over: "+over);
        System.out.println("player Name: "+player.playerName);
        System.out.println("Jersey Number: "+player.jerseyNumber);
        
        
    }
    
}
