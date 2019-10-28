package com.ucx.training.sessions.myapp1;

import com.ucx.training.sessions.myapp1.businesslogic.Company;
import com.ucx.training.sessions.myapp1.persistence.InMemoryDBImpl;
import org.junit.Test;
import static org.junit.Assert.*;

public class InMemoryDBImplTest {

    @Test
    public void testCreate(){
        Company company = MockData.getCompany();
        InMemoryDBImpl db = new InMemoryDBImpl();
        db.createOrUpdate(company);

        Company foundCompany = db.findById(company.getId());
        Company deletedCompany = db.remove(company.getId());
        assertNotNull(foundCompany);
        assertEquals(company.getId(), foundCompany.getId());
        assertEquals(4, foundCompany.getEmployees().size());
    }

    @Test (expected = RuntimeException.class)
    public void testCreate_whenCompanyIsNull(){
        InMemoryDBImpl db = new InMemoryDBImpl();
        db.createOrUpdate(null);
    }

    @Test(expected = RuntimeException.class)
    public void testFind_whenIdIsNull(){
        InMemoryDBImpl db = new InMemoryDBImpl();
        db.findById(null);
    }
    @Test (expected = RuntimeException.class)
    public void testRemove_whenIdIsNull(){
        InMemoryDBImpl db = new InMemoryDBImpl();
        db.remove(null);
    }

}
