
/**
 * Write a description of class ConcreteHandlerManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConcreteHandlerManager extends PurchaseHandler
{
    // instance variables - replace the example below with your own
    private int x;
    //private PurchaseHandler succesor;
    /**
     * Constructor for objects of class ConcreteHandlerManager
     */
    public ConcreteHandlerManager()
    {
        // initialise instance variables
        x = 0;
    }

    public void handleRequest(PurchaseRequest request)
    {
        if (request.getAmount() < 5000)
        {
            System.out.println("Manager decides");
        }
        else
        {
            this.successor.handleRequest(request);
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
