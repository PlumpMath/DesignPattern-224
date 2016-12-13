
/**
 * Write a description of class Client here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Client
{
    // instance variables - replace the example below with your own
    public static void main() {
        PurchaseHandler boss = new ConcreteHandlerBoss();
        PurchaseHandler manager = new ConcreteHandlerManager();
        PurchaseHandler clerk = new ConcreteHandlerClerk();
        clerk.setSuccessor(manager);
        manager.setSuccessor(boss);
        
        PurchaseRequest firstOrder = new PurchaseRequest(200);
        PurchaseRequest secondOrder = new PurchaseRequest(2000);
        PurchaseRequest thirdOrder = new PurchaseRequest(20000);
        
        clerk.handleRequest(firstOrder);
        manager.handleRequest(firstOrder);
        clerk.handleRequest(secondOrder);
        clerk.handleRequest(thirdOrder);
    }
        
}
