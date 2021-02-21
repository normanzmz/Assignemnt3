package Marketing;

import java.util.ArrayList;

abstract class Employee {

    // attributes
    protected String employeeName;
    protected MarketingManager manager;
    protected long marketingID;
    ArrayList<Client> clients = new ArrayList<>();


    // getters and setters
    String getEmployeeName() {
        return employeeName;
    }

    void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    MarketingManager getManager() {
        return manager;
    }

    void setManager(MarketingManager manager) {
        this.manager = manager;
    }

    long getMarketingID() {
        return marketingID;
    }

    void setMarketingID(long marketingID) {
        this.marketingID = marketingID;
    }

    public boolean addClient(Client c1){
        return clients.add(c1);
    }

    public ArrayList<Client> getClients(){
        return clients;
    }
}
