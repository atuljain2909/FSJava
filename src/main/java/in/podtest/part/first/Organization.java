package in.podtest.part.first;

// Question #1: creation of classes
public class Organization {

    int noOfEmployees;
    Employee[] employees;

    Organization(int n){
        noOfEmployees=5;
        employees = new Employee[noOfEmployees];
    }

    // Question #4.1
    void printAllEmployeeDetails(){
        // Used advanced for loop here
        for(Employee e:employees){
            e.getDetails();
        }
    }
}
