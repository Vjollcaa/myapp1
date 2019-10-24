package com.ucx.training.sessions.myapp1.persistence;

import com.ucx.training.sessions.myapp1.businesslogic.Company;

public interface InMemoryDB {
    void createOrUpdate(Company company);
    Company findById(Integer id);
    void remove(Integer id);
}
