
/**
 * Write a description of class ConcreteHandlerManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConcreteHandlerBoss extends PurchaseHandler
{
    // instance variables - replace the example below with your own
    private int x;
    
    /**
     * Constructor for objects of class ConcreteHandlerManager
     */
    public ConcreteHandlerBoss()
    {
        // initialise instance variables
        x = 0;
    }

    public void handleRequest(PurchaseRequest request)
    {
        if (request.getAmount() > 5000)
        {
            System.out.println("Boss decides");
        }
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
