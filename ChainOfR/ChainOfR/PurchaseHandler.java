
/**
 * Write a description of class PurchaseHandler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract class PurchaseHandler 
{
    // instance variables - replace the example below with your own
    private int x;
    protected PurchaseHandler successor;

    /**
     * Constructor for objects of class PurchaseHandler
     */
    public PurchaseHandler()
    {
        // initialise instance variables
        x = 0;
    }

    public void setSuccessor(PurchaseHandler successor) {   
        this.successor = successor;  
    }
    
    public abstract void handleRequest(PurchaseRequest request); 
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
