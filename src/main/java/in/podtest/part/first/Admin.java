package in.podtest.part.first;

// Question #1: creation of classes
public class Admin {

    String role;

    // Question #4.3
    float getTotalRequiredBudget(Organization organization){
        float budget=0.0f;
        // Used advanced for loop here
        for(Employee e: organization.employees){
            if (e.isActive)
                budget+=e.getEmployeeSalary();
        }
        return budget;
    }

    // Question #4.3
    float getTotalTaxCollected(Organization organization){
        float tax=0.0f;
        // Used advanced for loop here
        for(Employee e: organization.employees){
            if (e.isActive)
                tax+=e.getTaxAmountToBePaid();
        }
        return tax;

    }

    // Question #4.3
    void printTaxAmountPerEmployee(Organization organization){

            // Used classic for loop here
            for (int i=0; i<organization.noOfEmployees;i++){
                if (organization.employees[i].isActive)
                    System.out.println(i+1 + ". " + organization.employees[i].name + "'s payable tax amount is: " + organization.employees[i].getTaxAmountToBePaid());
        }
    }
}
