import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Actor
{
    private int hSpeed=15;
    private int vSpeed=3;
    
    public void act() 
    {
       fly();
       checkKeys();
       bounce();
       collision();
       //jump();       
    }    
    
    public void fly()
    {
       setLocation(getX()-hSpeed, getY()-vSpeed);
    }    
        
    protected void checkKeys()
    {
        if (Greenfoot.isKeyDown("left"))
            moveLeft();
        if (Greenfoot.isKeyDown("right"))
            moveRight();
        if (Greenfoot.isKeyDown("up"))
            moveUp();
        if (Greenfoot.isKeyDown("down"))
            moveDown();
        if (Greenfoot.isKeyDown("space"))
            jump();
    }
    
    private void moveLeft()
    {
        setLocation(getX()-hSpeed, getY());
    }
    
    private void moveRight()
    {
        setLocation(getX()+hSpeed, getY());
    }
    
    private void moveUp()
    {
        setLocation(getX(), getY()-vSpeed);
    }
    
    private void moveDown()
    {
        setLocation(getX(), getY()+vSpeed);
    }
    
    private void jump()
    {
        setLocation(getX(), getY()-20);
    }
    
    public String getEdge()
    {
        int x = getX();
        int y = getY();
        if (y == 0)
            return "top";
        else if (x == 0)
            return "left";
        else if (x == getWorld().getWidth()-1)
            return "right";
        else if (y == getWorld().getHeight()-1)
            return "bottom";
        else
            return "none";
    }
    
    public void bounce()
    {
        String edge = getEdge();
        if (edge == "left")
        {
            hSpeed = hSpeed * (-1);
            this.setRotation(0);
        }
        if (edge == "right")
        {
            hSpeed = hSpeed * (-1);
            this.setRotation(180);
        }
        if (edge == "top" || edge == "bottom")
            vSpeed = vSpeed * (-1);
    }
    
    public void collision()
    {
        Actor a =this.get
        if (a != null)
        {
            this.getWorld().removeObject(this);
        }
    }
}

















