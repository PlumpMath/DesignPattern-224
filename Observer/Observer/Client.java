
/**
 * Write a description of class Client here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Client
{
    // instance variables - replace the example below with your own
    public static void main()
     {
        Object a = new Object();
        a.setState("OK");
        Observer ob1 = new Observer (a, "Ace");
        Observer ob2 = new Observer (a, "Bill");
        Observer ob3 = new Observer (a, "Carl");
        a.attachob(ob1);
        a.attachob(ob2);
        a.setState("Good");
        a.detachob(ob1);
        a.attachob(ob3);
        a.setState("No good");
    }
}
