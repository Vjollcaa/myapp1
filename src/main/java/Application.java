import com.ucx.training.sessions.myapp1.PersistenceFactory;
import com.ucx.training.sessions.myapp1.businesslogic.*;
import com.ucx.training.sessions.myapp1.persistence.InMemoryDB;
import com.ucx.training.sessions.myapp1.persistence.InMemoryDBImpl;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Address address1 = new Address("Kosovo", "Kosovo", "Prishtina", "1st street", 10000);
        Employee employee1 = new Employee("Steve", "Bald", Position.QA, Gender.MALE, address1);
        employees.add(employee1);
        Double salaryValue = employee1.calculateWage(40.0);
        System.out.println("The salary of " + employee1.getFirstName() + " is " + salaryValue);

        Address address2 = new Address("Kosovo", "Kosovo", "Prizren", "2d street", 20000);
        Employee employee2 = new Employee("Jane", "Watson", Position.PM, Gender.FEMALE, address2);
        employees.add(employee2);
        Double salaryValue2 = employee2.calculateWage(37.0);
        System.out.println("The salary of " + employee2.getFirstName() + " is " + salaryValue2);

        Address address3 = new Address("US", "Illinois", "Chicago", "3rd street", 6768);
        Employee employee3 = new Employee("Mary", "Jones", Position.PROGRAMMER, Gender.FEMALE, address3);
        employees.add(employee3);
        Double salaryValue3 = employee3.calculateWage(30.0);
        System.out.println("The salary of " + employee3.getFirstName() + " is " + salaryValue3);

        Address address4 = new Address("US", "Arizona", "Mesa", "4rd street", 6765);
        Employee employee4 = new Employee("Kimberly", "Doe", Position.DEVOPS, Gender.FEMALE, address4);
        employees.add(employee4);
        Double salaryValue4 = employee4.calculateWage(30.0);
        System.out.println("The salary of " + employee4.getFirstName() + " is " + salaryValue4);


        Company company = new Company(1, "Best Company", employees);
        //Company company1 = new Company(2, "Second Company", employees);

        //Save Company to InMemoryDB
        InMemoryDB db = PersistenceFactory.getInMemoryDBInstance();
        db.createOrUpdate(company);
        //db.createOrUpdate(company1);

        //Retrieve a company from DB
        Company foundCompany = db.findById(1);
        System.out.println("Company ID: " + foundCompany.getId() + " Company Name: " + foundCompany.getName() + " Nr. of employees: " + foundCompany.getEmployees().size());


        //Remove a company from DB
        Company deletedCompany = db.findById(1);
        System.out.println(deletedCompany.getId());

    }
}
