import java.util.*;

/**
 * Write a description of class Composite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Composite extends Component
{
    String name;
    // instance variables - replace the example below with your own
    private ArrayList<Component> l = new ArrayList<Component> (); 

    /**
     * Constructor for objects of class Composite
    */
    public Composite(String n)
    {
        this.name = n;
    }

    
    public void add(Component c) 
    {
        l.add(c);
    }
    
    public void remove(Component c)
    {
        l.remove(c);
    }
    
    public void display(int lvl)
    {
        System.out.println(lvl+":"+name);
        
        for (Component c : l)
        {
            c.display(lvl+1);
        }
        
    }
}
