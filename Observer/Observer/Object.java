import java.util.*;
/**
 * Write a description of class Object here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Object
{
    // instance variables - replace the example below with your own
    private ArrayList<Observer> obs = new ArrayList<Observer> ();
    private String state;
    
    public void attachob(Observer ob)
    {
        obs.add(ob);
    }
    
    public void detachob(Observer ob)
    {
        obs.remove(ob);
    }
    
    public void notifyObserver()
    {
        for (Observer ob: obs)
        {
            ob.update();
        }
    }
    
    public String getState()
    {
        return state;
    }
    
    public void setState(String s)
    {
        state = s;
        notifyObserver();
    }
    
    
    
}
