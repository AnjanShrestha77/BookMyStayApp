/**
 * ======================================
 * AddOnService
 * ======================================
 *
 * this class represent a optional service which can be added to a conformed reservation
 *
 * provides getter method for service name and service cost
 *
 * @version 7.0
 */
public class AddOnService {
    private String serviceName;
    private double cost;

    public  AddOnService(String serviceName, double cost){
        this.serviceName=serviceName;
        this.cost=cost;

    }

    public String getServiceName(){
        return serviceName;
    }
    public double getCost(){
        return cost;
    }

}
