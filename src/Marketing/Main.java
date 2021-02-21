package Marketing;

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

      /*  String johnEmployeeText = "";

        for (int i = 0; i < John.getEmployees().size(); i++){
            johnEmployeeText = johnEmployeeText + John.getEmployees().get(i).getEmployeeName();

        }*/

        ArrayList<String> employeeList = John.getEmployees().stream().map(Employee::getEmployeeName).collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Marketing Manager: " + John.getEmployeeName() + ". " + "Employees:" + employeeList );

    }
}
