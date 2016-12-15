
/**
 * Abstract class Decorator - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public class Decorator extends Component
{
    // instance variables - replace the example below with your own
    private Component c;
    //public double p = 0;
    
    Decorator(Component c)
    {
        this.c = c;
    }
    
    public double totalprice()
    {
        return c.totalprice(); 
    }
}
