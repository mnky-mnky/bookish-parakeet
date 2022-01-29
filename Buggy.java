import greenfoot.*;
import java.util.List;

public class Buggy extends Resources
{
    boolean run;
    int xSpd;
    int ySpd;
    public static final GreenfootImage bug = new GreenfootImage("ladybug_02.png");
    public void act()
    {
        removeBuggy();
        move();
        attack();
    }
    public Buggy(String img)
    {
        setImage(bug);
    }
    public void move()
    {
        this.xSpd = 1;
        this.ySpd = 4;
        move(xSpd);
    }
    public void attack()
    {
            World world = getWorld();
            List<Player> objects = world.getObjects(Player.class);
            Player player = (Player)objects.get(0);
            if(objects.size() > 0)
            {
                xSpd = 6;
                if(player.getX() > this.getX())
                {
                    if(player.getY() > this.getY())
                    {
                        setLocation(getX(), getY() + ySpd);
                        turnTowards(player.getX(), player.getY());
                    }
                    if(player.getY() < this.getY()) 
                    {
                        setLocation(getX(), getY() - ySpd);
                        turnTowards(player.getX(), player.getY());
                    }
                }
            
            }
}
    public void removeBuggy()
    {
        if(getX() == 100)
        {
            
        }
    }
}
