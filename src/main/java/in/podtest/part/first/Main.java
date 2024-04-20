package in.podtest.part.first;

// Question #1: creation of classes
public class Main {
    public static void main(String[] args) {

        // Question #2
        Organization PodTest = new Organization(5);
        PodTest.employees[0]=new Employee("Engineer", 21, 25000.00f, 101, true);
        PodTest.employees[1]=new Employee("Sr. Engineer", 22, 50000.00f, 102, true);
        PodTest.employees[2]=new Employee("Lead Engineer", 23, 75000.00f, 103, true);
        PodTest.employees[3]=new Employee("Principal Engineer", 24, 100000.00f, 104, true);
        PodTest.employees[4]=new Employee("Manager", 25, 150000.00f, 105, true);

        // Question #3
        Admin Rohan = new Admin();

        // Question #5
        PodTest.employees[4].isActive=false;

        // Question #6
        System.out.println("--------------------------------");//extra line to make demarcation in the console output to make it more readable, purely optional though!
        System.out.println("Total budget required for 'PodTest' organization is: " + Rohan.getTotalRequiredBudget(PodTest));
        System.out.println("Total tax collected by 'PodTest' organization is: " + Rohan.getTotalTaxCollected(PodTest));
        System.out.println("--------------------------------");//extra line to make demarcation in the console output to make it more readable, purely optional though!
        System.out.println("Tax details of each employee are as follows:");
        Rohan.printTaxAmountPerEmployee(PodTest);

        PodTest.printAllEmployeeDetails();

        PodTest.employees[0].getDetails();
        System.out.println("PodTest's 1st employee's tax amount is: " + PodTest.employees[0].getTaxAmountToBePaid());
        System.out.println("PodTest's 1st employee's monthly salary is (even though this is confidential information, but there's a way to expose it! :-P): " + PodTest.employees[0].getEmployeeSalary());

        PodTest.employees[1].getDetails();
        System.out.println("PodTest's 2nd employee's tax amount is: " + PodTest.employees[1].getTaxAmountToBePaid());
        System.out.println("PodTest's 2nd employee's monthly salary is (even though this is confidential information, but there's a way to expose it! :-P): " + PodTest.employees[1].getEmployeeSalary());

        PodTest.employees[2].getDetails();
        System.out.println("PodTest's 3rd employee's tax amount is: " + PodTest.employees[2].getTaxAmountToBePaid());
        System.out.println("PodTest's 3rd employee's monthly salary is (even though this is confidential information, but there's a way to expose it! :-P): " + PodTest.employees[2].getEmployeeSalary());

        PodTest.employees[3].getDetails();
        System.out.println("PodTest's 4th employee's tax amount is: " + PodTest.employees[3].getTaxAmountToBePaid());
        System.out.println("PodTest's 4th employee's monthly salary is (even though this is confidential information, but there's a way to expose it! :-P): " + PodTest.employees[3].getEmployeeSalary());

        PodTest.employees[4].getDetails();
        System.out.println("PodTest's 5th employee's tax amount is: " + PodTest.employees[4].getTaxAmountToBePaid());
        System.out.println("PodTest's 5th employee's monthly salary is (even though this is confidential information, but there's a way to expose it! :-P): " + PodTest.employees[4].getEmployeeSalary());
        System.out.println("--------------------------------");//extra line to make demarcation in the console output to make it more readable, purely optional though!
    }
}
