package com.ucx.training.sessions.myapp1.persistence;

import com.ucx.training.sessions.myapp1.businesslogic.Company;
import java.util.Map;

public class InMemoryDB {
    private Map<Integer, Company> storage;

    public InMemoryDB(){

    }

    public void createOrUpdate(Company company){
        if(company == null) throw new RuntimeException("Company cannot be null!");
        storage.put(company.getId(), company);
    }

    public Company findById(Integer id){
        if(id == null) throw new RuntimeException("ID cannot be null!");
        return storage.get(id);
    }

    public void remove(Integer id){
        storage.get(id);
    }
}
