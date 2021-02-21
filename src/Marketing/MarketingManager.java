package Marketing;

import java.util.ArrayList;

class MarketingManager extends Employee{

    protected String employeeName;
    protected ArrayList<Employee> employees;
    protected MarketingManager manager;
    protected long marketingID;

    // constructors
    MarketingManager(String employeeName, ArrayList<Employee> employees, MarketingManager manager,long marketingID){
        this.employeeName = employeeName;
        this.employees = employees;
        this.marketingID = marketingID;
        this.manager = manager;
    }

    // functions
    double bonus(){
        return employees.size() * 250 ;
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

    ArrayList<Employee> getEmployees(){
        return employees;
    }

    void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    void addEmployee(Employee e1){
        employees.add(e1);
    }

}
