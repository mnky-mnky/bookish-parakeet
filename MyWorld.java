import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    int bugCounter = 0;
    public MyWorld()
    {    
        super(600, 600, 1, false);
        populate();
    }
    public void act()
    {
      createBuggy();
    }
    public void populate()
    {
        
        Player player = new Player();
        addObject(player, 200, 200);
    }
    public void createBuggy()
    {
        Buggy bug = new Buggy("bug");
        
        GreenfootImage image = bug.getImage();
        
        int where = Greenfoot.getRandomNumber(600);
        
        int numOfBugs = Greenfoot.getRandomNumber(10) - 4;
        
        bugCounter++;
        if(bugCounter==10)
        {
            if(getObjects(Buggy.class).size() < numOfBugs)
            {
                addObject(bug, 0 - image.getWidth(), where);
            }
            bugCounter=0;
        }
    }
}
