
/**
 * Write a description of class Mushroom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mushroom extends Decorator
{
    // instance variables - replace the example below with your own
    private double p=1.25;

    /**
     * Constructor for objects of class Mushroom
     */
    public Mushroom(Component d)
    {
        super(d);
    }
    
    public double totalprice() 
    {
        return (super.totalprice()+p);
    } 
}
