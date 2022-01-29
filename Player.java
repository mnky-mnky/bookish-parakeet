import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Player extends Resources
{
    public void act()
    {
        moveIt();
    }
    public void moveIt()
    {
        if(Greenfoot.isKeyDown("up") && getY() != 0)
        {
            setLocation(getX(), getY() - 10);
        }
        if(Greenfoot.isKeyDown("left") && getX() != 0)
        {
            setLocation(getX() - 10, getY() );
        }
        if(Greenfoot.isKeyDown("right") && getX() != 600)
        {
            setLocation(getX() + 10, getY());
        }
        if(Greenfoot.isKeyDown("down") && getY() != 600)
        {
            setLocation(getX(), getY() + 10);
        }
    }
}
