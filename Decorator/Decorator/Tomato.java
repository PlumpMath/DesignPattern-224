
/**
 * Write a description of class Tomato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tomato extends Decorator
{
    // instance variables - replace the example below with your own
    private double p=0.5;

    /**
     * Constructor for objects of class Tomato
     */
    public Tomato(Component d)
    {
        super(d);
    }
    
    public double totalprice() 
    {
        return (super.totalprice()+p);
    }    

}
