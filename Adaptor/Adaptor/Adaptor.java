
/**
 * Write a description of class Adaptor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Adaptor implements SayHello
{
    // instance variables - replace the example below with your own
    private int x;
    private Hello h;

    /**
     * Constructor for objects of class Adaptor
     */
    public Adaptor()
    {
        // initialise instance variables
        h = new Hello();
    }

    public void sayhello()
    {
        h.say("Hello");
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
