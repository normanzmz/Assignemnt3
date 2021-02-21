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
    private double bonus(){
        return employees.size() * 250 ;
    }
}
