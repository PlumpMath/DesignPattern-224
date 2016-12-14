
/**
 * Write a description of class Leaf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Leaf extends Component
{
    // instance variables - replace the example below with your own
    String name;
    public Leaf(String n)
    {
        this.name = n;
    }
    public void display(int lvl)
    {
        System.out.println(lvl+":"+name);
    }
    
    
    public void add(Component c) {}
    public void remove(Component c) {}
}
