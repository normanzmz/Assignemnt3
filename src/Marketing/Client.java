package Marketing;

import java.util.ArrayList;

public class Client {

    //attributes
    private int clientID;
    private String clientName;
    ArrayList<Employee> employees;

    Client(int clientID, String clientName){
        this.clientID = clientID;
        this.clientName = clientName;
        this.employees = new ArrayList<Employee>();
    }

    //constructors
    int getClientID() {
        return clientID;
    }

    void setClientID(int clientID) {
        this.clientID = clientID;
    }

    String getClientName() {
        return clientName;
    }

    void setClientName(String clientName) {
        this.clientName = clientName;
    }

    //functions
    public double totalSales(){
        return 0;
    }

    void addEmployee(Employee e1){
        employees.add(e1);
    }

    ArrayList<Employee> getEmployees(){
        return employees;
    }


}

