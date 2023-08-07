import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AnimatedActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AnimatedActor extends Actor
{
    private int frame = 0;                              //current frame
    private String name = "Hero";    //base name for image
    private String extension = ".png";   //file extension
    private int speed = 10;      //speed of animation
    private int speedCounter = 0;    //time to next image change
    
    
    public void animate(int first, int last)    //first frame e.g. 0, last frame e.g. 3
    {
        if (speedCounter >= speed)      //Only animate when counter has reached speed
        {
                speedCounter = 0;       //reset counter

                if (frame < first || frame >= last) //if the frame is outside the first/last range
                {
                    frame = first;      //set to first frame
                }
                else
                {
                    frame++;            //otherwise add 1 to the frame number
                }

                setImage(name + frame + extension);  //display the next image
         }
         else
         {
               speedCounter++;      //if  counter not up to speed add 1 to counter
         }
        
    }

}
