
/**
 * Write a description of class Observer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Observer
{
    Object obj = new Object();
    private String obname; 
    // instance variables - replace the example below with your own
    //private ArrayList<Object> a = new ArrayList<Object> ();
    public void update()
    {
        System.out.println(obname + ": Received: " + obj.getState());
    }
    
    public Observer (Object o, String s)
    {
        obj = o;
        obname = s;
    }
   
}
