import java.util.ArrayList;

class MarketingAssociate extends Employee{

    protected String employeeName;
    protected MarketingManager manager;
    protected long marketingID;

    // constructors
    MarketingAssociate(String employeeName, long marketingID, MarketingManager manager){
        this.employeeName = employeeName;
        this.marketingID = marketingID;
        this.manager = manager;
    }

    // functions
    private double bonus(){
        return clients.size() * 500 ;
    }
}
