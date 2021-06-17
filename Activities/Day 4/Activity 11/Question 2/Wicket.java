
import java.util.*;

public class Wicket
{
    String playerName;
    Wicket()
    {
        super();
    }
    Wicket(String playerName,Bowler o)
    {
        this.playerName=playerName;
    }
    public String getPlayerName()
    {
        return playerName;
    }
    public void setPlayerName(String playerName)
    {
        this.playerName=playerName;
    }
}
