
/**
 * Write a description of class Client here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Client
{
    // instance variables - replace the example below with your own
    public static void test()
    {
        Component level0 = new Composite("lvl0");
        Component level1 = new Composite("lvl1");
        level1.add(new Leaf("leaf1"));
        level1.add(new Leaf("leaf2"));
        level1.add(new Leaf("leaf3"));
        level0.add(level1);
        
        Component level1_1 = new Composite("lvl1_1");
        level1_1.add(new Leaf("leaf1_1"));
        level1_1.add(new Leaf("leaf1_2"));
        level0.add(level1_1);
        
        level0.remove(level1);
        
        
        level0.display(0);      
    }
}
