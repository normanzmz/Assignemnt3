package Marketing;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[]args){
        ArrayList<Employee> johnEmployees = new ArrayList<Employee>();
        ArrayList<Employee> maryEmployees = new ArrayList<Employee>();

        Client Ted = new Client(3, "Ted");
        Client Geoff = new Client(9, "Jeff");
        Client Amanda = new Client(42, "Amanda");


        MarketingManager John = new MarketingManager("John", johnEmployees,null, 12345);
        John.addClient(Geoff);

        MarketingManager Mary =  new MarketingManager("Mary", maryEmployees, John, 54321);
        Mary.addClient(Ted);
        Mary.addClient(Amanda);

        MarketingAssociate Peter = new MarketingAssociate("Peter", 98765, John);
        MarketingAssociate Janet = new  MarketingAssociate("Janet", 49823, Mary);
        MarketingAssociate Jim = new  MarketingAssociate("Jim", 23923, Mary);

        Geoff.addEmployee(John);
        Ted.addEmployee(Mary);
        Amanda.addEmployee(Mary);

        John.addEmployee(Peter);
        John.addEmployee(Mary);

        Mary.addEmployee(Jim);
        Mary.addEmployee(Janet);

        John.setEmployees(johnEmployees);


        ArrayList<String> johnEmployeeList = John.getEmployees().stream().map(Employee::getEmployeeName).collect(Collectors.toCollection(ArrayList::new));
        ArrayList<String> maryEmployeeList = Mary.getEmployees().stream().map(Employee::getEmployeeName).collect(Collectors.toCollection(ArrayList::new));

        ArrayList<Integer> johnClientList = John.getClients().stream().map(Client::getClientID).collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> maryClientList = Mary.getClients().stream().map(Client::getClientID).collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Marketing Manager: " + John.getEmployeeName() + ". " + "Employees:" + johnEmployeeList + " Clients: " + johnClientList);
        System.out.println("Marketing Manager: " + Mary.getEmployeeName() + ". " + "Employees:" + maryEmployeeList + " Clients: " + maryClientList);

        System.out.println("Employee: " + Peter.getEmployeeName() + ". " + "Marketing Manager: " + Peter.getManager().getEmployeeName());
        System.out.println("Employee: " + Jim.getEmployeeName() + ". " + "Marketing Manager: " + Jim.getManager().getEmployeeName());
        System.out.println("Employee: " + Janet.getEmployeeName() + ". " + "Marketing Manager: " + Janet.getManager().getEmployeeName());

        ArrayList<String> tedEmployeeList = Ted.getEmployees().stream().map(Employee::getEmployeeName).collect(Collectors.toCollection(ArrayList::new));
        ArrayList<String> geoffEmployeeList = Geoff.getEmployees().stream().map(Employee::getEmployeeName).collect(Collectors.toCollection(ArrayList::new));
        ArrayList<String> amandaEmployeeList = Amanda.getEmployees().stream().map(Employee::getEmployeeName).collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Client ID: " + Ted.getClientID() + " Marketing Employee: " + tedEmployeeList);
        System.out.println("Client ID: " + Geoff.getClientID() + " Marketing Employee: " + geoffEmployeeList);
        System.out.println("Client ID: " + Amanda.getClientID() + " Marketing Employee: " + amandaEmployeeList);

    }
}
