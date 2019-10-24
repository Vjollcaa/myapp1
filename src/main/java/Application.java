import com.ucx.training.sessions.myapp1.PersistenceFactory;
import com.ucx.training.sessions.myapp1.businesslogic.Address;
import com.ucx.training.sessions.myapp1.businesslogic.Company;
import com.ucx.training.sessions.myapp1.businesslogic.Employee;
import com.ucx.training.sessions.myapp1.businesslogic.Gender;
import com.ucx.training.sessions.myapp1.persistence.InMemoryDB;
import com.ucx.training.sessions.myapp1.persistence.InMemoryDBImpl;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Address address1 = new Address("Kosovo", "Kosovo", "Prishtina", "1st street", 10000);
        Employee employee1 = new Employee("Steve", "Bald", "QA", Gender.MALE, address1);
        employees.add(employee1);

        Address address2 = new Address("Kosovo", "Kosovo", "Prizren", "2d street", 20000);
        Employee employee2 = new Employee("Jane", "Watson", "PM", Gender.FEMALE, address2);
        employees.add(employee2);

        Address address3 = new Address("US", "Illinois", "Chicago", "3rd street", 6768);
        Employee employee3 = new Employee("Mary", "Jones", "HR", Gender.FEMALE, address3);
        employees.add(employee3);

        Company company = new Company(1, "Best Company", employees);
        //Company company1 = new Company(2, "Second Company", employees);

        //Save Company to InMemoryDB
        InMemoryDB db = PersistenceFactory.getInMemoryDBInstance();
        db.createOrUpdate(company);
        //db.createOrUpdate(company1);

        //Retrieve a company from DB
        Company foundCompany = db.findById(1);
        System.out.println("Company ID: " + foundCompany.getId() + "Company Name: " + foundCompany.getName() + "Nr. of employees: " + foundCompany.getEmployees().size());

        //Remove a company from DB
        Company deletedCompany = db.findById(1);
        System.out.println(deletedCompany.getId());

    }
}
