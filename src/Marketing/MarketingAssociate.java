package Marketing;

class MarketingAssociate extends Employee{

    protected String employeeName;
    protected MarketingManager manager;
    protected long marketingID;

    // constructors
    MarketingAssociate(String employeeName, long marketingID, MarketingManager manager) {
        this.employeeName = employeeName;
        this.marketingID = marketingID;
        this.manager = manager;
    }

    @Override
    String getEmployeeName() {
        return employeeName;
    }

    @Override
    void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    MarketingManager getManager() {
        return manager;
    }

    @Override
    void setManager(MarketingManager manager) {
        this.manager = manager;
    }

    @Override
    long getMarketingID() {
        return marketingID;
    }

    @Override
    void setMarketingID(long marketingID) {
        this.marketingID = marketingID;
    }

    // functions
    double bonus(){
        return clients.size() * 500 ;
    }
}
