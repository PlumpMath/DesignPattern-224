
/**
 * Write a description of class Client here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Client
{
    // instance variables - replace the example below with your own
    private int x;

    public static void main()
    {
        Component ca, cb, cc, cd;
        ca = new Hamburger();
        System.out.println(ca.totalprice());
        cb = new Tomato(ca);
        cc = new Mushroom(cb);
        cd = new Lettuce(cc);
        System.out.println(cb.totalprice());
        System.out.println(cc.totalprice());
        System.out.println(cd.totalprice());
    }
}
