
/**
 * Write a description of class Lettuce here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lettuce extends Decorator
{
    // instance variables - replace the example below with your own
    //private int x;
    private double p = 0.75;
    
    /**
     * Constructor for objects of class Lettuce
     */
    public Lettuce(Component d)
    {
        super(d);
    }
    
    public double totalprice() 
    {
        return (super.totalprice()+p);
    } 
}
