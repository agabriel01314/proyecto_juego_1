import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends AnimatedActor
{
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpHeight = -10;
    private int spawnNumber = 0;
    private static int lifeCounter = 6;
    private int timeCounter = 0;
    
    GreenfootImage img_normal;
    GreenfootImage img_acostado;
    
    private int atime=0;
    private boolean facingLeft=false;
    
    public Player(){

        img_normal = new GreenfootImage("personaje_normal_final.png");
        img_acostado = new GreenfootImage("slime_acostado_final.png");

    }
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeys();
        checkFalling();
        //extraction();
        //gameOver();
        
        checkpointUnlock();
        spawn();
        timeCounter = timeCounter + 1;
                
        
            atime=atime+1;
        if (atime==18) atime=0;
        if (atime==0) setImage("personaje_normal_final.png");
        if (atime==6) setImage("slime_acostado_final.png");
        if (facingLeft) getImage().mirrorHorizontally();

    }    
    
    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            //animate(4, 6);
            setLocation (getX() + 4, getY() );
        }
        if (Greenfoot.isKeyDown("left"))
        {
            //animate(1,3);
            setLocation (getX() - 4, getY() );
        }
        if (Greenfoot.isKeyDown("up"))
        {
            //animate(1,3);
            //setLocation (getX() , getY()+4 );
        }
        if (Greenfoot.isKeyDown("down"))
        {
            //animate(1,3);
            //setLocation (getX(), getY()-4 );
        }
        if (Greenfoot.isKeyDown("space")&&(onGround()==true))
        {
            vSpeed = jumpHeight;
            fall();
        }

    }
    
    private void fall()
    {
        setLocation(getX(),getY()+ vSpeed);
        vSpeed = vSpeed + acceleration;
    }
    
    private boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/5, Ground.class);
        
        return under != null;
    }
    
    private void checkFalling()
    {
        if (onGround() == false)
        {
            fall();
        }
    }
    
    private void checkGround()
    {
        if (getY()>1920)
        {
            Greenfoot.stop();
        }
    }
    
    private void checkpointUnlock()
    {
        if (isTouching(Checkpoint.class))
        {
            
            //timeCounter = 0;
            spawnNumber = spawnNumber + 1;
            //getWorld().showText("Checkpoint Unlocked!", getX(), getY());
        }
    }
    
    private void extraction()
    {
        if (isTouching(Plataforma_final.class))
        {
            getWorld().showText("You Win!", getX(), getY());
            Greenfoot.stop();
        }
        /*if (isTouching(FinalPlatform.class))
        *{
         *  ImageScrollWorld world = (ImageScrollWorld) getWorld();
         *  world.stop = true; 
         *  world.finalExtraction();
         *  world.setPaintOrder(GameOver.class, Player.class, Ground.class);
        }*/
    }
    
    private void spawn()
    {
        if (spawnNumber == 0)
        {
            if (getY()>1920)
            {
                lifeCounter = lifeCounter - 1;
                setLocation(120, 1150);
            }
        }
        if (spawnNumber == 1)
        {
            if (getY()>1920)
            {
                lifeCounter = lifeCounter - 1;
                setLocation(120, 850);
            }
        }
        if (spawnNumber == 2)
        {
            if (getY()>1920)
            {
                lifeCounter = lifeCounter - 1;
                setLocation(450, 100);
            }
        }
        if (spawnNumber == 3)
        {
            if (getY()>1920)
            {
                lifeCounter = lifeCounter - 1;
                setLocation(1450, 100);
            }
        }
    }
    
    public void gameOver()
    {
        if (lifeCounter <= 0)
        {
            Greenfoot.stop();
        }
        /*if (lifeCounter <= 0)
        *{
         *   ImageScrollWorld world = (ImageScrollWorld) getWorld();
         *   world.stop = true; 
         *  world.gameOver();
          *  world.setPaintOrder(Extraction.class, Player.class, Ground.class);
        }*/
    }
    
    public static int getLives()
    {
        return lifeCounter;
    }
    



    
    
    
}